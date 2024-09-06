<%@ page import="com.lxisoft.model.MissionPrep" %>
<%@ page import="java.io.*"%>
<%@ page import="java.sql.*"%>

<html>
<body>
<%
String url = "jdbc:mysql://localhost:3306/missionlifeordeath";
String username = "root";
String password = "arjun7945";

try {
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection conn = DriverManager.getConnection(url, username, password);
    Statement stmt = conn.createStatement();

} catch (ClassNotFoundException e) {
    e.printStackTrace();
}
%>
</body>
</html>