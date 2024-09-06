<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.Statement" %>


<html>
<head>
    <title>SHOW USER DETAILS</title>
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

try {
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection conn = DriverManager.getConnection(url, dbUsername, dbPassword);

    String userDetailsQuery="SELECT DISTINCT u.user_name, r.role_name, n.nick_name FROM users u LEFT JOIN user_roles r ON u.user_name = r.user_name LEFT JOIN nickname n ON u.user_name = n.user_name;";
    Statement stmt = conn.createStatement();
    ResultSet r = stmt.executeQuery(userDetailsQuery);

%>
<table>
<thead>
    <tr>
        <th>USER NAME</th>
        <th>USER ROLE</th>
        <th>USER NICK NAME</th>
    </tr>
</thead>
        <tbody>
            <%
                while (r.next()) {
                    String userName = r.getString("user_name");
                    String roleName = r.getString("role_name");
                    String nickName = r.getString("nick_name");
            %>
            <tr>
                <td><%= userName %></td>
                <td><%= roleName %></td>
                <td><%= nickName %></td>
            </tr>
            <%
                }
            %>
        </tbody>
    </table>
<%
}catch (Exception e){
    e.printStackTrace();
    String errorMessage = "Database error: " + e.getMessage();
}
%>
</body>
</html>