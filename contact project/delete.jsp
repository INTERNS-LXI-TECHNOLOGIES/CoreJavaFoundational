<%@ page import = "java.sql.Connection"%>
<%@ page import = "java.sql.PreparedStatement"%>
<%@ page import = "java.sql.DriverManager"%>
<%@ page import = "java.io.IOException"%>
<%@ page import = "java.sql.SQLException"%>
<html>
<head>
<title>
Delete Contact
</title>

</head>
<body>
<%
String url = "jdbc:mysql://localhost:3306/contact";
String name = "root";
String pass = "laalu1234";

try
{
	Class.forName("com.mysql.cj.jdbc.Driver");
	
	Connection conn = DriverManager.getConnection(url,name,pass);
	
	String namee = request.getParameter("name");
	
	String query = "DELETE  FROM CONTACT_BOOK WHERE name = ?";
	
	PreparedStatement statement = conn.prepareStatement(query);
	
	statement.setString(1,namee);
	statement.executeUpdate();
	
}
catch(ClassNotFoundException | SQLException e)
{
	e.printStackTrace();
}
%>
<h1 style = "margin-left:370px;margin-top:350px;font-size:60px;" >Contact Deleted Successfully<h1>
</body>
</html>

	
	
