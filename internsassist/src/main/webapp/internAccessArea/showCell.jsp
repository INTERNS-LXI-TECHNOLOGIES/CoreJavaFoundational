<%@ page import="java.io.IOException" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.PreparedStatement" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.security.Principal" %>
<html>
<head>
    <title>INSIDE THE CELL</title>
    <style>
        body {
            display: flex;
            justify-content: center;
            align-items: center;
            margin: 0;
            background-color: #1a1818;
        }
        .showCellButtons button {
            display: block;
            margin: 20px auto;
            padding: 20px 20px;
            font-size: 20px;
            cursor: pointer;
            border-radius: 12px;
            font-weight: bold;
        }
        .showCellButtons button:hover {
            background-color: #7bbc4a;
        }
    </style>
</head>
<body>
    <%
        String cellParam = request.getParameter("cell");
        int cellNumber = 0;
        if (cellParam != null) {
            cellNumber = Integer.parseInt(cellParam);
        }
    %>

    <div class="showCellButtons">
        <form action="missionPrep.jsp" method="post">
            <input type="hidden" name="cellnumber" value="<%= cellNumber %>">
            <button type="submit">MISSION-PREP QUESTIONS</button>
        </form>

        <form action="lifeOrDeathMission.jsp" method="post">
            <input type="hidden" name="cellnumber" value="<%= cellNumber %>">
            <button type="submit">LIFE-OR-DEATH MISSION</button>
        </form>
    </div>
</body>
</html>
