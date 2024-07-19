<%@ page import ="com.lxi.hungergame.model.*" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Game Result</title>
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
            font-size: 3rem;
            margin-bottom: 20px;
        }

        table {
            margin-top: 20px;
            width: 100%;
            border-collapse: collapse;
        }

        th, td {
            padding: 15px;
            border: 1px solid #fff;
        }

        th {
            background-color: #e74c3c;
        }

        td img {
            border-radius: 5px;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>Game Result</h1>
        <table>
            <tr>
                <th>RANK</th>
                <th>PLAYER</th>
            </tr>
            <%
                Forest forest = (Forest) application.getAttribute("f");
                int slNum = 1;
                for(Player p : forest.getWinners()) {
            %>
            <tr>
                <td><%= slNum %></td>
                <td>
                    <img src="<%= p.getImage() %>" alt="Player Image" width="50" height="50">
                    <%= p.getName() %>    
                </td>
            </tr>
            <%
                slNum++;
                }
            %>
        </table>
    </div>
</body>
</html>
