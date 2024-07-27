<%@ page import="com.lxisoft.model.Forest" %>

<html>
<head>
    <title>Admin Page</title>
	<style>
        .image-container {
            position: fixed;
            top: 0;
            left: 0;
            width: 100%;
            height: 100%;
            z-index: -1;
        }
        .image-container img {
            width: 100%;
            height: 100%;
            object-fit: cover;
        }
        h1 {
            position: absolute;
            top: 50%;
            left: 50%;
            transform: translate(-10%, -50%);
            font-size: 2.4em;
            color: rgb(72, 72, 141);;
            font-family: Bahnschrift;
            z-index: 1;
        }
    </style>
</head>
<body>
	<div class="image-container">
        <img src="/hungerGame/HungerGame-img/icon/adminsOnlyICON.jpg">
    </div>
    <%
    Forest f = (Forest) application.getAttribute("forest");
    if (f == null) {
        f = new Forest();
        application.setAttribute("forest", f);
    }
    %>
    <h1>ADMIN HAD STARTED THE GAME</h1>
</body>
</html>
