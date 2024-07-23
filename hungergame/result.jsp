<%@ page import="com.lxi.hungergame.forest.Forest" %>
<%@ page import="com.lxi.hungergame.player.Player" %>
<%@ page import="java.util.List" %>
<html>
<head>
    <title>Game Result</title>
</head>
<body>
    <% 
    Forest f = (Forest) application.getAttribute("forest");
    List<Player> winners = f.getWinners(); // Retrieve winners list
    %>

    <table>
        <tr>
            <th>RANK</th>
            <th>PLAYER</th>
        </tr>
        <% int rank = 1;
        for (Player winner : winners) { %>
            <tr>
                <td><%= rank %></td>
                <td>
                    <img src="<%= winner.getPlayerimg() %>" alt="Player Image" width="50" height="50">
                    <%= winner.getName() %>
                </td>
            </tr>
            <% rank++;
        } %>
    </table>
</body>
</html>
