<html>
<head>
    <title>ADD NAMES</title>
    <style>
        body {
            margin: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            background-color: #f0f0f0;
        }
		.image-container {
            position: relative;
            width: 100%;
            height: 100%;
            text-align: center;
        }
        img {
            width: 100%;
            height: 100%;
            object-fit: cover;
        }
		.overlay {
            position: absolute;
            top: 0;
            left: 0;
            width: 100%;
            height: 100%;
            display: flex;
            flex-direction: column;
            justify-content: center;
            align-items: center;
            background: rgba(0, 0, 0, 0.4);
        }
       .form-container {
            padding: 20px;
            border-radius: 10px;
            text-align: center;
            color: white;
            width: 34%;
            border:5px solid rgba(0, 0, 0, 0.3);
        }
        .form-container input{
            margin: 10px 0;
            padding: 10px;
            font-size: 1em;
			width: 80%;
        }
        .form-container button {
            margin: 10px 0;
            padding: 10px;
            font-size: 1em;
			width: 50%;
        }
        .confirm-button {
            background-color: #28a745;
            color: white;
            border: none;
            border-radius: 5px;
            cursor: pointer;
        }
        .confirm-button:hover {
            background-color: #218838;
        }
    </style>
</head>
<body>
	<div class="image-container">
        <img src="/hungerGame/HungerGame-img/bgImageForNameAdding.jpg">
        <div class="overlay">
            <div class="form-container">
                <h2>ENTER PLAYER NAME</h2>
                <form action="saveName.jsp" method="post">
                    <input type="text" name="player1" placeholder="Player Name" required>
                    <button type="submit" class="confirm-button">SUBMIT</button>
                </form>
            </div>
        </div>
    </div>
</body>
</html>
