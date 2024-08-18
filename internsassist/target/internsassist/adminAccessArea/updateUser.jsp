<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.PreparedStatement" %>
<%@ page import="java.sql.SQLException" %>

<html>
<head>
    <title>UPDATE USER</title>
</head>
<body>
<%

    String url = "jdbc:mysql://localhost:3306/security_authentication";
    String dbUsername = "root";
    String dbPassword = "arjun7945";

    String updateUser = request.getParameter("username");
    String selectedOption = request.getParameter("updateOption");
    String newRole = request.getParameter("newRole");
    String newNickName = request.getParameter("newNickName");

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection(url, dbUsername, dbPassword);

        if(selectedOption.equals("role")){
            
            String userRoleTable = "update user_roles set role_name = ? where user_name = ?";
            PreparedStatement roleStmt = conn.prepareStatement(userRoleTable);
            
            roleStmt.setString(1, newRole);
            roleStmt.setString(2, updateUser);
            roleStmt.executeUpdate();
%>
            <script>
                alert('UPDATED "<%= updateUser %>"s ROLE AS "<%= newRole %>"');
                window.location.href = "crudOperations.jsp?action=update";
            </script>
<%
        }
        else{
                        
            String nickNameTable = "update nickname set nick_name = ? where user_name = ?";
            PreparedStatement nickNameStmt = conn.prepareStatement(nickNameTable);
            
            nickNameStmt.setString(1, newNickName);
            nickNameStmt.setString(2, updateUser);
            nickNameStmt.executeUpdate();
%>
            <script>
                alert('NEW NICK NAME UPDATED FOR "<%= updateUser %>" AS "<%= newNickName %>"');
                window.location.href = "crudOperations.jsp?action=update";
            </script>
<%            
        }
    }
    catch (ClassNotFoundException e) {
        e.printStackTrace();
        out.println("Database driver not found: " + e.getMessage());
    } catch (SQLException e) {
        e.printStackTrace();
        out.println("Database error occurred: " + e.getMessage());
    }
%>
</body>
</html>