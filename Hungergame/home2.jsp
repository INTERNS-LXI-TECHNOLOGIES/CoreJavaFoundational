<%@ page import ="java.sql.*"%>
<%@ page import ="java.io.*"%>
<html>
<head>
<style>
    body {
        font-family: Arial, sans-serif;
        background-color: pale blue;
        margin: 0;
        padding: 0;
    }

    form {
        max-width: 400px;
        margin: 20px auto;
        padding: 20px;
        background-color: green;
        border-radius: 5px;
        box-shadow: 0 2px 5px rgba(0, 0, 0, 0.1);
        text-align: center; /* Aligns content in the center */
    }

    input[type="text"] {
        width: 100%;
        padding: 10px;
        margin: 5px 0;
        box-sizing: border-box;
        border: 1px solid #ccc;
        border-radius: 4px;
    }

    input[type="text"]:focus {
        outline: none;
        border-color: #007bff;
    }

    input[type="submit"] {
        background-color: #ff6f61;
        color: white;
        padding: 10px 15px;
        border: none;
        border-radius: 4px;
        cursor: pointer;
    }

    input[type="submit"]:hover {
        background-color: #ff4d4d;
    }

    input[type="text"]:nth-child(odd) {
        background-color: #ffd966;
    }

    input[type="text"]:nth-child(even) {
        background-color: #ffcc99;
    }
</style>
</head>
<body>
<%

   int no=Integer.parseInt(request.getParameter("playersno"));
   %>
   <form action="cell.jsp">
   <%
   for(int i=1;i<=no;i++){
    %>
	<input type="text" name="player<%= i%>" placeholder="player<%= i%>:"><br><br>
   <% 
   }
   %>
   <input type="submit" value="ok">
   </form>
   

</body>
</html>