<%@ page import="com.lxisoft.model.*" %>
<html>
<head>
    <title>Save Intern Name</title>
    <script>
        function adminMethod() {
            alert("Intern name added successfully");
            window.location.href = "playerFinalized.jsp";
        }
    </script>
</head>
<body onload="adminMethod()">
    <%
    String internName = request.getParameter("intern1");
    QuestionBank qb = (QuestionBank) application.getAttribute("questionBank");

    if (qb != null) {
        qb.addPlayer(internName);
    } else {
        out.println("INVALID");
    }
    %>
</body>
</html>
