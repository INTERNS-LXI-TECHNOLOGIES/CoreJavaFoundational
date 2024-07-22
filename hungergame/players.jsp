<%@ page import="com.lxisoft.hungergame.forest.*" %>
<html>
<body>
<%
Forest f = (Forest) application.getAttribute("forest");


%>
    <h2>Players List</h2>
    <table border="1">
        <tr>
            <th>Name</th>
            <th>Image</th>
        </tr>
        <%
        for (Player player : f.players) {
        %>
        <tr>
            <td><%= player.getName() %></td>
            <td><img src="<%= player.getPLayericon() %>" alt="Player Image" width="100" height="100"></td>
        </tr>
        <%
        }
        %>
    </table>
</body>
</html>
