<%@ page import="com.lxisoft.hungerGame.model.*" %>
<html>
<head>
    <title>Save Player Name</title>
    <script>
        function adminMethod() {
            alert("Player added successfully");
            window.location.href = "playersFinalized.jsp";
        }
    </script>
</head>
<body onload="adminMethod()">
    <%
    String playerName = request.getParameter("player1");
    Forest forest = (Forest) application.getAttribute("forest");

    if (forest == null) {
        forest = new Forest();
        application.setAttribute("forest", forest);
    }

    if (forest != null) {
        forest.addPlayer(playerName);
    } else {
        out.println("INVALID");
    }
    %>
</body>
</html>
