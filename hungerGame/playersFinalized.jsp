<%@ page import="com.lxisoft.hungerGame.model.*" %>
<html>
<head>
    <title>Players Finalized</title>
    <meta http-equiv="refresh" content="5">
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: rgb(38, 35, 35);
            color: #333;
            margin: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            position: relative;
            height: 100vh;
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
            width: 50%;
            margin-top: 0px;
            background-color: rgba(255, 255, 255, 0.7);
            position: relative;
            z-index: 2;
        }
        th, td {
			border: 8px solid rgb(38, 37, 37, 0.9);
			padding: 10px;
			text-align: center;
			height: 10px;
			width: 50%;
		}
        .start-button-container {
            position: absolute;
            bottom: 50px;
            left: 50%;
            transform: translateX(-50%);
            text-align: center;
            z-index: 3;
        }
		.subtitles{
            position: absolute;
            bottom: 50px;
            left: 50%;
            transform: translateX(-50%);
            text-align: center;
            z-index: 3;
			color: white;
            font-size: 1.2em;
            margin-bottom: -30px;
        }
        .start-button {
            background-color: #4CAF50;
            color: white;
            border: none;
            text-align: center;
            text-decoration: none;
            font-size: 20px;
            cursor: pointer;
            width: 200px;
            height: 50px;
            line-height: 50px;
        }
    </style>
    <script>
        function startGame() {
            window.location.href = 'initialPage.jsp';
        }
    </script>
</head>
<body>
    <div class="image-container">
        <img src="/hungerGame/HungerGame-img/icon/playerFinalizedICON.webp">
    </div>
    <table>
        <thead>
            <tr>
                <th>PLAYER NUMBER</th>
                <th>PLAYER NAME</th>
            </tr>
        </thead>
        <tbody>
            <%
                Forest f = (Forest) application.getAttribute("forest");
                if (f == null) {
                    f = new Forest();
                    application.setAttribute("forest", f);
                }
                int playerNumber = 1;
                for (Players player : f.getPlayer()) {
                    if (player.getName() != null) {
            %>
            <tr>
                <td><%= playerNumber++ %></td>
                <td><%= player.getName() %></td>
            </tr>
            <%
                    }
                }
            %>
        </tbody>
    </table>
    <div class="start-button-container">
        <div class="start-button" onclick="startGame()">START GAME</div>
    </div>
		<div class="subtitles">"MAKE SURE ALL THE PLAYERS ARE ENTERED"</div>
</body>
</html>
