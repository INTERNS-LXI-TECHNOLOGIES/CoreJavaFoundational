<%@ page import="com.lxi.hungergame.model.*" %>
<html>
  <body>
    <% String n = request.getParameter("name"); 
		Forest f=(Forest) application.getAttribute("forest"); 
		if (f== null){ 
			out.println("Admin not Started the game"); 
	} 
	else{ 
		f.getGamers().add(new Player(n,"/hungergame1/images/playerimages/player"+f.getGamers().size()+".jpg")); 
		out.println("Player Added Sucessfully");
		f.setTotalplayers(f.getGamers().size());
	} %>

    <form action="cellinitialise.jsp">
      <input type="submit" value="Go to Forest" />
    </form>
  </body>
</html>
