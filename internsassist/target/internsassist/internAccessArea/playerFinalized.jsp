<%@ page import="com.lxisoft.model.*" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.PreparedStatement" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.io.IOException" %>
<%@ page import="java.security.Principal" %>

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
            position: relative;
            z-index: 2;
            color: black;
            background-color: rgba(240, 232, 232, 0.3);
        }
        th, td {
			padding: 10px;
			text-align: center;
			height: 10px;
			width: 50%;
            font-weight: bold;
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
            window.location.href = 'gameLoop.jsp';
        }
    </script>
</head>
<body>
    <div class="image-container">
        <img src="/internsassist/images/imageForTableBg.webp">
    </div>
    <%
        String url = "jdbc:mysql://localhost:3306/security_authentication";
        String dbUsername = "root";
        String dbPassword = "arjun7945";

        Principal p = request.getUserPrincipal();
        String name = p.getName();
        String nickname = null;

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
    %>
    <table>
        <thead>
            <tr>
                <th>INTERN NUMBER</th>
                <th>INTERN NAME</th>
            </tr>
        </thead>
        <tbody>
            <%
                int internNumber = 1;
                if (nickname != null && !nickname.isEmpty()) {
            %>
            <tr>
                <td><%= internNumber++ %></td>
                <td><%= nickname %></td>
            </tr>
            <%
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