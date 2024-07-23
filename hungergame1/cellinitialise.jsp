<%@ page import="com.lxi.hungergame.model.*" %>
<%@ page import="java.util.ArrayList" %>

<%
Forest f = (Forest) application.getAttribute("forest");

if (f == null) {
  out.println("Forest object not found.");
  return;
}

if (f.getActivep() == null && !f.getGamers().isEmpty()) {
  f.setActivep(f.getGamers().get(0));
}

if (request.getParameter("started") != null) {
  f.gameLoop();
}
%>
<html>
  <head>
    <title>Hunger Game Forest</title>
    <meta http-equiv="refresh" content="5">
    <style>
      body {
        font-family: Arial, sans-serif;
        background-color: #f8f9fa;
        color: #333;
        text-align: center;
        padding: 20px;
        margin: 0;
      }
      h1 {
        color: #343a40;
        font-size: 2em;
        margin-bottom: 20px;
      }
      table {
        margin: 0 auto;
        border-collapse: collapse;
        box-shadow: 0 2px 3px rgba(0, 0, 0, 0.1);
        background-color: #fff;
        width: 90%;
        max-width: 1000px;
      }
      td {
        width: 50px;
        height: 50px;
        position: relative;
        border: 1px solid #ddd;
        background-size: cover;
        background-position: center;
      }
      .player-table {
        width: 60%;
        max-width: 600px;
        margin-bottom: 20px;
      }
      img {
        max-width: 100%;
        max-height: 100%;
      }
      .food-icon {
        position: absolute;
        bottom: 5px;
        right: 5px;
        width: 25px;
        height: 25px;
        pointer-events: none;
      }
      .container {
        display: flex;
        flex-direction: column;
        align-items: center;
      }
      .table-wrapper {
        overflow-x: auto;
      }
      .players-container {
        display: flex;
        justify-content: center;
        margin-bottom: 20px;
      }
      @media (max-width: 768px) {
        table, td {
          font-size: 0.8em;
        }
        .player-table {
          width: 90%;
        }
      }
      .winner-popup {
        background-color: #d4edda;
        border: 1px solid #c3e6cb;
        padding: 20px;
        margin-bottom: 20px;
        display: inline-block;
      }
      .winner-popup h2 {
        margin: 0 0 10px;
      }
    </style>
  </head>
  <body>
    <h1>Hunger Game Forest</h1>
    <% if (!f.getWinnersOfGame().isEmpty()) { %>
    <div class="winner-popup">
      <h2>Winners:</h2>
      <ul>
        <% for (Player winner : f.getWinnersOfGame()) { %>
        <li><%= winner.getName() %> (Cell: <%= winner.getCellCount() %>)</li>
        <% } %>
      </ul>
    </div>
    <% } %>
    <h2>Players List</h2>
    <table class="player-table" border="1">
      <tr>
        <th>Name</th>
        <th>Image</th>
        <th>Dice result</th>
        <th>Hunger Level</th>
      </tr>
      <% for (Player player : f.getGamers()) { %>
      <tr>
        <td><%= player.getName() %></td>
        <td>
          <img
            src="<%= player.getPImage() %>"
            alt="Player Image"
            width="100"
            height="100"
          />
          <form action="cellinitialise.jsp">
            <input type="submit" name="started" <%= player.equals(f.getActivep()) ? "" : "disabled" %> value="Roll Dice" />
          </form>
        </td>
        <td><%= player.getDiceResult() %></td>
        <td><%= player.getHungerlevel() %></td>
      </tr>
      <% } %>
    </table>
    <div class="table-wrapper">
      <table>
        <% for (int i = 0; i < 10; i++) { %>
        <tr>
          <% for (int j = 0; j < 10; j++) { %>
          <td style="background-image: url('<%= f.getCell()[i][j].getBgimage() %>');">
            <% for (Player player : f.getCell()[i][j].getPlayers()) { %>
              <div class="player"><%= player.getName() %>
                <img src="<%= player.getPImage() %>" alt="Player Image" width="100" height="100">
              </div>
            <% } %>
            <% if(!f.getCell()[i][j].getFoods().isEmpty()) { %>
            <img class="food-icon" src="<%= f.getCell()[i][j].getFoods().get(0).getIcon() %>" />
            <% } %>
            <% if(!f.getCell()[i][j].getHunters().isEmpty()) { %>
            <img class="food-icon" src="<%= f.getCell()[i][j].getHunters().get(0).getHuntericon() %>" />
            <% } %>
          </td>
          <% } %>
        </tr>
        <% } %>
      </table>
    </div>
  </body>
</html>
