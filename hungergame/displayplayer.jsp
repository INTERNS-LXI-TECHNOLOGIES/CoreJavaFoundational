<%@ page import="com.lxisoft.hungergame.forest.*" %>
<html>
<body>
<% 
Forest f = (Forest) application.getAttribute("forest");
out.println("Name "+ f.getActivePlayer().getName() );
out.println("Result "+ f.getDice().getResult() );
%>