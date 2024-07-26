<%@ page import="com.lxisoft.hungergame.forest.*" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Hunger Game - Add Player</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f0f0f0;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
        }
        
        .container {
            background-color: #fff;
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
            text-align: center;
            max-width: 400px;
            width: 100%;
        }
        
        h2 {
            color: #333;
            font-size: 24px;
            margin-bottom: 20px;
        }
        
        p {
            color: #666;
            font-size: 16px;
            margin-bottom: 15px;
        }
        
        .success-message {
            color: #4CAF50;
            font-weight: bold;
            margin-bottom: 15px;
        }
        
        .game-link {
            display: inline-block;
            background-color: #4CAF50;
            color: white;
            padding: 12px 20px;
            text-decoration: none;
            border-radius: 5px;
            transition: background-color 0.3s;
        }
        
        .game-link:hover {
            background-color: #45a049;
        }
    </style>
</head>
<body>
    <div class="container">
        <%-- Java Code Starts --%>
        <%
        String name = request.getParameter("name");
        Forest f = (Forest) application.getAttribute("forest");

        if (f == null) {
        %>
            <h2>Game not Started</h2>
        <%
        } else {
            f.getGamers().add(new Player(name, "/Hungergame/images/gamer" + f.getGamers().size() + ".jpg"));
            //f.setTotalPlayers(f.getGamers().size());
        %>
            <h2>Player added successfully</h2>
            <a href="cell.jsp" class="game-link">Start Game</a>
        <%
        }
        %>
        <%-- Java Code Ends --%>
    </div>
</body>
</html>
