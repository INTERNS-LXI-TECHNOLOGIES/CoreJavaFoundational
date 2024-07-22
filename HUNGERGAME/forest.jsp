<%@ page import="com.lxisoft.hungerGame.model.*" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<html>
<head>
<%
Forest f = (Forest) application.getAttribute("forest");
if (f == null) {
    f = new Forest();
    f.startMethods();
    application.setAttribute("forest", f);
}
%>
<style>
    body {
        font-family: 'Arial', sans-serif;
        color: #ecf0f1;
        display: flex;
        flex-direction: column;
        align-items: center;
        justify-content: center;
        height: 100vh;
        margin: 0;
        background: url('/HUNGERGAME/forestimage/img14.jpg') no-repeat center center fixed;
        background-size: cover;

    }
   

    .table-container1 {
        width: 30%;
        max-width: 600px;
        position: absolute;
        top: 20px;
        left: 20px;
        z-index: 10;
        background: rgba(44, 62, 80, 0.8);
        border-radius: 10px;

    }

    .table-container2 {
    width: 50%;
    display: flex;
    justify-content: center;
    background: rgba(44, 62, 80, 0.8);
    border-radius: 10px;
    position: absolute; /* Position the element absolutely */
    top: 60px; /* Adjust to move the element from the top */
    right: 20px; /* Adjust to move the element from the right */
}


    .table-container3 {
        width: 20%;
        max-width: 600px;
        position: absolute;
        top: 500px;
        left: 20px;
        z-index: 10;
        background: rgba(44, 62, 80, 0.8);
        border-radius: 10px;

    }

    table {
        width: 80%;
        border-collapse: collapse;
        margin-bottom: 20px;
    }

    th, td {
        width: 50px;
        height: 50px;
        text-align: center;
        border: 1px solid #7f8c8d;
        position: relative;
        padding: 10px;
        background: rgba(236, 240, 241, 0.2);
    }

    th {
        background: #2c3e50;
    }

    img {
        max-width: 100%;
        max-height: 100%;
    }

    .bg-image {
        position: absolute;
        bottom: 0;  
        left: 0;
        width: 40px;
        height: 40px;
        pointer-events: none;
    }
    

    .icon, .food-icon, .hunter-icon {
        position: absolute;
        bottom: 0;
        left: 0;
        width: 25px;
        height: 25px;
        pointer-events: none;
    }
    .player.icon {
    position: absolute;
    bottom: 0;
    left: 0;
    width: 25px;
    height: 25px;
    pointer-events: none;
    z-index: 10; /* Ensure player icons are on top */
}

    .palyer.icon.food-icon, .hunter-icon {
        bottom: 0;
        right: 0;
    }

    .hunter-icon {
        width: 15px;
        height: 15px;
    }

    .message {
        color: #e74c3c;
        font-size: 20px;
        margin-bottom: 20px;
        text-align: center;
    }

    input[type="submit"] {
        background-color: #e67e22;
        color: white;
        border: none;
        padding: 10px 20px;
        cursor: pointer;
        border-radius: 5px;
    }

    input[type="submit"]:disabled {
        background-color: #bdc3c7;
        cursor: not-allowed;
    }
</style>
</head>
<body>

   

<div class="table-container1">
    <%
    Players activePlayer = f.getActivePlayer();
    if (activePlayer == null && !f.getPlayers().isEmpty()) {
        f.setActivePlayer(f.getPlayers().get(0)); 
        activePlayer = f.getActivePlayer();
    }

    boolean gameContinues = true;
    if (request.getParameter("runGameLoop") != null) {
        gameContinues = f.gameloop();
    }
    %>

    <% if (!gameContinues) { %>
        <div class="message">
            <%= f.getActivePlayer().getName() %> has winner of the game.
            <% 
            f.getActivePlayer().setPlayerCellCount(0); 
            f.getActivePlayer().setPlayerHungerLevel(0); 
        %>
        <%
        if (f.getPlayers().size() == 1) {
            %>          
            <script>alert("GAME ENDED");</script>
            <%
        }
        %>
        </div>
    <% } %>
    
    <div class="table-container1">
        <table border="1">
            <tr>
                <th>ICONS</th>
                <th>Name</th>
                <th>Dice Result</th>
                <th>Cell Number</th>
                <th>HungerLevel</th>
                <th>Action</th>
            </tr>
            <% for (Players player : f.getPlayers()) { %>
                <tr>
                    <td><img class="icon" src="/HUNGERGAME/<%= player.getIcon() %>" alt="Player Icon" /></td>
                    <td><%= player.getName() %></td>
                    <td><%= player.getResult() %></td>
                    <td><%= player.getPlayerCellCount() %></td>
                    <td><%= player.getPlayerHungerLevel() %></td>

                    <td>
                        <form action="forest.jsp" method="post">
                            <input type="hidden" name="activePlayer" value="true"/>
                            <input type="submit" name="runGameLoop" <%= player.equals(f.getActivePlayer()) ? "" : "disabled" %> value="Roll Dice"/>
                        </form>
                    </td>
                </tr>
            <% } %>
        </table>
    </div>
</div>

<div class="table-container2">
    <table border="2">
        <%
        for (int i = 0; i < 10; i++) {
        %>
        <tr>
            <%
            for (int j = 0; j < 10; j++) {
                Cell cell = f.getCell()[i][j];
                List<Players> players = cell.getPlayers() ;
            %>
            <td>
                <img class="bg-image" src="<%= f.getCell()[i][j].getBgImage() %>" alt="Background" />
                <%
                if (!f.getCell()[i][j].getFoods().isEmpty()) {
                %>
                <img class="food-icon" src="/HUNGERGAME/<%= f.getCell()[i][j].getFoods().get(0).getIcon() %>" alt="Food icon" />
                <%
                }
                if (!f.getCell()[i][j].getHunter().isEmpty()) {
                %>
                <img class="hunter-icon" src="/HUNGERGAME/<%= f.getCell()[i][j].getHunter().get(0).getIcon() %>" alt="Hunter icon" />
                <%
                }
                %>
                <%
                for(Players player: players){
                %>
                <img class="palyer.icon" src="<%= player.getIcon() %>" alt="Player icon"/>
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
    </table>
</div>
<div class="table-container3">
    <%
    List<Players> winners = f.getWinnersOfGame();
    %>
    <table border="3">
        <tr>
            <th>Number</th>
            <th>Winners</th>
        </tr>
        <% 
        int position = 1;
        for (Players winner : winners) { 
        %>
        <tr>
            <td><%= position++ %></td>
            <td><%= winner.getName() %></td>
        </tr>
        <% } %>
    </table>

</div>
</body>
</html>
