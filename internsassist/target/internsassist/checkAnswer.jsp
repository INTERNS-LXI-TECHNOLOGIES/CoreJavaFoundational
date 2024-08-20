<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.Statement" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.SQLException" %>

<html>
<head>
    <title>CHECK ANSWER</title>
</head>
<body>
<%
    String url = "jdbc:mysql://localhost:3306/missionlifeordeath";
    String username = "root";
    String password = "arjun7945";

    String[] questionNumbers = request.getParameterValues("questionNumbers");
    String[] selectedAnswers = request.getParameterValues("answers");
    String selectedAnswer = request.getParameter("selectedOption");
    String questionNumber = request.getParameter("questionNumber");

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection(url, username, password);
        Statement stmt = conn.createStatement();

        // Answer checking for mission prep
        if (questionNumbers != null && selectedAnswers != null) {
            for (int i = 0; i < questionNumbers.length; i++) {
                String query = "SELECT Answer FROM questionbank WHERE QuestionNumber = " + questionNumbers[i];
                ResultSet rs = stmt.executeQuery(query);

                if (rs.next()) {
                    String correctAnswer = rs.getString("Answer");
                    String answer = selectedAnswers[i];

                    if (correctAnswer.equalsIgnoreCase(answer)) {
                        out.println("<script>alert('ANSWER FOR QUESTION NUMBER " + questionNumbers[i] + " IS CORRECT');</script>");
                    } else {
                        out.println("<script>alert('WRONG ANSWER FOR QUESTION NUMBER " + questionNumbers[i] + "');</script>");
                    }
                }
            }
        } 

        // Answer checking page for lifeordeath mission
        else if (questionNumber != null && selectedAnswer != null) {
            String query = "SELECT Answer FROM questionbank WHERE QuestionNumber = " + questionNumber;
            ResultSet rs = stmt.executeQuery(query);

            if (rs.next()) {
                String correctAnswer = rs.getString("Answer");
                if (correctAnswer.equalsIgnoreCase(selectedAnswer)) {
                    out.println("<script>alert('CORRECT ANSWER FOR QUESTION " + questionNumber + "');</script>");
                } else {
                    out.println("<script>alert('WRONG ANSWER FOR QUESTION " + questionNumber + "');</script>");
                }
            }
        } else {
            out.println("<script>alert('CANNOT FIND DETAILS');</script>");
        }
    } catch (ClassNotFoundException e) {
        e.printStackTrace();
        out.println("Database error: " + e.getMessage());
    } catch (SQLException e) {
        e.printStackTrace();
        out.println("Database error: " + e.getMessage());
    }
%>
</body>
</html>
