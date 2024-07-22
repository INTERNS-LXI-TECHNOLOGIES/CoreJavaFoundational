<%@ page import="com.lxisoft.hungergame.forest.*" %>
<html>
<head>
    <title>Enter Name</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            background-image: url('path/to/your/background.jpg');
            background-size: cover;
            background-position: center;
            color: #ffffff;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }
        .container {
            background: rgba(0, 0, 0, 0.8);
            padding: 40px;
            border-radius: 15px;
            max-width: 400px;
            width: 100%;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.3);
        }
        h1 {
            text-align: center;
            margin-bottom: 20px;
            font-size: 2em;
        }
        form {
            display: flex;
            flex-direction: column;
            margin-bottom: 20px;
        }
        label {
            margin-bottom: 10px;
            font-size: 1.2em;
        }
        input[type="text"] {
            padding: 10px;
            font-size: 1em;
            border-radius: 5px;
            border: 1px solid #ddd;
            margin-bottom: 20px;
        }
        button, input[type="submit"] {
            padding: 10px;
            background-color: #4CAF50;
            color: white;
            border: none;
            font-size: 1em;
            cursor: pointer;
            border-radius: 5px;
        }
        button:hover, input[type="submit"]:hover {
            background-color: #45a049;
        }
        .player-list {
            margin-top: 20px;
        }
        .player-list h2 {
            text-align: center;
            font-size: 1.8em;
            margin-bottom: 20px;
        }
        .player {
            display: flex;
            align-items: center;
            margin-bottom: 10px;
            padding: 10px;
            background: rgba(255, 255, 255, 0.1);
            border-radius: 5px;
        }
        .player img {
            width: 50px;
            height: 50px;
            border-radius: 50%;
            margin-right: 10px;
        }
        .player p {
            margin: 0;
            font-size: 1.2em;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>Enter Your Name to Start the Game</h1>
        
        <form action="addplayer.jsp">
            <label for="name">Name:</label>
            <input type="text" id="name" name="name" required>
            <input type="submit" value="Submit">
        </form>

        <%
            String playerName = request.getParameter("name");
            Forest f = (Forest) application.getAttribute("forest");

            if (f == null) {
                out.println("<p>Admin has not started the game yet.</p>");
            } else {
                boolean playerExists = false;
                for (Player player : f.getGamers()) {
                    if (player.getName().equals(playerName)) {
                        playerExists = true;
                        break;
                    }
                }

                if (!playerExists && playerName != null && !playerName.trim().isEmpty()) {
                    f.getGamers().add(new Player(playerName, "/hungergame/images/P1.jpg"));
                    //f.setTotalplayers(f.getGamers().size());
                }
        %>
                <div class="player-list">
                    <h2>Player List</h2>
                    <%
                    for (Player player : f.getGamers()) {
                    %>
                        <div class="player">
                            <img src="<%= player.getPLayericon() %>" alt="Player Image">
                            <p><%= player.getName() %></p>
                        </div>
                    <%
                    }
                    %>
                </div>

                <form action="forestTable.jsp">
                    <input type="submit" value="Start Game">
                </form>
        <%
            }
        %>
    </div>
</body>
</html>
