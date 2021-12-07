<%@page import="javax.persistence.Query"%>
<%@page import="javax.persistence.Persistence"%>
<%@page import="javax.persistence.EntityManager"%>
<%@page import="javax.persistence.EntityManagerFactory"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>TE | Delete</title>
 <link rel="stylesheet" href="./bootstrap-4.6.1-dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="./Loginform.css">
</head>
<body>
<%

EntityManagerFactory factory = null;
EntityManager manager = null;

factory = Persistence.createEntityManagerFactory("console");
manager = factory.createEntityManager();


Integer id=(Integer)session.getAttribute("id");

String que="delete from EmployeesInfo where empno=:oldId";

Query query=manager.createQuery(que);

query.setParameter("name", id);

query.executeUpdate();

response.sendRedirect("./homepage.jsp");
%>
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
    <form >
        <div>
            <h3 class="text-center badge-dark"> ARE YOU SURE U WANT TO DELETE YOUR ACCOUNT !!! </h3>
            <br>
            <div class="input-container">
                <a href="./Welcome.jsp" class="btn btn-dark button ">YES</a>
            </div>
            <br>
            <div class="input-container">
                <a href="./user.jsp" class="btn btn-dark button ">NO</a>
            </div>
        </div>
    </form>
    <script src="./jquery.slim.min.js"></script>
    <script src="./bootstrap-4.6.1-dist/js/bootstrap.min.js"></script>



</body>
</html>