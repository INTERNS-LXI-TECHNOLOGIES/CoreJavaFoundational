<html>
<head>
    <title>CRUD CONTROL</title>
    <style>
        body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            background-color: #e0f7fa;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
        }
        .container {
            text-align: center;
            background-color: #ffffff;
            padding: 50px;
            border-radius: 15px;
            box-shadow: 0 8px 16px rgba(0, 0, 0, 0.2);
            width: 400px;
        }
        h1 {
            margin-bottom: 30px;
            color: #00796b;
            font-size: 2em;
        }
        .form-container {
            display: none;
            flex-direction: column;
            gap: 15px;
        }
        .form-container.active {
            display: flex;
        }
        select {
            padding: 10px;
            font-size: 15px;
            border-radius: 5px;
            border: 1px solid #00796b;
            width: calc(50% - 22px);
            margin-bottom: 20px;
            background-color: #ffffff;
            cursor: pointer;
        }
        input[type="text"] {
            padding: 10px;
            font-size: 16px;
            border-radius: 5px;
            border: 1px solid #00796b;
            width: 100%;
            margin-bottom: 20px;
        }
        input[type="submit"],
        input[type="reset"] {
            padding: 10px;
            font-size: 16px;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            transition: background-color 0.3s;
            width: 100%;
            margin-bottom: 20px;
        }
        input[type="submit"] {
            background-color: #007bff;
            color: white;
        }
        input[type="submit"]:hover {
            background-color: #0056b3;
        }
        input[type="reset"] {
            background-color: #f44336;
            color: white;
        }
        input[type="reset"]:hover {
            background-color: #d32f2f;
        }
    </style>
    <script>
        function convertToUppercase(input) {
            input.value = input.value.toUpperCase();
        }
    </script>
</head>
<body>
    <div class="container">

        <div id="searchForm" class="form-container">
            <h1>SEARCH USER DETAILS</h1>
            <form action="searchUser.jsp" method="post">
                <input type="text" name="username" placeholder="Enter Username" oninput="convertToUppercase(this);" required>
                <input type="submit" value="Search">
                <input type="reset" value="Reset">
            </form>
        </div>

    <div id="updateForm" class="form-container">
        <h1>UPDATE USER DETAILS</h1>
        <form action="updateUser.jsp" method="post">
            <input type="text" name="username" placeholder="Enter Username" oninput="convertToUppercase(this);" required>

            <select name="updateOption" onchange="this.form.newRole.style.display = (this.value === 'role') ? 'block' : 'none'; this.form.newNickName.style.display = (this.value === 'nickname') ? 'block' : 'none';" required>
                <option value="">CHOOSE UPDATE</option>
                <option value="role">CHANGE ROLE</option>
                <option value="nickname">CHANGE NICK NAME</option>
            </select>

            <input type="text" name="newRole" placeholder="Enter New Role" style="display:none;" oninput="convertToUppercase(this);">
            <input type="text" name="newNickName" placeholder="Enter New Nickname" style="display:none;" oninput="convertToUppercase(this);">

            <input type="submit" value="Update">
            <input type="reset" value="Reset">
        </form>
    </div>


        <div id="deleteForm" class="form-container">
            <h1>DELETE USER DETAILS</h1>
            <form action="deleteUser.jsp" method="post">
                <input type="text" name="username" placeholder="Enter Username" oninput="convertToUppercase(this);" required>
                <input type="submit" value="Delete">
                <input type="reset" value="Reset">
            </form>
        </div>
    </div>

    <script>
        const urlParams = new URLSearchParams(window.location.search);
        const action = urlParams.get('action');

        if (action === 'search') {
            document.getElementById('searchForm').classList.add('active');
        } else if (action === 'update') {
            document.getElementById('updateForm').classList.add('active');
        } else if (action === 'delete') {
            document.getElementById('deleteForm').classList.add('active');
        }
    </script>
</body>
</html>
