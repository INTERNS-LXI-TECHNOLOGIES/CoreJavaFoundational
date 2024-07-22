<%@ page import="com.lxisoft.hungerGame.model.*" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>

<%
    String playerName = request.getParameter("playerName");
    Forest f = (Forest) application.getAttribute("forest");

    if (f == null) {
        f = new Forest();
        application.setAttribute("forest", f);
    }

    if (playerName != null && !playerName.isEmpty()) {
        f.createPlayers(playerName);
    }
%>

<!DOCTYPE html>
<html>
<head>
    <title>Players List</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: rgb(38, 35, 35);
            color: #333;
            margin: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            position: relative;
            height: 100vh;
        }
        .image-container {
            position: absolute;
            top: 0;
            left: 0;
            width: 100%;
            height: 100%;
            z-index: 1;
        }
        .image-container img {
            width: 100%;
            height: 100%;
            object-fit: cover;
        }
        table {
            border-collapse: collapse;
            width: 50%;
            margin-top: 0px;
            background-color: rgba(255, 255, 255, 0.7);
            position: relative;
            z-index: 2;
        }
        th, td {
            border: 8px solid rgba(38, 37, 37, 0.9);
            padding: 10px;
            text-align: center;
            height: 10px;
            width: 50%;
        }
        .start-button-container {
            position: absolute;
            bottom: 50px;
            left: 50%;
            transform: translateX(-50%);
            text-align: center;
            z-index: 3;
        }
        .start-button {
            background-color: #4CAF50;
            color: white;
            border: none;
            text-align: center;
            text-decoration: none;
            font-size: 20px;
            cursor: pointer;
            width: 200px;
            height: 50px;
            line-height: 50px;
        }
        .subtitles {
            position: absolute;
            bottom: 50px;
            left: 50%;
            transform: translateX(-50%);
            text-align: center;
            z-index: 3;
            color: white;
            font-size: 1.2em;
            margin-bottom: -30px;
        }
    </style>
</head>
<body>
    <div class="image-container">
        <img src="/HUNGERGAME/forestimage/img2.jpeg">
    </div>

    <table>
        <thead>
            <tr>
                <th>PLAYER NUMBER</th>
                <th>PLAYER NAME</th>
            </tr>
        </thead>
        <tbody>
            <%
                List<Players> players = f.getPlayers();
                int playerNumber = 1;
                for (Players player : players) {
                    if (player.getName() != null) {
            %>
            <tr>
                <td><%= playerNumber++ %></td>
                <td><%= player.getName() %></td>
            </tr>
            <%
                    }
                }
            %>
        </tbody>
    </table>

    <div class="start-button-container">
        <form action="forest.jsp" method="post">
            <button type="submit" class="start-button">Start Game</button>
        </form>
    </div>
</body>
</html>
