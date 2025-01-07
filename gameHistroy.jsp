<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Game History</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
    <div class="game-history">
        <h1>Your Game History</h1>
        <table>
            <thead>
                <tr>
                    <th>Game ID</th>
                    <th>Player 1</th>
                    <th>Player 2</th>
                    <th>Winner</th>
                    <th>Status</th>
                </tr>
            </thead>
            <tbody>
                <% 
                    List<GameSession> gameHistory = (List<GameSession>) request.getAttribute("gameHistory");
                    for (GameSession game : gameHistory) {
                %>
                    <tr>
                        <td><%= game.getGameId() %></td>
                        <td><%= game.getPlayer1() %></td>
                        <td><%= game.getPlayer2() %></td>
                        <td><%= game.getWinner() %></td>
                        <td><%= game.getStatus() %></td>
                    </tr>
                <% } %>
            </tbody>
        </table>
    </div>
</body>
</html>
