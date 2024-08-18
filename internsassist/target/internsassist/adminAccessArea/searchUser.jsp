<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.PreparedStatement" %>
<%@ page import="java.sql.ResultSet" %>

<html>
<head>
    <title>SEARCH USER</title>
<style>
    body {
        font-family: Arial, sans-serif;
        background-color: #f4f4f4;
        margin: 0;
        padding: 0;
        display: flex;
        justify-content: center;
        align-items: center;
        height: 100vh;
        flex-direction: column;
    }
    table {
        width: 70%;
        max-width: 800px;
        margin: 20px 0;
        border-collapse: collapse;
        background-color: #ffffff;
        box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
        border-radius: 8px;
    }
    th, td {
        padding: 12px 15px;
        border: 1px solid #ddd;
        text-align: left;
    }
    th {
        background-color: #007BFF;
        color: #ffffff;
        font-size: 16px;
    }
    tr:hover {
        background-color: #f1f1f1;
    }
</style>
</head>
<body>

<%
    String url = "jdbc:mysql://localhost:3306/security_authentication";
    String dbUsername = "root";
    String dbPassword = "arjun7945";

    String searchUser = request.getParameter("username");
    boolean userFound = false;

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection(url, dbUsername, dbPassword);

        String userTable = "SELECT * FROM users WHERE user_name = ?;";
        String userRoleTable = "SELECT * FROM user_roles WHERE user_name = ?;";
        String nickNameTable = "SELECT * FROM nickname WHERE user_name = ?;";

        PreparedStatement userStmt = conn.prepareStatement(userTable);
        PreparedStatement userRoleStmt = conn.prepareStatement(userRoleTable);
        PreparedStatement nickNameStmt = conn.prepareStatement(nickNameTable);

        userStmt.setString(1, searchUser);
        userRoleStmt.setString(1, searchUser);
        nickNameStmt.setString(1, searchUser);

        ResultSet userRs = userStmt.executeQuery();
        ResultSet userRoleRs = userRoleStmt.executeQuery();
        ResultSet nickNameRs = nickNameStmt.executeQuery();
%>

<table>
    <thead>
        <tr>
            <th>USER NAME</th>
            <th>PASSWORD</th>
        </tr>
    </thead>
    <tbody>
        <%
            while(userRs.next()) {
                userFound = true;
        %>
        <tr>
            <td><%= userRs.getString("user_name") %></td>
            <td><%= userRs.getString("user_pass") %></td>
        </tr>
        <%
            }
        %>
    </tbody>
</table>

<table>
    <thead>
        <tr>
            <th>USER NAME</th>
            <th>ROLE NAME</th>
        </tr>
    </thead>
    <tbody>
        <%
            while(userRoleRs.next()) {
                userFound = true;
        %>
        <tr>
            <td><%= userRoleRs.getString("user_name") %></td>
            <td><%= userRoleRs.getString("role_name") %></td>
        </tr>
        <%
            }
        %>
    </tbody>
</table>

<table>
    <thead>
        <tr>
            <th>USER NAME</th>
            <th>NICK NAME</th>
        </tr>
    </thead>
    <tbody>
        <%
            while(nickNameRs.next()) {
                userFound = true;
        %>
        <tr>
            <td><%= nickNameRs.getString("user_name") %></td>
            <td><%= nickNameRs.getString("nick_name") %></td>
        </tr>
        <%
            }
        %>
    </tbody>
</table>
        <%
        if (!userFound) {
        %>
            <script>
                alert("No user found with the username '<%= searchUser %>'.");
                    window.location.href = "crudOperations.jsp?action=search";
            </script>
        <%
        }
        %>
        <%
    } catch (Exception e) {
        e.printStackTrace();
        String errorMessage = "Database error: " + e.getMessage();
    }
%>
</body>
</html>