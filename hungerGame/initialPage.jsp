<%@ page import="com.lxisoft.hungerGame.model.*" %>
<html>
<head>
    <title>INITIAL GAME FRAME</title>
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
            top: 0;
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
        }
        .overlay-items {
            position: absolute;
            top: 0;
            right: 0;
            width: 25px;
            height: 25px;
            object-fit: cover;
        }
        .player-names {
            position: absolute;
            top: 10px;
            left: 10px;
            padding: 10px;
            border-radius: 5px;
            z-index: 3;
        }
        .player-entry {
            display: flex;
            align-items: center;
        }
        .player-entry img {
            margin-right: 15px;
            width: 25px;
            height: 25px;
			padding: 2.5px;
        }
    </style>
</head>
<body>
    <div class="image-container">
        <img src="/hungerGame/HungerGame-img/boardBG.jpg">
    </div>
    <%
        Forest f = (Forest) application.getAttribute("forest");
        if (f == null){
            f = new Forest();
            application.setAttribute("forest", f);
        }
        f.bgAddingMethod();
        f.combinedCreation();
    %>
    <div class="player-names">
        <h3>PLAYERS IN THE GAME:</h3>
        <%
            for (Players player : f.getPlayer()) {
                if (player.getName() != null) {
        %>
        <div class="player-entry">
            <img src="<%= player.getIcon() %>" alt="Player Icon">
            <%= player.getName() %>
        </div>
        <%
        }
			else {
                out.println("NO PLAYERS WERE ADDED");
            } 
        }
        %>
    </div>
    <table border="1">
        <%
            for (int i = 0; i < 10; i++){
        %>
        <tr>
            <%
                for (int j = 0; j < 10; j++){
            %>
            <td>
                <img src="<%= f.getCell()[i][j].getBgImage() %>" class="overlay-image"/>
                <%
                    if (f.getCell()[i][j].getHunter() != null){
                %>
                <img src="<%= f.getCell()[i][j].getHunter().getIcon() %>" class="overlay-icon"/>
                <%
                    }
                    if (!f.getCell()[i][j].getFood().isEmpty()){
                %>
                <img src="<%= f.getCell()[i][j].getFood().get(0).getItems() %>" class="overlay-items"/>
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
