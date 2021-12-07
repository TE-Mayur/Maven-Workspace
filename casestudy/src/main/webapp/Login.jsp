<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>TE | Login</title>
<link rel="stylesheet" type="text/css" href="./bootstrap-4.6.1-dist/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="./Loginform.css">
</head>
<body>
 <nav class="navbar navbar-dark bg-warning">
        <div class="container">
            <a class="navbar-brand" href="./Welcome.jsp">
                <img src="te.jpeg" alt="" width="180" height="50"> &emsp;&emsp;&emsp; 
                <a href="./Welcome.jsp" class="btn btn-dark ">Home</a>
            </a>
        </div>
    </nav>
    <form action="./loginref" method="post">
        <div>
            <h3 class="text-center badge-dark"> Please fill your details to Login </h3>
            <div class="input-container">
                <i class="fas fa-users icon"></i>
                <input class="input-field" type="text" name="id" id="id" placeholder="Enter your user id">
            </div>
            <div class="input-container">
                <i class="fas fa-unlock-alt icon"></i>
                <input class="input-field" type="password" name="password" id="password" placeholder="Password">
            </div>
            <div>
            <button class="btn btn-dark button" type="submit">Login</button>
        </div>
        </div>
    </form>

    <script src="./jquery.slim.min.js"></script>
    <script src="./bootstrap-4.6.1-dist/js/bootstrap.min.js"></script>
</body>
</html>