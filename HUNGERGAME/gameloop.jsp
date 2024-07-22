<%@ page import="com.lxisoft.hungerGame.model.*" %>
<html>
<body>
<%
Forest f =(Forest)application.getAttribute("forest");
	f.gameloop();

%>

<h2>Players List</h2>
<table>
	<tr>
		<th>Icon</th>
		<th>Name</th>
		<th>Dice</th>
	</tr>
		<%
			for (Players player : f.getPlayers()) {
				if(player.getName() != null){
					boolean isEnabled = player.equals(f.getActivePlayer());
		%>
	<tr class=player List>
		<td><img>
		<td><%= player.getName()%></td>
		<td>
		<form action="gameloop.jsp">
		<button class="dice-button" <%= isEnabled ? "" : "disabled"       %> > Dice Roll </button>
		</form>
		</td>
		
		<%
			}
		}
	%>
</table>

</html>
</body>