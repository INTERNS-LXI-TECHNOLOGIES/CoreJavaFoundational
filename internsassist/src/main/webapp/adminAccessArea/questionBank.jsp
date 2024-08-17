<%@ page import="java.io.*"%>
<%@ page import="java.sql.*"%>

<html>
<body>
<%
String url = "jdbc:mysql://localhost:3306/missionlifeordeath";
String username = "root";
String password = "arjun7945";

try {
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection conn = DriverManager.getConnection(url, username, password);
    Statement stmt = conn.createStatement();

    for (int i = 1; i <= 100; i++) {
        int randomNumber = (int) (Math.random() * 4) + 1;

        String query = "";
        switch (randomNumber) {
            case 1:
                query = "insert into questionbank(Question, Options, Answer, TaskLevel) VALUES('MCQ " + i + "', 'OPTION A: A OPTION B: B OPTION C: C OPTION D: D', 'A', 1)";
                break;
            case 2:
                query = "insert into questionbank(Question, Options, Answer, TaskLevel) VALUES('TRUEORFALSE " + i + "', 'OPTION A: TRUE OPTION B: FALSE OPTION C: NOT APPLICABLE OPTION D: NONE OF THE ABOVE', 'FALSE', 1)";
                break;
            case 3:
                query = "insert into questionbank(Question, Options, Answer, TaskLevel) VALUES('SOCIALSKILLS " + i + "', 'OPTION A: COMMUNICATION OPTION B: TEAMWORK OPTION C: PROBLEM-SOLVING OPTION D: LEADERSHIP', 'PROBLEM-SOLVING', 3)";
                break;
            case 4:
                query = "insert into questionbank(Question, Options, Answer, TaskLevel) VALUES('HACKATHON " + i + "', 'OPTION A: PROJECT 1 OPTION B: PROJECT 2 OPTION C: PROJECT 3 OPTION D: PROJECT 4', 'PROJECT 4', 4)";
                break;
        }

        stmt.executeUpdate(query);
    }
    conn.close();
} catch (ClassNotFoundException e) {
    e.printStackTrace();
} catch (SQLException e) {
    e.printStackTrace();
}
%>
</body>
</html>
