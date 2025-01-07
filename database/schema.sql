-- schema.sql
-- This script will create the necessary tables for the Tic Tac Toe game

CREATE DATABASE IF NOT EXISTS TicTacToe;

USE TicTacToe;

-- Create a table for users who will play the game
CREATE TABLE Users (
    id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(50) NOT NULL,
    email VARCHAR(100) NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL
);

-- Create a table to track game sessions
CREATE TABLE GameSessions (
    game_id INT AUTO_INCREMENT PRIMARY KEY,
    player1_id INT NOT NULL,
    player2_id INT,
    winner_id INT,
    game_status VARCHAR(50) DEFAULT 'In Progress', -- e.g., 'In Progress', 'Completed'
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (player1_id) REFERENCES Users(id),
    FOREIGN KEY (player2_id) REFERENCES Users(id),
    FOREIGN KEY (winner_id) REFERENCES Users(id)
);

-- Create a table to track moves made during the game
CREATE TABLE GameMoves (
    move_id INT AUTO_INCREMENT PRIMARY KEY,
    game_id INT NOT NULL,
    player_id INT NOT NULL,
    row INT NOT NULL,
    col INT NOT NULL,
    move_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (game_id) REFERENCES GameSessions(game_id),
    FOREIGN KEY (player_id) REFERENCES Users(id)
);
