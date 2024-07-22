<%@ page import="com.lxisoft.hungergame.forest.*" %>
<%@ page import="java.util.List" %>
<html>
<head>
    <title>Forest Grid</title>
    <style>
        table {
            border-collapse: collapse;
            width: 100%;
            transform: scale(0.51);
            transform-origin: center;
        }
        td {
            border: 6px solid #555;
            width: 50px;
            height: 50px;
            text-align: center;
            transform-origin: center;
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
        .icon.food {
            top: 5px;
            left: 5px;
        }
        .icon.hunter {
            top: 30px;
            left: 30px;
        }
        .player {
            position: absolute;
            bottom: 5px;
            right: 5px;
            width: 50px;
            height: 50px;
            border-radius: 50%;
            background-color: rgba(255, 255, 255, 0.8);
            display: flex;
            align-items: center;
            justify-content: center;
            font-size: 12px;
            color: black;
            text-align: center;
            padding: 2px;
        }
        .message {
            text-align: center;
            font-size: 1.5em;
            color: red;
        }
    </style>
    <script>
        function showMessage(message) {
            alert(message);
        }
    </script>
</head>
<body>
    <%
        Forest f = (Forest) application.getAttribute("forest");
        if (f != null && f.getActivePlayer() == null && !f.getGamers().isEmpty()) {
            f.setActivePlayer(f.getGamers().get(0));
        }
        boolean gameContinues = true;
        String killedPlayerName ;
        
        

        if (request.getParameter("dicerollAction") != null) {
            killedPlayerName = f.getActivePlayer().getName();
            gameContinues = f.gameLoop();

            // Check if active player has reached cell 100 and add to winners list
            

                if(!f.getWinners().isEmpty()){
                    for(Player winner : f.getWinners()){
                        %>
                        <div class="message">
                        <img src="<%= winner.getPLayericon() %>" alt="Player Image" width="50" height="50">
                         <%= winner.getName() %> WINNER 
                        </div>
                    <% } 
                    }
                

                    if(f.getGamers().size() == 1){
                        f.getWinners().add(f.getGamers().get(0));
                        response.sendRedirect("Result.jsp");

                    }

                
                if (!gameContinues) { 
                    %>
                        <div class="message">
                            <%= killedPlayerName %> has been killed!
                        </div>
                    <% } 
                
            } %>

    
        
    

    <h2>Players List</h2>
    <table border="1">
        <tr>
            <th>Name</th>
            <th>Image</th>
            <th>Dice Result</th>
            <th>Cell Number</th>
            <th>Hunger Level</th>    
            <th>Action</th>
        </tr>

        <%
        for (Player player : f.getGamers()) {
        %>
        <tr>
            <td><%= player.getName() %></td>
            <td><img src="<%= player.getPLayericon() %>" alt="Player Image" width="100" height="100"></td>
            <td><%= player.getDiceResult() %></td>
            <td><%= player.getCellcount() %></td>
            <td><%= player.getHungerlevel() %></td>
            <td>
                <form action="forestTable.jsp">
                    <input type="submit" name="dicerollAction" 
                           <%=  player.equals(f.getActivePlayer()) && player.getCellcount() < 100 ? "" : "disabled" %> 
                           value="Roll Dice"/>
                </form>
            </td>
        </tr>
        <%
        }
        %>
    </table>

    <table border="1">
    <%
    for (int i = 0; i < 10; i++) {
    %>
    <tr>
    <%
        for (int j = 0; j < 10; j++) {
    %>
    <td>
        <img src="<%= f.getCell()[i][j].getBGImage() %>"/>
        <%
        for (Player player : f.getCell()[i][j].getPlayers()) {
        %>
        <div class="player"><%= player.getName() %>
        <img src="<%= player.getPLayericon() %>" alt="Player Image" width="100" height="100"></div>
        <%
        }
        if (!f.getCell()[i][j].getHunters().isEmpty()) {
        %>
        <img class="icon hunter" src="<%= f.getCell()[i][j].getHunters().get(0).getImage() %>"/>
        <%
        }
        if (!f.getCell()[i][j].getFoods().isEmpty()) {
        %>
        <img class="icon food" src="<%= f.getCell()[i][j].getFoods().get(0).getImage() %>"/>
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

</body>
</html>
