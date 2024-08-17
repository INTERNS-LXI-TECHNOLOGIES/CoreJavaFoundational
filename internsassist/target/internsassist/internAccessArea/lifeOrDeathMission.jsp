<%@ page import="com.lxisoft.model.LifeOrDeathMission" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.Statement" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.SQLException" %>

<html>
<head>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            margin: 0;
            padding: 20px;
        }
        table {
            width: 80%;
            margin: 0 auto;
            border-collapse: collapse;
            background-color: #fff;
            box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1);
            border-radius: 8px;
            overflow: hidden;
        }
        th, td {
            padding: 12px;
            text-align: left;
        }
        thead {
            background-color: #4CAF50;
            color: white;
        }
        tbody tr:nth-child(even) {
            background-color: #f2f2f2;
        }
        tbody tr:hover {
            background-color: #ddd;
        }
        th {
            font-weight: bold;
        }
        h3 {
            text-align: center;
            margin-top: 20px;
            font-size: 24px;
            color: #333;
        }
    </style>
</head>
<body>
    <h3>LIFE-OR-DEATH MISSION</h3>
<%
    String url = "jdbc:mysql://localhost:3306/missionlifeordeath";
    String username = "root";
    String password = "arjun7945";

    Integer storedQuestionNumber = (Integer) session.getAttribute("questionNumber");

    int questionNumber;
    if (storedQuestionNumber == null) {
        LifeOrDeathMission lifeordeathmission = new LifeOrDeathMission();
        questionNumber = lifeordeathmission.pickRandomNumberFromMissionPrep();
        session.setAttribute("questionNumber", questionNumber);
    } else {
        questionNumber = storedQuestionNumber;
    }

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection(url, username, password);
        Statement stmt = conn.createStatement();

        String query = "SELECT * FROM questionbank WHERE QuestionNumber = " + questionNumber;
        ResultSet rs = stmt.executeQuery(query);
%>
    <form action="/internsassist/checkAnswer.jsp" method="post">
        <table>
            <thead>
                <tr>
                    <th>Question No</th>
                    <th>Question</th>
                    <th>Option</th>
                </tr>
            </thead>
            <tbody>
                <%
                    while (rs.next()) {
                        questionNumber = rs.getInt("QuestionNumber");
                        String question = rs.getString("Question");
                        String options = rs.getString("Options");
                        String[] optionArray = options.split(" OPTION ");

                        for (int j = 0; j < optionArray.length; j++) {
                            String option = optionArray[j].trim();
                            int colonIndex = option.indexOf(":");
                            if (colonIndex != -1) {
                                optionArray[j] = option.substring(colonIndex + 1).trim();
                            }
                        }
                %>
                <tr>
                    <td><%= questionNumber %></td>
                    <td><%= question %></td>
                    <td>
                        <select name="selectedOption">
                            <%
                                for (int j = 0; j < optionArray.length; j++) {
                                    String option = optionArray[j].trim();
                            %>
                            <option value="<%= option %>"><%= option %></option>
                            <%
                                }
                            %>
                        </select>
                    </td>
                </tr>
                <%
                    }
                %>
            </tbody>
        </table>
            <input type="hidden" name="questionNumber" value="<%= questionNumber %>">
            <div style="text-align: center; margin-top: 20px;">
                <input type="submit" value="Submit Answer">
            </div>
    </form>
<%
    } catch (ClassNotFoundException e) {
        e.printStackTrace();
        String errorMessage = "Database error: " + e.getMessage();
    } catch (SQLException e) {
        e.printStackTrace();
        String errorMessage = "Database error: " + e.getMessage();
    }
%>
</body>
</html>
