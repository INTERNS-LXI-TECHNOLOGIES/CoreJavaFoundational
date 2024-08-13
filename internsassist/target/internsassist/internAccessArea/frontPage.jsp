<%@ page import="com.lxisoft.model.*" %>
<%
    boolean isGameStarted = true;
    //(application.getAttribute("questionBank") != null);
%>
<html>
<head>
    <title>MAZE RUNNER</title>
	<meta http-equiv="refresh" content="5">
    <style>
        body {
            margin: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            overflow: hidden;
            background-color: #f0f0f0;
        }
        .image-container {
            position: relative;
            width: 100%;
            height: 100%;
            text-align: center;
        }
        img {
            width: 100%;
            height: 100%;
            object-fit: cover;
        }
        .text-overlay {
            position: absolute;
            width: 100%;
            color: white;
            font-weight: bold;
            text-shadow: 4px 4px 6px rgba(0, 0, 0, 0.5);
        }
        .title-1 {
            top: 40%;
            font-size: 4em;
        }
        .subtitle {
            top: 50.5%;
            font-size: 1.5em;
        }
        .button-container {
            position: absolute;
            top: 65%;
            width: 100%;
            display: flex;
            justify-content: center;
        }
        .start-button {
            padding: 10px 20px;
            font-size: 1.5em;
            font-weight: bold;
            color: white;
            background-color: #ff4500;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            text-shadow: none;
            box-shadow: 0px 4px 6px rgba(0, 0, 0, 0.3);
        }
        .start-button:hover {
            background-color: #ff6347;
        }
    </style>
    <script>
        function checkGameStarted() {
            <%
            if (isGameStarted) { %>
                window.location.href = '/internsassist/internAccessArea/playerFinalized.jsp';
            <% }
            else { %>
                alert('Admin has not started the game yet.');
            <% } %>
        }
    </script>
</head>
<body>
    <div class="image-container">
        <img src="/internsassist/images/imageForTableBg.webp" alt="Interns Assist">
        <div class="text-overlay title-1">INTERNS ASSIST</div>
        <div class="text-overlay subtitle">"TRY REACHING YOUR DESTINATION"</div>
        <div class="button-container">
            <button class="start-button" onclick="checkGameStarted()">ENTER PROGRAM</button>
        </div>
    </div>
</body>
</html>
