<%@ page import="com.lxisoft.model.*" %>
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
        .pagecontainer{
            grid-template-rows: 2fr 6fr 2fr;
        }
        .boardcontainer{
            display: grid;
            grid-template-columns: 2fr 2fr 8fr 2fr;
        }
        .boardcontainerforplayers{
            display: flex;
            flex-direction: column ;
            align-items: center;
            background-color: #ffffaa;
            border: 1px solid #ccccaa;
            justify-content: center;
            font-size: 12px;
            padding: 20px;
        }
        .boardcontainerforboard{
            display: flex;
            background-color: #ffffbb;
            border: 1px solid #ccccbb;
            align-items: center;
            justify-content: center;
            font-size: 12px;
        }
        .board{
            display: grid;
            grid-template-columns: repeat(10, 5vw);
            grid-template-rows: repeat(10, 8vh);
            gap:2px;
        }
    </style>
    <meta http-equiv="refresh" content="5">
</head>
<body>
    <div class="image-container">
        <img src="/mazerunner/images/imageForAll.jpg">
    </div>
    <div class="player-names">
        <jsp:include page="showPlayers.jsp" />
    </div>
    
    <div class="pagecontainer">

    <div class="boardcontainer">
        <div class="boardcontainerforplayers">
                <% for (int i = 1; i <= 5; i++) { %>
                    <div class="call"><b>Player<%= i %></b></div>
                <%
                }
                %>
        </div>
        <div class="boardcontainerforboard">
            <div class="board">
                <% for (int i = 1; i <= 100; i++) { %>
                    <div class="call"><b>Cell<%= i %></b></div>
                <%
                }
                %>
            </div>
        </div>
    </div>
</div>
</body>
</html>
