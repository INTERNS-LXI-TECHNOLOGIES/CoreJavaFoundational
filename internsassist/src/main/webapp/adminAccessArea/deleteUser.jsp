<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.PreparedStatement" %>
<%@ page import="java.sql.ResultSet" %>

<html>
<head>
    <title>DELETE USER</title>
</head>
<body>

<%
    String url = "jdbc:mysql://localhost:3306/security_authentication";
    String dbUsername = "root";
    String dbPassword = "arjun7945";

    String deleteUser = request.getParameter("username");
    
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection(url, dbUsername, dbPassword);

        String checkUserQuery = "SELECT user_name FROM users WHERE user_name = ?";
        PreparedStatement checkUserStmt = conn.prepareStatement(checkUserQuery);
        checkUserStmt.setString(1, deleteUser);
        ResultSet rs = checkUserStmt.executeQuery();

        if (!rs.next()) {
%>
            <script>
                alert('No user found with the username: "<%= deleteUser %>"');
                window.location.href = "crudOperations.jsp?action=delete";
            </script>
<%
        } else {
            String userRoleTable = "DELETE FROM user_roles WHERE user_name = ?;";
            String userTable = "DELETE FROM users WHERE user_name = ?;";
            String nickNameTable = "DELETE FROM nickname WHERE user_name = ?;";
    
            PreparedStatement userRoleStmt = conn.prepareStatement(userRoleTable);
            PreparedStatement userStmt = conn.prepareStatement(userTable);
            PreparedStatement nickNameStmt = conn.prepareStatement(nickNameTable);

            userRoleStmt.setString(1, deleteUser);
            userStmt.setString(1, deleteUser);
            nickNameStmt.setString(1, deleteUser);

            userRoleStmt.executeUpdate();
            userStmt.executeUpdate();
            nickNameStmt.executeUpdate();
%>
            <script>
                alert('User "<%= deleteUser %>" has been successfully deleted.');
                window.location.href = "crudOperations.jsp?action=delete";
            </script>
<%
        }
    } catch (Exception e) {
        e.printStackTrace();
%>
        <script>
            alert('Database error: <%= e.getMessage() %>');
            window.location.href = "crudOperations.jsp?action=delete";
        </script>
<%
    }
%>
</body>
</html>