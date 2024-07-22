<%@ page import="com.lxisoft.hungerGame.model.*" %>
<html>
<body>
<style>
        body {
            margin: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            background-color: #f0f0f0;
            font-family: 'Raleway', sans-serif;
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
        .overlay {
            position: absolute;
            top: 0;
            left: 0;
            width: 100%;
            height: 100%;
            background: linear-gradient(to bottom, rgba(0, 0, 0, 0.5), rgba(0, 0, 0, 0.1));
        }
    </style>

	<%
    Forest f = (Forest) application.getAttribute("forest");
    if (f == null) {
        f = new Forest();
        application.setAttribute("forest", f);
    }
    application.setAttribute("gameStarted", true);
    %>
    <div class="image-container">
        <img src="/HUNGERGAME/forestimage/img13.jpg" alt="Hunger Game">
        <div class="text-overlay title-1">ADMIN STARTED GAME</div>
    </div>

   
	</body>
</html>