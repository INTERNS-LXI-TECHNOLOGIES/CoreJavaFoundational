<%@ page import="com.lxisoft.hungerGame.model.*" %>
<%@ page import="java.util.*" %>

<html>
<head>
    <title>GAME LOOP</title>
	
    <style>
        body {
            color: white;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
        }
        .image-container {
            position: absolute;
            top: 0px;
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
            z-index: 2;
            transform: scale(0.8);
            transform-origin: center;
            margin-top: 40px;
            width: 80%;
            max-width: 600px;
            border: 5px solid white;
        }
        table td {
            width: 80px;
            height: 65px;
            text-align: center;
            vertical-align: middle;
            border: 4px solid white;
            padding: 0;
            position: relative;
        }
        .overlay-image {
            position: absolute;
            width: 100%;
            height: 100%;
            top: 0;
            left: 0;
            object-fit: cover;
        }
        .overlay-icon {
            position: absolute;
            bottom: 0;
            right: 0;
            width: 25px;
            height: 25px;
            object-fit: cover;
            border-radius: 50%;
        }
        .overlay-items {
            position: absolute;
            top: 0;
            right: 0;
            width: 25px;
            height: 25px;
            object-fit: cover;
            border-radius: 50%;
        }
        .player-names {
            position: absolute;
            top: 10px;
            left: -7px;
            padding: 10px;
            border-radius: 5px;
            z-index: 3;
        }
        .winner-table {
            position: absolute;
            right: 0%;
            top: 20%;
            transform: translateY(-50%);
            padding: 0px;
            border-radius: 5px;
            z-index: 3;
        }
    </style>
    <meta http-equiv="refresh" content="5">
</head>
<body>
    <div class="image-container">
        <img src="/hungerGame/HungerGame-img/gameLoopBG.jpg">
    </div>
    <%
        Forest f = (Forest) application.getAttribute("forest");  
        boolean playerAliveOrNot = true;
        String deadPlayer = "";

        String rollDiceAccess = request.getParameter("rollDice");
        if (rollDiceAccess != null && rollDiceAccess.equals("true")) {
            playerAliveOrNot = f.gameLoop();
            deadPlayer = f.getActivePlayer().getName();
            
            if(!playerAliveOrNot){
            %>          
                <script> alert("<%= deadPlayer %> is no more Alive !") </script>
            <%
            }
        }
        if (f.isGameEnd()) {
        %>          
            <script> alert("GAME ENDED") </script>
         <%
        }

            if (f.getWinnersOfGame().size() == 2) {
        %>
                <script>
                    window.location.href = "winnerTable.jsp";
                </script>
        <%
        }
        %>

    <div class="player-names">
        <jsp:include page="showPlayers.jsp" />
    </div>
    
    <table border="1">
        <%
            for (int i = 0; i < 10; i++){
        %>
        <tr>
            <%
                for (int j = 0; j < 10; j++){
					Cells cell = f.getCell()[i][j];
                    Hunter[] hunters = cell.getHunter();
                    Food[] foods = cell.getFood();
                    List<Players> players = cell.getPlayer() ;
            %>
            <td>
                <img src="<%= cell.getBgImage() %>" class="overlay-image"/>
                <%
                    if (hunters != null && hunters.length > 0 && hunters[0] != null){
                %>
                <img src="<%= hunters[0].getIcon() %>" class="overlay-icon"/>
                <% 
                    }
                    if (hunters != null && hunters.length > 1 && hunters[1] != null){
                %>
                <img src="<%= hunters[1].getIcon() %>" class="overlay-icon"/>
                <%
				}
				%>
                <%
                    if (foods != null && foods.length > 0 && foods[0] != null){
                %>
                <img src="<%= foods[0].getItems() %>" class="overlay-items"/>
                <% 
                    }
                    if (foods != null && foods.length > 1 && foods[1] != null){
                %>
                <img src="<%= foods[1].getItems() %>" class="overlay-items"/>
                <%
				}
				%>
                <%
                for(Players p: players){
                %>
                <img src="<%= p.getIcon() %>" class="overlay-items"/>
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
