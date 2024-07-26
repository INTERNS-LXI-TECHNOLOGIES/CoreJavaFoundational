<%@ page import="com.lxisoft.hungergame.forest.*"%>
<html>
<body>
<%
Forest f=new Forest();
application.setAttribute("forest",f);
f.cellImage();
f.createFoods();
f.createHunters();
%>