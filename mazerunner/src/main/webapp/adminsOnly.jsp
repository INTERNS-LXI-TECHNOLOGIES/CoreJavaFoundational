<%@ page import="com.lxisoft.model.QuestionBank" %>

<html>
<head>
    <title>Admin Page</title>
    <style>
        .image-container {
            position: fixed;
            top: 0;
            left: 0;
            width: 100%;
            height: 100%;
            z-index: -1;
        }
        .image-container img {
            width: 100%;
            height: 100%;
            object-fit: cover;
        }
        h1 {
            position: absolute;
            top: 50%;
            left: 50%;
            transform: translate(-50%, -50%);
            font-size: 2.4em;
            color: rgb(72, 72, 141);
            font-family: Bahnschrift;
            z-index: 1;
        }
        .button-container {
            position: absolute;
            top: 60%;
            left: 50%;
            transform: translate(-50%, -50%);
            z-index: 1;
        }
        .button-container button {
            font-size: 1.2em;
            padding: 10px 20px;
            background-color: rgb(72, 72, 141);
            color: white;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            font-family: Bahnschrift;
            z-index: 2; /* Ensures the button is above other elements */
        }
        .button-container button:hover {
            background-color: rgb(50, 50, 120);
        }
    </style>
</head>
<body>
    <div class="image-container">
        <img src="/hungerGame/HungerGame-img/icon/adminsOnlyICON.jpg">
    </div>
    <%
    QuestionBank qb = (QuestionBank) application.getAttribute("questionBank");
    if (qb == null) {
        qb = new QuestionBank();
        application.setAttribute("questionBank", qb);
    }
    %>
    <h1>ADMIN HAD STARTED THE GAME</h1>
    <div class="button-container">
        <form action="frontPage.jsp">
            <button type="submit">ADMIN START</button>
        </form>
    </div>
</body>
</html>
