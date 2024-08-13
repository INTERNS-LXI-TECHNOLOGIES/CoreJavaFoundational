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
                query = "insert into questionbank(Question, Answer, TaskLevel) VALUES('MCQ" + i + " OPTION 1: A OPTION 2: B OPTION 3: C OPTION 4: D', 'B', 1)";
                break;
            case 2:
                query = "insert into questionbank(Question, Answer, TaskLevel) VALUES('TRUEORFALSE" + i + " OPTION 1: TRUE OPTION 2: FALSE OPTION 3: NOT APPLICABLE OPTION 4: NONE OF THE ABOVE', 'B', 1)";
                break;
            case 3:
                query = "insert into questionbank(Question, Answer, TaskLevel) VALUES('SOCIALSKILLS" + i + " OPTION 1: COMMUNICATION OPTION 2: TEAMWORK OPTION 3: PROBLEM-SOLVING OPTION 4: LEADERSHIP', 'B', 3)";
                break;
            case 4:
                query = "insert into questionbank(Question, Answer, TaskLevel) VALUES('HACKATHON" + i + " OPTION 1: PROJECT 1 OPTION 2: PROJECT 2 OPTION 3: PROJECT 3 OPTION 4: PROJECT 4', 'B', 4)";
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
