<%@ page import ="com.lxi.hungergame.model.*" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Players Grid</title>
    <style>
        * {
            box-sizing: border-box;
        }

        body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            margin: 0;
            padding: 0;
            display: flex;
            justify-content: center;
            align-items: flex-start;
            min-height: 100vh;
            background: linear-gradient(45deg, #2c3e50, #3498db);
            color: #fff;
            overflow: hidden; /* Ensure no scrollbars appear */
        }

        .table-container {
            display: flex;
            justify-content: space-around;
            width: 100%;
        }

        table {
            border-collapse: collapse;
            width: 40%; /* Adjust size to fit better */
            max-width: 500px; /* Adjust to fit the screen size */
            margin: 20px; /* Space around tables */
            background: rgba(0, 0, 0, 0.6);
            border-radius: 10px;
            box-shadow: 0 8px 16px rgba(0, 0, 0, 0.3);
        }

        th, td {
            border: 1px solid #ddd;
            padding: 8px;
            text-align: center;
        }

        th {
            background-color: #34495e;
            color: #fff;
        }

        td {
            background-color: #ecf0f1;
            color: #2c3e50;
        }

        .grid-table {
            width: 40%; /* Adjust size to fit better */
            max-width: 500px; /* Adjust to fit the screen size */
        }

        .grid-cell {
            border: 1px solid #ddd;
            width: 30px; /* Adjust cell width */
            height: 30px; /* Adjust cell height */
            position: relative;
            text-align: center;
            vertical-align: middle;
            background-color: #ecf0f1;
        }

        img {
            max-width: 100%;
            height: auto;
        }

        .player-icon {
            width: 25px; /* Adjust player image size */
            height: 25px; /* Adjust player image size */
            border-radius: 50%;
            border: 2px solid #ddd;
        }

        .icons-container {
            display: flex;
            position: absolute;
        }

        .food-icons {
            top: 5px;
            right: 5px;
            flex-direction: row-reverse;
        }

        .hunter-icons {
            bottom: 5px;
            left: 5px;
            flex-direction: row;
        }

        .food-icon, .hunter-icon {
            width: 15px; /* Adjust size for smaller cells */
            height: 15px; /* Adjust size for smaller cells */
            background-size: cover;
            background-repeat: no-repeat;
            border-radius: 50%;
            margin-left: 2px; /* Spacing between icons */
            margin-right: 2px; /* Spacing between icons */
        }

        .food-icon {
            border: 2px solid #ffdd57;
        }

        .hunter-icon {
            border: 2px solid #ff4b4b;
        }

        .message {
            font-size: 1.2rem;
            margin-bottom: 20px;
            background: rgba(231, 76, 60, 0.8);
            padding: 10px 20px;
            border-radius: 5px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.3);
        }
    </style>
</head>
<body>
    <% 
        Forest forest = (Forest) application.getAttribute("f");
        if (forest != null && forest.getActivePlayer() == null && !forest.getGamers().isEmpty()) {
            forest.setActivePlayer(forest.getGamers().get(0)); 
        }
        boolean gameContinues = true;
        String name;
    

        
        if (request.getParameter("runGameLoop") != null) {
            name = forest.getActivePlayer().getName();
            
            gameContinues = forest.gameLoop();
            
            if(!forest.getWinners().isEmpty()){
                for(Player winner : forest.getWinners()){
                    %>
                    <div class="message">
                    <img src="<%= winner.getImage() %>" alt="Player Image" width="50" height="50">
                     <%= winner.getName() %> WINNER 
                    </div>
                <% } 
                }
            
            if(forest.getGamers().size() == 1){
                response.sendRedirect("Result.jsp");
            }
            
            if (!gameContinues) { 
                %>
                    <div class="message">
                        <%= name %> has been killed!
                    </div>
                <% } 
            
        } %>

      

    <div class="table-container">
        <table>
            <tr>
                <th>Name</th>
                <th>Image</th>
                <th>Cell Count</th>
                <th>Hunger Level</th>
                <th>Dice Value</th>
                <th>Action</th>
            </tr>
            <form action="Forest.jsp">
                <% for (Player player : forest.getGamers()) { %>
                    <tr>
                        <td><%= player.getName() %></td>
                        <td><img src="<%= player.getImage() %>" alt="Player Image" width="50" height="50"></td>
                        <td><%= player.getCellCount() %></td>
                        <td><%= player.getHungerLevel() %></td> <!-- Display hunger level -->
                        <td><%= player.getResult() %></td>
                        <td>
                            <input type="submit" name="runGameLoop" <%= player.equals(forest.getActivePlayer()) ? "" : "disabled" %> value="Roll Dice"/>
                        </td>
                    </tr>
                <% } %>
            </form>
        </table>

        <table class="grid-table">
            <% for (int i = 0; i < 10; i++) { %>
                <tr>
                    <% for (int j = 0; j < 10; j++) { %>
                        <td class="grid-cell">
                            <img src="<%= forest.getCell()[i][j].getBgImage() %>"/>
                            <% if (!forest.getCell()[i][j].getPlayers().isEmpty()) { 
                                for (Player player : forest.getCell()[i][j].getPlayers()) { %>
                                    <img class="player-icon" src="<%= player.getImage() %>"/>
                                <% }
                            } %>
                            <% if (!forest.getCell()[i][j].getFoods().isEmpty()) { %>
                                <div class="icons-container food-icons">
                                    <% for (Food food : forest.getCell()[i][j].getFoods()) { %>
                                        <img class="food-icon" src="<%= food.getImage() %>"/>
                                    <% } %>
                                </div>
                            <% } %>
                            <% if (!forest.getCell()[i][j].getHunters().isEmpty()) { %>
                                <div class="icons-container hunter-icons">
                                    <% for (Hunter hunter : forest.getCell()[i][j].getHunters()) { %>
                                        <img class="hunter-icon" src="<%= hunter.getImage() %>"/>
                                    <% } %>
                                </div>
                            <% } %>
                        </td>
                    <% } %>
                </tr>
            <% } %>
        </table>
    </div>
</body>
</html> 