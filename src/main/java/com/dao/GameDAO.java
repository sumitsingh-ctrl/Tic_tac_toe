package com.dao;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.model.Game;

public class GameDAO {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/tictactoe";
    private static final String USER = "root";
    private static final String PASSWORD = "password";

    // Save a new game to the database
    public void saveGame(Game game) throws SQLException {
        String query = "INSERT INTO games (player_x, player_o, board_state, current_player, winner) VALUES (?, ?, ?, ?, ?)";
        try (Connection connection = DriverManager.getConnection(DB_URL, USER, PASSWORD);
             PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, game.getPlayerX());
            statement.setString(2, game.getPlayerO());
            statement.setString(3, game.getBoardState());
            statement.setString(4, game.getCurrentPlayer());
            statement.setString(5, game.getWinner());
            statement.executeUpdate();
        }
    }

    // Retrieve all games from the database
    public List<Game> getAllGames() throws SQLException {
        List<Game> games = new ArrayList<>();
        String query = "SELECT * FROM games";
        try (Connection connection = DriverManager.getConnection(DB_URL, USER, PASSWORD);
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(query)) {
            while (resultSet.next()) {
                Game game = new Game(
                        resultSet.getInt("id"),
                        resultSet.getString("player_x"),
                        resultSet.getString("player_o"),
                        resultSet.getString("board_state"),
                        resultSet.getString("current_player"),
                        resultSet.getString("winner")
                );
                games.add(game);
            }
        }
        return games;
    }

    // Retrieve a specific game by ID
    public Game getGameById(int id) throws SQLException {
        String query = "SELECT * FROM games WHERE id = ?";
        try (Connection connection = DriverManager.getConnection(DB_URL, USER, PASSWORD);
             PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, id);
            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    return new Game(
                            resultSet.getInt("id"),
                            resultSet.getString("player_x"),
                            resultSet.getString("player_o"),
                            resultSet.getString("board_state"),
                            resultSet.getString("current_player"),
                            resultSet.getString("winner")
                    );
                }
            }
        }
        return null;
    }
}
