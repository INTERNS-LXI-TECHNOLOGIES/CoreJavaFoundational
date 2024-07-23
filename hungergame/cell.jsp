<%@ page import="com.lxi.hungergame.forest.Forest" %>
<%@ page import="com.lxi.hungergame.cell.Cell" %>
<%@ page import="com.lxi.hungergame.player.Player" %>
<%@ page import="com.lxi.hungergame.food.Food" %>
<%@ page import="com.lxi.hungergame.hunder.Hunder" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<html>
<head>
    <title>Forest Game</title>
    <style>
        /* Flex container for tables */
        .container {
            display: flex;
            justify-content: space-between;
            padding: 10px;
        }
        
        /* Styles for cell and player tables */
        .cell-table, .player-table {
            flex: 1;
            margin: 0 10px;
        }
        
        table {
            border-collapse: collapse;
            width: 100%;
        }
        
        td {
            border: 6px solid #555;
            width: 50px;
            height: 50px;
            text-align: center;
            position: relative;
        }
        
        img {
            max-width: 100%;
            max-height: 100%;
        }
        
        .icon {
            position: absolute;
            width: 40%;
            max-width: 50px;
            height: auto;
            object-fit: cover;
            opacity: 0.8;
            border: 2px solid #fff;
            border-radius: 50%;
            box-shadow: 0 0 5px rgba(0, 0, 0, 0.3);
        }
        
        .icon.player {
            bottom: 5px;
            right: 5px;
        }
        
        .icon.food {
            top: 5px;
            left: 5px;
        }
        
        .icon.hunter {
            top: 30px;
            left: 30px;
        }
        
        .message {
            margin: 20px;
            padding: 10px;
            background-color: #f0f0f0;
            border: 1px solid #ccc;
            border-radius: 10px;
            text-align: center;
        }
    </style>
</head>
<body>
    <%
    Forest f = (Forest) application.getAttribute("forest");
    if (f != null && f.getActivePlayer() == null && !f.getPlayers().isEmpty()) {
        f.setActivePlayer(f.getPlayers().get(0)); 
    }

    if (request.getParameter("start") != null) {
        f.gameLoop();
       
        if (!f.getWinners().isEmpty()) {
            for (Player winner : f.getWinners()) {
                %>
                <div class="message">
                    <img src="<%= winner.getPlayerimg() %>" alt="Player Image" width="50" height="50">
                    <%= winner.getName() %> WINNER 
                </div>
                <%
            }
        }

        if (f.getPlayers().size() == 1) {
            f.getWinners().add(f.getPlayers().get(0));
            response.sendRedirect("result.jsp");
        }
    }
    %>

    <div class="container">
        <div class="cell-table">
            <table border="1">
                <tbody>
                <%
                for (int i = 0; i < 10; i++) {
                %>
                <tr>
                <%
                    for (int j = 0; j < 10; j++) {
                %>
                <td>
                    <img src="<%= f.getCell()[i][j].getBgimg() %>" alt="Cell Background"/>
                    <%
                    if (!f.getCell()[i][j].getGamers().isEmpty()) {
                        for (Player player : f.getCell()[i][j].getGamers()) {
                    %>
                    <img class="icon player" src="<%= player.getPlayerimg() %>" alt="Player Image"/>
                    <%
                        }
                    }
                    if (!f.getCell()[i][j].getHunder().isEmpty()) {
                    %>
                    <img class="icon hunter" src="<%= f.getCell()[i][j].getHunder().get(0).getHundericon() %>" alt="Hunter Icon"/>
                    <%
                    }
                    if (!f.getCell()[i][j].getFoods().isEmpty()) {
                    %>
                    <img class="icon food" src="<%= f.getCell()[i][j].getFoods().get(0).getFoodimg() %>" alt="Food Icon"/>
                    <%
                    }
                    %>
                </td>
                <%
                    }
                %>
                </tr>
                <%
                }
                %>
                </tbody>
            </table>
        </div>

        <div class="player-table">
            <h2>Players List</h2>
            <table border="1">
                <thead>
                    <tr>
                        <th>Name</th>
                        <th>Image</th>
                        <th>Cell Position</th>
                        <th>Hunger Level</th>
                        <th>Dice Number</th>
                        <th>Action</th>
                    </tr>
                </thead>
                <tbody>
                <%
                for (Player player : f.getPlayers()) {
                %>
                <tr>
                    <td><%= player.getName() %></td>
                    <td><img src="<%= player.getPlayerimg() %>" alt="Player Image" width="100" height="100"></td>
                    <td><%= player.getCellposition() %></td>
                    <td><%= player.getHungerlevel() %></td>
                    <td><%= player.getResult() %></td>
                    <td>
                        <form method="post" action="cell.jsp">
                            <input type="submit" name="start" <%= player.equals(f.getActivePlayer()) && player.getCellposition() < 100 ? "" : "disabled" %> value="Roll Dice"/>
                        </form>
                    </td>
                </tr>
                <%
                }
                %>
                </tbody>
            </table>
        </div>
    </div>
</body>
</html>
