<%@ page import="com.lxisoft.model.*" %>
<%@ page import="java.util.List" %>

    <style>
        .player-entry img {
            width: 25px;
            height: 25px;
            border-radius: 50%;
        }
        .dice-button {
            padding: 5px 10px;
            background-color: white;
            color: black;
            border: none;
            border-radius: 5px;
            cursor: pointer;
        }
        .dice-button:hover {
            background-color: lightgray;
        }
        .dice-button-enabled {
            background-color: green;
        }
        .dice-button-disabled {
            background-color: red;
            cursor: not-allowed;
        }
        table {
			width: 50%;
			border-collapse: collapse;
			margin-left: 0;
			margin-top: 20px;
			float: left;
		}
        th, td {
            padding: 10px;
            text-align: center;
            width: 200px;
            height: 50px;
        }
    </style>

    <%
        Forest f = (Forest) application.getAttribute("forest");
        if (f == null) {
            f = new Forest();
        }
        List<Players> players = f.getPlayer();
    %>
    <h3>PLAYERS IN THE GAME:</h3>
    <table>
        <tr>
            <th>ICONS</th>
            <th>NAMES</th>
        </tr>
            <%
        if (players.isEmpty()) {
            out.println("NO PLAYERS WERE ADDED");
        } 
        else {
            for (Players player : players) {
        %>
        <tr class="player-entry">
            <td><img src="<%= player.getIcon() %>" alt="Player Icon"></td>
            <td><%= player.getName() %></td>
        </tr>
        <%
            }
        }
        %>
    </table>