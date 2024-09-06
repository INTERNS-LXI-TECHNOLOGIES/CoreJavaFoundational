<%@ page import="com.lxisoft.hungerGame.model.*" %>

    <style>
        .player-entry img {
            width: 25px;
            height: 25px;
            border-radius: 50%;
        }
        .dice-button {
            padding: 5px 10px;
            background-color: white;
            color: black;
            border: none;
            border-radius: 5px;
            cursor: pointer;
        }
        .dice-button:hover {
            background-color: lightgray;
        }
        .dice-button-enabled {
            background-color: green;
        }
        .dice-button-disabled {
            background-color: red;
            cursor: not-allowed;
        }
        table {
			width: 50%;
			border-collapse: collapse;
			margin-left: 0;
			margin-top: 20px;
			float: left;
		}
        th, td {
            padding: 10px;
            text-align: center;
            width: 200px;
            height: 50px;
        }
    </style>

    <%
        Forest f = (Forest) application.getAttribute("forest");  
		Players activePlayer = f.getActivePlayer();
        if ( activePlayer == null )
		{
			activePlayer = f.getPlayer().get(0) ;
		}
    %>
    <h3>PLAYERS IN THE GAME:</h3>
    <table>
        <tr>
            <th>ICONS</th>
            <th>NAMES</th>
            <th>DICE RESULT</th>
            <th>CELL NUMBER</th>
            <th>DICE</th>
        </tr>
        <%
            for (Players player : f.getPlayer()) {
                if (player.getName() != null) {
                    boolean isEnabled = player.equals(activePlayer);
					
					String buttonClass = isEnabled ? " background-color: green;" : " background-color: red;";
					
					int diceResult = player.rollDice(f.getDice());
                    int cellNumber = player.getCellNumber();
        %>
        <tr class="player-entry">
            <td><img src="<%= player.getIcon() %>" alt="Player Icon"></td>
            <td><%= player.getName() %></td>
			<td><%= diceResult %></td>
            <td><%= cellNumber %></td>
            <td>
                <form action="gameLoop.jsp" method="post">
                    <input type="hidden" name="rollDice" value="true" />
                    <input type="submit" class="dice-button <%= isEnabled ? "dice-button-enabled" : "dice-button-disabled" %>" <%= isEnabled ? "" : "disabled" %> value="Roll Dice" />
                </form>
                </form>
            </td>
        </tr>
        <%
            }
			else {
                out.println("NO PLAYERS WERE ADDED");
            }
        }
        %>
    </table>