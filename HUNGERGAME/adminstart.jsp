<%@ page import="com.lxisoft.hungerGame.model.*" %>
<html>
<body>
	<%
    Boolean gameStarted = (Boolean) application.getAttribute("gameStarted");
    if (gameStarted == null) {
        gameStarted = false;
    }
    response.setContentType("application/json");
    response.getWriter().write("{\"gameStarted\": " + gameStarted + "}");
	%>

	<h1>ADMIN STATRTED THE GAME</h1>
	
	</body>
	</html>

