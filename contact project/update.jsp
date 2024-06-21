<%@ page import = "java.sql.Connection"%>
<%@ page import = "java.io.IOException"%>
<%@ page import = "java.sql.PreparedStatement"%>
<%@ page import = "java.sql.DriverManager"%>
<%@ page import = "java.sql.SQLException"%>
<html>
<head>
<title>Update Page</title>
</head>
<body>

<%
String url = "jdbc:mysql://localhost:3306/contact";
String username = "root";
String pass = "laalu1234";

try
{
	Class.forName("com.mysql.cj.jdbc.Driver");
	
}
	catch(ClassNotFoundException e)
	{
		e.printStackTrace();
	}
try{
	Connection conn = DriverManager.getConnection(url,username,pass);
	String oldName = request.getParameter("previousname");
	String newName = request.getParameter("newname");
	String newNumber = request.getParameter("number");
	String newPlace = request.getParameter("place");
	
	
	String query = "UPDATE CONTACT_BOOK  SET name = ?, number = ?,place = ?    WHERE name = ?";
	
	PreparedStatement statement = conn.prepareStatement(query);
	
	statement.setString(1,newName);
	statement.setString(2,newNumber);
	statement.setString(3,newPlace);
	statement.setString(4,oldName);
	
	statement.executeUpdate();
}
	catch(SQLException e)
	{
		e.printStackTrace();
	}
	%>
<h1 style = "margin-left:370px;margin-top:350px;font-size:60px;"> Contact Updated Successfully</h1>
</body>
</html>		