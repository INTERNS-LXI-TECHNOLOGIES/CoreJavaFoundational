<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.PreparedStatement" %>
<%@ page import="java.sql.SQLException" %>
<%@ page import="com.lxisoft.utils.MD5HashingExample" %>

<html>
<body>
<%
    String username = request.getParameter("username");
    String password = request.getParameter("userpassword");
    String nickname = request.getParameter("nickname");
    String userrole = request.getParameter("user_role");

    String hashedPassword = MD5HashingExample.hashWithMD5(password);

    String url = "jdbc:mysql://localhost:3306/security_authentication";
    String dbUsername = "root";
    String dbPassword = "arjun7945";

    Connection conn = null;
    PreparedStatement pstmt1 = null;
    PreparedStatement pstmt2 = null;
    PreparedStatement pstmt3 = null;
    boolean isSuccess = false;

try {
    Class.forName("com.mysql.cj.jdbc.Driver");
    conn = DriverManager.getConnection(url, dbUsername, dbPassword);

        String query1 = "INSERT INTO users (user_name, user_pass) VALUES (?, ?)";
        pstmt1 = conn.prepareStatement(query1);
        pstmt1.setString(1, username);
        pstmt1.setString(2, hashedPassword);
        pstmt1.executeUpdate();

        String query2 = "INSERT INTO user_roles (user_name, role_name) VALUES (?, ?)";
        pstmt2 = conn.prepareStatement(query2);
        pstmt2.setString(1, username);
        pstmt2.setString(2, userrole);
        pstmt2.executeUpdate();

        String query3 = "INSERT INTO nickname (user_name, nick_name) VALUES (?, ?)";
        pstmt3 = conn.prepareStatement(query3);
        pstmt3.setString(1, username);
        pstmt3.setString(2, nickname);
        pstmt3.executeUpdate();

        isSuccess = true;

    } catch (ClassNotFoundException e) {
        e.printStackTrace();
        String errorMessage = "Driver not found: " + e.getMessage();
    }catch (SQLException e) {
        e.printStackTrace();
        String errorMessage = "Database error: " + e.getMessage();
    }
    if (isSuccess) {
%>
    <script>
        alert("NEW INTERN ADDED SUCCESSFULLY");
        window.location.href = "SecurityAuthentication.html";
    </script>
    <%
        }
    %>
</body>
</html>