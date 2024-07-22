<%@ page import="com.lxisoft.hungergame.forest.*" %>
<%@ page import="java.util.List" %>
<html>
<head>
    <title> WINNER List</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f0f0f0;
            color: #333;
            margin: 0;
            padding: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }
        table {
            width: 50%;
            margin: 20px auto;
            border-collapse: collapse;
            box-shadow: 0 2px 10px rgba(0,0,0,0.1);
            background-color: #fff;
        }
        th, td {
            padding: 12px;
            text-align: left;
            border-bottom: 1px solid #ddd;
        }
        th {
            background-color: #4CAF50;
            color: white;
        }
        tr:hover {
            background-color: #f1f1f1;
        }
        img {
            border-radius: 50%;
            margin-right: 10px;
        }
        .winner-name {
            vertical-align: middle;
        }
    </style>
</head>
<body>
    <h1>Winner List</h1>
    <% Forest f = (Forest) application.getAttribute("forest"); %>

    <table>
        <tr>
            <th>RANK</th>
            <th>PLAYER</th>
        </tr>

        <% int rank = 1;
        for (Player winner : f.getWinners()) { %>
            <tr>
                <td><%= rank %></td>
                <td>
                    <img src="<%= winner.getPLayericon() %>" alt="Player Image" width="50" height="50">
                    <span class="winner-name"><%= winner.getName() %></span>
                </td>
            </tr>
            <% rank++;
        } %>
    </table>
</body>
</html>
