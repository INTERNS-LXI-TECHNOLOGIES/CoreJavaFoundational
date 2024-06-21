<%@ page import = "java.sql.*" %>
<%@ page import = "java.io.*"%>

<html>
<body>
<%
String url = "jdbc:mysql://localhost:3306/contact";
String username = "root";
String pass = "laalu1234";
boolean nameExists = false; 
try {
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection conn = DriverManager.getConnection(url, username, pass);
    
   
    String namee = request.getParameter("name");
    String number = request.getParameter("number");
    String place = request.getParameter("place");
    
    
    String query = "SELECT * FROM CONTACT_BOOK WHERE NAME = ?";
    PreparedStatement checkStatement = conn.prepareStatement(query);
    checkStatement.setString(1, namee);
    ResultSet r = checkStatement.executeQuery();
    
    if (r.next())
		{ 
        nameExists = true;
    } else
		{ 
        String insertQuery = "INSERT INTO CONTACT_BOOK (NAME, NUMBER, PLACE) VALUES (?, ?, ?)";
        PreparedStatement insertStatement = conn.prepareStatement(insertQuery);
        insertStatement.setString(1, namee);
        insertStatement.setString(2, number);
        insertStatement.setString(3, place);
        insertStatement.executeUpdate();
    }
    
    
    if (nameExists) {
%>
        <h1 style="margin-left:100px; margin-top:300px; font-size:70px">Name Already Exists. Enter a New Name</h1>
<%
    } else {
%>
        <h1 style="margin-left:350px; margin-top:300px; font-size:70px">Contact Successfully Added</h1>
<%
    }
} catch (SQLException e) {
    e.printStackTrace();
} catch (ClassNotFoundException e) {
    e.printStackTrace();
}
%>
</body>
</html>