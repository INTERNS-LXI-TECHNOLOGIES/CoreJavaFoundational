<%@ page import = "java.sql.ResultSet"%>
<%@ page import = "java.sql.Connection"%>
<%@ page import = "java.sql.DriverManager"%>
<%@ page import = "java.sql.Statement"%>
<%@ page import = "java.sql.SQLException"%>

<html>
<title>
Read Contacts
</title>
<body>
<%
String url = "jdbc:mysql://localhost:3306/contact";
String username = "root";
String pass = "laalu1234";

try
{
	Class.forName("com.mysql.cj.jdbc.Driver");

	Connection conn = DriverManager.getConnection(url,username,pass);
	
	
	String query = "SELECT * FROM CONTACT_BOOK" ;
	Statement statement = conn.createStatement();
	ResultSet R = statement.executeQuery(query);
	
	
	
	while(R.next())
	{
		out.println(R.getString("name"));%><br><%
		out.println(R.getString("number"));%><br><%
		out.println(R.getString("place"));%><br><br><%
	}
	
	
}
catch( SQLException  e)
{
	e.printStackTrace();
}
%>
</body>
</html>
