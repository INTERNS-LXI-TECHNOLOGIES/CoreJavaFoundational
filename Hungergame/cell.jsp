<%@ page import="com.lxisoft.hungergame.forest.*"%>
<%@ page import="java.util.List, java.util.ArrayList" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Hunger Game</title>
    <style>
        .bg-img {
            width: 100px; 
            height: 100px;
        }
        .player-img, .food-img, .hunter-img {
            position: absolute;
            max-width: 50px; /* Ensures the images don't get too big */
        }
        .player-img {
            width: 50px;
            height: 50px;
        }
        .food-img {
            width: 40px;
            height: 40px;
            bottom: 0; /* Align to bottom */
            left: 0; /* Align to left */
        }
        .hunter-img {
            width: 60px;  /* Increase the width */
            height: 60px; /* Increase the height */
            top: 0; /* Align to top */
            left: 0; /* Align to left */
        }
        .center-table {
            margin-left: auto;
            margin-right: auto;
            border-collapse: collapse; /* Makes the table look better */
            background-color: #14d688; /* Add background color to the table */
        }
        .center-table td, .center-table th {
            padding: 5px;
            border: 1px solid black; /* Adds border to table cells */
            position: relative; /* Set relative positioning for absolute positioned children */
            background-color: #6807ef; /* Add background color to table cells */
        }
        .center-table img {
            display: block;
            margin: auto;
        }
        .header {
            background-color: #06c7ad; /* Add background color to header */
        }
    </style>
    <script>
        function showMessage(message){
            alert(message);
        }
    </script>
</head>
<body>

<%


Forest f = (Forest) application.getAttribute("forest");
if (f != null&&f.getActivePlayer() == null && !f.getGamers().isEmpty()) {
    f.setActivePlayer(f.getGamers().get(0));
}

boolean gameContinous=true;
String killedPlayerName=null;
  
  if (request.getParameter("diceRoll")!=null) {
    killedPlayerName=f.getActivePlayer().getName();
    gameContinous=f.gameloop();

    // Check if active player has reached cell 100 and add to winners list

    if(!f.getWinners().isEmpty()){
        for(Player winner:f.getWinners()){%>
            <div class="message">
                <img src="<%= winner.getPlayerImg() %>" alt="Player Image" width="50" height="50">
                <%= winner.getName() %> WINNER
            </div>
            <% }    
        } 

        if(f.getGamers().size()==1){
            f.getWinners().add(f.getGamers().get(0));
            response.sendRedirect("result.jsp");
        }

        if(!gameContinous){
            %>
            <div class="message">
                <%= killedPlayerName %>Has been killed!
            </div>
      <%
        }
    }
    


%>

<table>
    <form action="cell.jsp">
        <%
        for (Player p : f.getGamers()) {
        %>
        
        <tr>
            <td><%= p.getName() %></td>
            <td><%= p.getHungerlevel() %></td>
            <td><img style="width: 50px; height: 50px;" src="<%= p.getPlayerImg() %>" /></td>
            
            <td><%= p.getResult() %></td>
                
            
            <td>
                <input type="submit" name="diceRoll"<%= p.equals(f.getActivePlayer())  ? "" : "disabled" %> value="Roll dice" />
            </td>
        </tr>
        <%
        }
        %>
    </form>
</table>

<table class="center-table">
    <%
    for (int i = 0; i < 10; i++) {
    %>
    <tr>
        <%
        for (int j = 0; j < 10; j++) {
        %>
        <td>
            <img class="bg-img" src="<%= f.getCell()[i][j].getBgimage() %>" />
            <%
            if (!f.getCell()[i][j].getHunters().isEmpty()) {
            %>
            <img class="player-img hunter-img" src="<%= f.getCell()[i][j].getHunters().get(0).getIcon() %>" />
            <%
            }
            if (!f.getCell()[i][j].getFoods().isEmpty()) {
            %>
            <img class="food-img" src="<%= f.getCell()[i][j].getFoods().get(0).getFoodImg() %>" />
            <%
            }
            if (!f.getCell()[i][j].getPlayers().isEmpty()) {
                for (Player p : f.getCell()[i][j].getPlayers()) {
            %>
            <img class="player-img" src="<%= p.getPlayerImg() %>" style="top: 40px; left: 40px;" />
            <%
                }
            }
            %>
        </td>
        <%
        }
        %>
    </tr>
    <%
    }
    %>
</table>


</body>
</html>
