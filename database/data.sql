-- data.sql
-- Insert sample users

INSERT INTO Users (username, email, password) VALUES ('player1', 'player1@example.com', 'password123');
INSERT INTO Users (username, email, password) VALUES ('player2', 'player2@example.com', 'password123');

-- Insert a sample game session
INSERT INTO GameSessions (player1_id, player2_id, winner_id, game_status)
VALUES (1, 2, 1, 'Completed');  -- Player 1 wins

-- Insert some game moves
INSERT INTO GameMoves (game_id, player_id, row, col)
VALUES (1, 1, 0, 0),  -- Player 1 moves at (0, 0)
       (1, 2, 0, 1),  -- Player 2 moves at (0, 1)
       (1, 1, 1, 1),  -- Player 1 moves at (1, 1)
       (1, 2, 1, 2),  -- Player 2 moves at (1, 2)
       (1, 1, 2, 2);  -- Player 1 moves at (2, 2) and wins
