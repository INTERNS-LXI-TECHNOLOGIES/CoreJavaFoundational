<%@ page import="com.lxisoft.hungerGame.model.*" %>
<%@ page import="java.util.*" %>

<html>
<head>
    <style>
        body {
            background-image: url('/hungerGame/HungerGame-img/icon/winnerPage.jpg');
            background-size: cover;
            background-position: center;
            height: 100vh;
            margin: 0;
            display: flex;
            justify-content: center;
            align-items: center;
        }
        .winner-table {
            background-color: lightblue;
            border-radius: 5px;
            padding: 10px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.5);
            text-align: center;
        }
        th, td {
            padding: 10px;
            border: 1px solid #ddd;
        }
        th, tr {
            background-color: lightblue;
        }
        .winner-icon {
            width: 50px;
            height: 50px;
            border-radius: 50%;
            object-fit: cover;
            border: 2px solid #ddd;
            box-shadow: 0 0 5px rgba(0, 0, 0, 0.3);
        }

    </style>
</head>
<body>
<%
    Forest f = (Forest) application.getAttribute("forest");
    List<Players> winners = f.getWinnersOfGame();
%>
<div>
    <table class="winner-table">
        <tr>
            <th>POSITION</th>
            <th>ICON</th>
            <th>WINNERS</th>
        </tr>
        <% 
        int position = 1;
        for (Players winner : winners) { 
        %>
        <tr>
            <td><%= position++ %></td>
            <td><img src="<%= winner.getIcon() %>" class="winner-icon"></td>
            <td><%= winner.getName() %></td>
        </tr>
        <% } %>
    </table>
</div>
</body>
</html>
