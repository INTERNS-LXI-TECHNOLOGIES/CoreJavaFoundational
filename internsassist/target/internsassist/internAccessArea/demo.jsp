<%@ page import="java.sql.*" %>
<%@ page import="com.lxisoft.model.MissionPrep" %>
<%
int cellnumber = Integer.parseInt(request.getParameter("cellnumber"));
    int taskLevel = 0;

    if (cellnumber >= 1 && cellnumber <= 25) {
        taskLevel = 1;
    } else if (cellnumber >= 26 && cellnumber <= 50) {
        taskLevel = 2;
    } else if (cellnumber >= 51 && cellnumber <= 75) {
        taskLevel = 3;
    } else if (cellnumber >= 76 && cellnumber <= 100) {
        taskLevel = 4;
    }
    String url = "jdbc:mysql://localhost:3306/missionlifeordeath";
    String username = "root";
    String password = "arjun7945";

    int[] randomNumbers = (int[]) session.getAttribute("randomNumbers");
    MissionPrep missionPrep = new MissionPrep();

    switch (taskLevel) {
        case 1:
            randomNumbers = missionPrep.randomNumbersForTaskLevel1();
            break;
        case 2:
            randomNumbers = missionPrep.randomNumbersForTaskLevel2();
            break;
        case 3:
            randomNumbers = missionPrep.randomNumbersForTaskLevel3();
            break;
        case 4:
            randomNumbers = missionPrep.randomNumbersForTaskLevel4();
            break;
    }

    session.setAttribute("randomNumbers", randomNumbers);

    Connection conn = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection(url, username, password);

        for (int i = 0; i < randomNumbers.length; i++) {
            String query = "SELECT * FROM questionbank WHERE QuestionNumber = ?";
            pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, randomNumbers[i]);
            rs = pstmt.executeQuery();

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
    <select name="answers">
        <%
            for (int j = 0; j < optionArray.length; j++) {
                String option = optionArray[j].trim();
        %>
        <option value="<%= option %>"><%= option %></option>
        <%
            }
        %>
    </select>
    <input type="hidden" name="questionNumbers" value="<%= questionNumber %>">
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
    } finally {
        try {
            if (rs != null) rs.close();
            if (pstmt != null) pstmt.close();
            if (conn != null) conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
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
