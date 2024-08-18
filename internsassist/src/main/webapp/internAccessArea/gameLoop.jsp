<%@ page import="com.lxisoft.model.*" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.PreparedStatement" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.security.Principal" %>
<%@ page import="java.io.IOException" %>

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
            text-decoration: none;
        }
        .cellIdentity:hover {
            background-color: #c0c0c0;
            color: #000;
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
                    String url = "jdbc:mysql://localhost:3306/security_authentication";
                    String dbUsername = "root";
                    String dbPassword = "arjun7945";

                    Principal p = request.getUserPrincipal();
                    String name = p.getName();
                    String nickname = null;
                    int imagecount = 1;

                    try {
                        Class.forName("com.mysql.cj.jdbc.Driver");
                        Connection conn = DriverManager.getConnection(url, dbUsername, dbPassword);

                        String query = "SELECT nick_name FROM nickname WHERE user_name = ?";
                        PreparedStatement pstmt = conn.prepareStatement(query);
                        pstmt.setString(1, name);
                        ResultSet rs = pstmt.executeQuery();

                        if (rs.next()) {
                            nickname = rs.getString("nick_name");
                        }

                        rs.close();
                        pstmt.close();
                        conn.close();
                    } catch (Exception e) {
                        e.printStackTrace();
                        String errorMessage = "Driver not found: " + e.getMessage();
                    }
                    if (nickname != null && !nickname.isEmpty()) {
                        String iconPath = "/internsassist/images/playerICONS/" + imagecount + ".jpg";
                        imagecount++;
                %>
                <div class="player-entry">
                    <img src="<%= iconPath %>" alt="Player Icon">
                    <b><%= nickname %></b>
                    <input type="hidden" name="playerName" value="<%= nickname %>">
                </div>
            <%
                }
            %>
        </div>

        <div class="boardcontainerforboard">
            <div class="board">
                <% for (int i = 1; i <= 100; i++) { %>
                    <a href="showCell.html?cell=<%= i %>" class = "cellIdentity"><%= i %></a>
                <%
                }
                %>
            </div>
        </div>
    </div>
</div>
</body>
</html>
