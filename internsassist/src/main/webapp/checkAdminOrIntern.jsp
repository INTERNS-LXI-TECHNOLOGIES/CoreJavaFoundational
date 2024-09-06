<%@ page import = "java.security.Principal" %>

<html>
<head>
<title>CHECK ADMIN OR INTERN</title>
</head>
<body>

<%
    Principal p = request.getUserPrincipal();

    if (p != null) {
        if (request.isUserInRole("ADMIN")) {
            response.sendRedirect("/internsassist/adminAccessArea/adminHelpDesk.html");
        } else if (request.isUserInRole("INTERN")) {
            response.sendRedirect("/internsassist/internAccessArea/frontPage.jsp");
        }else if (request.isUserInRole("MENTOR")) {
            response.sendRedirect("/internsassist/mentorAccessArea/mentorCreateQuestion.html");
        }
        else{
%>
            <script>
                alert('No user found with the username: <%= p.getName() %>');
                window.location.href = "SecurityAuthentication.html";
            </script>
<%
        }
    } else {
%>
            <script>
                alert('No user found with the username: <%= p.getName() %>');
                window.location.href = "SecurityAuthentication.html";
            </script>
<%
    }
%>
</body>
</html>