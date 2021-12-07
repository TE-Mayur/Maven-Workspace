<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>TE | User</title>
 <link rel="stylesheet" href="./bootstrap-4.6.1-dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="./Loginform.css">
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
    <br>
    <br>
    <form action="" method="post" >
        <div>
            <h3 class="text-center badge-dark"> Welcome to TechnoElevate </h3>
            <br>
            <div class="input-container">
                <a href="./showdetails.jsp" class="btn btn-dark button ">View your account details</a>
            </div>
            <div class="input-container">
                <a href="./update.jsp" class="btn btn-dark button ">Update your details</a>
            </div>
            <div class="input-container">
                <a href="./delete.jsp" class="btn btn-dark button ">Delete your Account</a>
            </div>
            <div class="input-container">
                <a href="./Welcome.jsp" class="btn btn-dark button ">Logout</a>
            </div>
        </div>
    </form>
    <script src="./jquery.slim.min.js"></script>
    <script src="./bootstrap-4.6.1-dist/js/bootstrap.min.js"></script>
</body>
</html>