<%@ page import="java.util.List, java.util.ArrayList" %>
<%
String uname = request.getParameter("user");
session.setAttribute("user", uname);

synchronized (application) {
    List<String> users = (List<String>) application.getAttribute("onlineUsers");
    if (users == null) {
        users = new ArrayList<>();
        application.setAttribute("onlineUsers", users);
    }
    if (!users.contains(uname)) {
        users.add(uname);
    }
}
response.sendRedirect("frame.html");
%>
