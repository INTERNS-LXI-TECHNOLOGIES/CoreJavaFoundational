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
        }
    } else {
        response.sendRedirect("loginError.html");
    }
%>


</body>
</html>