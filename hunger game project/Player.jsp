<%@ page import ="com.lxi.hungergame.model.*" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Create Player</title>
    <style>
        * {
            box-sizing: border-box;
            margin: 0;
            padding: 0;
        }

        body {
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            background: linear-gradient(45deg, #2c3e50, #3498db);
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            color: #fff;
        }

        .container {
            text-align: center;
            background: rgba(0, 0, 0, 0.6);
            padding: 30px 40px;
            border-radius: 10px;
            box-shadow: 0 8px 16px rgba(0, 0, 0, 0.3);
        }

        h1 {
            font-size: 2.5rem;
            margin-bottom: 20px;
        }

        form {
            display: flex;
            flex-direction: column;
            align-items: center;
        }

        input[type="text"] {
            width: 80%;
            padding: 10px;
            margin: 10px 0;
            border: 2px solid #ccc;
            border-radius: 5px;
            font-size: 1rem;
        }

        input[type="submit"] {
            background-color: #e74c3c;
            color: #fff;
            border: none;
            padding: 10px 20px;
            font-size: 1.2rem;
            border-radius: 5px;
            cursor: pointer;
            transition: background-color 0.3s ease;
        }

        input[type="submit"]:hover {
            background-color: #c0392b;
        }

        .player-icon {
            width: 50px; /* Adjust player image size */
            height: 50px; /* Adjust player image size */
            border-radius: 50%;
            border: 2px solid #ddd;
            margin: 5px;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>Create Player</h1>
        <%
            String pname = request.getParameter("name");
            Forest forest = (Forest) application.getAttribute("f");

            if (forest == null) {
                forest = new Forest();
                application.setAttribute("f", forest);
                forest.initialise();
            }

            if (pname != null && !pname.trim().isEmpty()) { 
                forest.getGamers().add(new Player(pname, "image/player" + forest.getGamers().size() + ".jpeg"));
            }
        %>
        
        <form action="Player.jsp">
            <input type="text" name="name" placeholder="Enter Your Name" required>
            <input type="submit" value="Submit">
        </form>

        <div>
            <% for (Player player : forest.getGamers()) { %>
                <img class="player-icon" src="<%= player.getImage() %>" alt="<%= player.getName() %>">
            <% } %>
        </div>

        <form action="Forest.jsp">
            <input type="submit" value="Start Game">
        </form>
    </div>
</body>
</html>
