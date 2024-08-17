<%@ page import="com.lxisoft.model.MissionPrep" %>
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
    <h3>MISSION-PREP QUESTIONS</h3>
    <form action="/internsassist/checkAnswer.jsp" method="post">
        <table>
            <thead>
                <tr>
                    <th>Question No</th>
                    <th>Question</th>
                    <th>Options</th>
                </tr>
            </thead>
            <tbody>
                <%
                    String url = "jdbc:mysql://localhost:3306/missionlifeordeath";
                    String username = "root";
                    String password = "arjun7945";

                    int[] randomNumbers = (int[]) session.getAttribute("randomNumbers");
                    if (randomNumbers == null) {
                        MissionPrep missionPrep = new MissionPrep();
                        randomNumbers = missionPrep.randomNumbersFromMissionPrep();
                        session.setAttribute("randomNumbers", randomNumbers);
                    }

                    try {
                        Class.forName("com.mysql.cj.jdbc.Driver");
                        Connection conn = DriverManager.getConnection(url, username, password);
                        Statement stmt = conn.createStatement();

                        for (int i = 0; i < randomNumbers.length; i++) {
                            String query = "SELECT * FROM questionbank WHERE QuestionNumber = " + randomNumbers[i];
                            ResultSet rs = stmt.executeQuery(query);

                            while (rs.next()) {
                                int questionNumber = rs.getInt("QuestionNumber");
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
                        <select name="answers[<%= questionNumber %>]">
                            <%
                                for (int j = 0; j < optionArray.length; j++) {
                                    String option = optionArray[j].trim();
                            %>
                            <option value="<%= option %>"><%= option %></option>
                            <%
                                }
                            %>
                        </select>
                        <input type="hidden" name="questionNumbers[]" value="<%= questionNumber %>">
                    </td>
                </tr>
                <%
                    }
                }
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
                out.println("<script>alert('Database error: " + e.getMessage() + "');</script>");
            } catch (SQLException e) {
                e.printStackTrace();
                out.println("<script>alert('Database error: " + e.getMessage() + "');</script>");
            }
                %>
            </tbody>
        </table>
        <div style="text-align: center; margin-top: 20px;">
            <input type="submit" value="Submit All Answers">
        </div>
    </form>
</body>
</html>
