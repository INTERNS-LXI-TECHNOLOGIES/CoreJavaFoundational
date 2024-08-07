<%@ page import="com.lxisoft.model.MissionPrep" %>
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
        MissionPrep missionPrep = new MissionPrep();
        missionPrep.randomNumberFromMissionPrep();
        int randomNumber = missionPrep.getResult();

        String query = "";
        switch (randomNumber) {
            case 1:
                query = "INSERT INTO QuestionBank(Question, Answer, TaskLevel) VALUES('MCQ" + i + "', 'B', 1);";
                break;
            case 2:
                query = "INSERT INTO QuestionBank(Question, Answer, TaskLevel) VALUES('TRUEORFALSE" + i + "', 'B', 1);";
                break;
            case 3:
                query = "INSERT INTO QuestionBank(Question, Answer, TaskLevel) VALUES('SOCIALSKILLS" + i + "', 'B', 3);";
                break;
            case 4:
                query = "INSERT INTO QuestionBank(Question, Answer, TaskLevel) VALUES('HACKATHON" + i + "', 'B', 4);";
                break;
        }

        stmt.executeUpdate(query);
    }
    conn.close();
} catch (ClassNotFoundException e) {
    e.printStackTrace();
}
%>
</body>
</html>