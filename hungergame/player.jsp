<%@ page import="com.lxi.hungergame.forest.Forest" %>
<%@ page import="com.lxi.hungergame.player.Player" %>
<%@ page import="com.lxi.hungergame.food.Food" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>player</title>
    <style>
        body {
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            font-family: 'Arial', sans-serif;
            margin: 0;
            background: linear-gradient(135deg, #74ebd5 0%, #ACB6E5 100%);
        }
        .form-container {
            background-color: rgba(255, 255, 255, 0.9);
            padding: 40px;
            border-radius: 10px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.2);
            max-width: 400px;
            width: 100%;
            text-align: center;
        }
        .form-container h1 {
            margin-bottom: 30px;
            font-size: 28px;
            color: #333;
            font-weight: bold;
        }
        .form-container input[type="text"],
        .form-container input[type="password"] {
            width: calc(100% - 20px);
            padding: 12px;
            margin: 12px 0;
            border: 1px solid #ccc;
            border-radius: 5px;
            font-size: 16px;
        }
        .form-container input[type="submit"] {
            width: 100%;
            padding: 12px;
            margin-top: 20px;
            background-color: #007bff;
            color: white;
            border: none;
            border-radius: 5px;
            font-size: 16px;
            cursor: pointer;
            transition: background-color 0.3s ease;
        }
        .form-container input[type="submit"]:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>
    <div class="form-container">
        <h1> player name</h1>
		
		
	<% 
	Forest f = (Forest) application.getAttribute("forest");
String name = request.getParameter("player");
Player p = new Player("/hungergame/images/player"+f.getPlayers().size()+".jpg", name);



if (f == null) {
%>
    <p>Forest object is not available. Contact admin.</p>
<%
} else if (f.getPlayers() == null) { 
%>
    <p>Contact admin</p>
<% 
} else { 
    f.getPlayers().add(p);
    f.setTotalcount(f.getPlayers().size());	%>
	
<%} %>





<form action="cell.jsp">
   
        				   
        <form action="cell.jsp">
            <input type="submit" value="Play">
        </form>
    </div>
</body>
</html>
