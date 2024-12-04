package com.model;


public class Game {
    private int id;
    private String playerX;
    private String playerO;
    private String boardState; // Represented as a string (e.g., "XO_XO__X_")
    private String currentPlayer; // "X" or "O"
    private String winner; // "X", "O", or "DRAW"

    // Constructors
    public Game() {}

    public Game(int id, String playerX, String playerO, String boardState, String currentPlayer, String winner) {
        this.id = id;
        this.playerX = playerX;
        this.playerO = playerO;
        this.boardState = boardState;
        this.currentPlayer = currentPlayer;
        this.winner = winner;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlayerX() {
        return playerX;
    }

    public void setPlayerX(String playerX) {
        this.playerX = playerX;
    }

    public String getPlayerO() {
        return playerO;
    }

    public void setPlayerO(String playerO) {
        this.playerO = playerO;
    }

    public String getBoardState() {
        return boardState;
    }

    public void setBoardState(String boardState) {
        this.boardState = boardState;
    }

    public String getCurrentPlayer() {
        return currentPlayer;
    }

    public void setCurrentPlayer(String currentPlayer) {
        this.currentPlayer = currentPlayer;
    }

    public String getWinner() {
        return winner;
    }

    public void setWinner(String winner) {
        this.winner = winner;
    }
}
