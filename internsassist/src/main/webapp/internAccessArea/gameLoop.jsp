<%@ page import="com.lxisoft.model.*" %>
<%@ page import="java.util.*" %>

<html>
<head>
    <title>GAME LOOP</title>

    <style>
        body {
            background-color: #f0f0f0;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
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
        .winner-table {
            position: absolute;
            right: 0%;
            top: 20%;
            transform: translateY(-50%);
            padding: 0px;
            border-radius: 5px;
            z-index: 3;
        }
        .pagecontainer {
            display: flex;
            flex-direction: column;
            justify-content: center;
            align-items: center;
            height: 100%;
        }
        .boardcontainer {
            display: flex;
            justify-content: center;
            align-items: center;
            flex-direction: row;
        }
        .boardcontainerforplayers {
            display: flex;
            flex-direction: column;
            align-items: center;
            background-color: #ffffaa;
            border: 1px solid #ccccaa;
            justify-content: center;
            font-size: 12px;
            padding: 20px;
        }
        .boardcontainerforboard {
            display: flex;
            background-color: #ffffbb;
            border: 1px solid #ccccbb;
            align-items: center;
            justify-content: center;
            font-size: 12px;
        }
        .board {
            display: grid;
            grid-template-columns: repeat(10, 5vw);
            grid-template-rows: repeat(10, 8vh);
            gap: 2px;
        }
        .player-entry img {
            width: 25px;
            height: 25px;
            border-radius: 50%;
        }
        .cellIdentity {
            display: flex;
            align-items: center;
            justify-content: center;
            text-align: center;
            background-color: #e0e0e0;
            border: 2.5px solid #cccccc;
            padding: 5px;
        }
        .player-button {
            margin-left: 10px;
            padding: 5px 10px;
            background-color: #4CAF50;
            color: white;
            border: none;
            border-radius: 5px;
            cursor: pointer;
        }
        .player-button:hover {
            background-color: #45a049;
        }
    </style>
    <meta http-equiv="refresh" content="5">
</head>
<body>
    <div class="pagecontainer">
        <div class="boardcontainer">
            <div class="boardcontainerforplayers">
                <%
                    String nickname = request.getParameter("nickname");
                    if (nickname == null || nickname.isEmpty()) {
                        out.println("NO NICKNAME PROVIDED");
                    } else {
                %>
                <div class="player-entry">
                    <img src="<%= request.getParameter("icon") %>" alt="Player Icon">
                    <b><%= nickname %></b>
                    <form action="showCell.html" method="get">
                        <input type="hidden" name="playerName" value="<%= nickname %>">
                        <button class="player-button" type="submit">Show Cell</button>
                    </form>
                </div>
            <%
                }
            %>
        </div>

        <div class="boardcontainerforboard">
            <div class="board">
                <% for (int i = 1; i <= 100; i++) { %>
                    <div class="cellIdentity"><b>Cell <%= i %></b></div>
                <%
                }
                %>
            </div>
        </div>
    </div>
</div>
</body>
</html>
