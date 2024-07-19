<%
    Boolean gameStarted = (Boolean) application.getAttribute("gameStarted");
    if (gameStarted == null) {
        gameStarted = false;
    }
    response.setContentType("application/json");
    response.getWriter().write("{\"gameStarted\": " + gameStarted + "}");
%>