<%@ page import="com.lxisoft.hungergame.forest.*"%>
<%@ page import="java.util.List, java.util.ArrayList" %>
<html>
    <head>
        <title>Game Result</title>
    </head>
    <body>
        <% Forest f=(Forest) application.getAttribute("forest"); %>
        <table>
            <tr>
                <th>RANK</th>
                <th>PLAYER</th>
            </tr>
            <% int rank=1;
            for(Player winners:f.getWinners()){ %>
                <tr>
                    <td><%= rank %></td>
                    <td>
                    <img src="<%= winners.getPlayerImg() %>" alt="Player Image" width="50" height="50">
                    <%= winners.getName() %>
                </td>
                
            </tr>
            <% rank++;
        } %>
    </table>
</body>
</html>