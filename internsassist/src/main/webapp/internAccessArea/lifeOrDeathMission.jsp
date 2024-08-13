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

    LifeOrDeathMission lifeordeathmission = new LifeOrDeathMission();
    int randomNumbers = lifeordeathmission.pickRandomNumberFromMissionPrep();

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection(url, username, password);
        Statement stmt = conn.createStatement();

        String query = "SELECT * FROM questionbank WHERE QuestionNumber = " + randomNumbers;
        ResultSet rs = stmt.executeQuery(query);
%>
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
                        int questionNumber = rs.getInt("QuestionNumber");
                        String question = rs.getString("Question");
                        String[] options = question.split("OPTION ");
                %>
                <tr>
                    <td><%= questionNumber %></td>
                    <td><%= options[0].trim() %></td>
                    <td>
                        <select name="selectedOption">
                            <%
                            for (int i = 1; i < options.length; i++) {
                            String option = "OPTION " + options[i];
                            String optionValue = option.substring(option.indexOf(":") + 2).trim();
                            String optionLetter = option.split(":")[0].trim();
                            %>
                            <option value="<%= optionLetter %>"><%= optionLetter %>: <%= optionValue %></option>
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
        <br/>
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
