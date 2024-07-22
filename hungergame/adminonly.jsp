<%@ page import="com.lxisoft.hungergame.forest.*" %>

<% Forest f=new Forest();
application.setAttribute("forest",f);
f.creatingSpaceForArray();

    f.createFoods(); 
    f.createHunters();
%>
<html>
<body>

</body>
</html>
