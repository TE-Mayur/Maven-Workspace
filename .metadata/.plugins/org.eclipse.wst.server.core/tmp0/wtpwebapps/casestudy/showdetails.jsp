<%@page import="javax.persistence.Query"%>
<%@page import="com.te.casestudy.beans.EmployeesInfo"%>
<%@page import="java.util.List"%>
<%@page import="javax.persistence.Persistence"%>
<%@page import="javax.persistence.EntityManager"%>
<%@page import="javax.persistence.EntityManagerFactory"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>TE | Account Info</title>
<link rel="stylesheet" type="text/css"
	href="./bootstrap-4.6.1-dist/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="./Loginform.css">
</head>
<body>
	<nav class="navbar navbar-dark bg-warning">
		<div class="container">
			<a class="navbar-brand" href="./Welcome.jsp"> <img src="te.jpeg"
				alt="" width="180" height="50"> &emsp;&emsp;&emsp; <a
				href="./Welcome.jsp" class="btn btn-dark ">Home</a>
			</a>
		</div>
	</nav>
	<br>
	<br>
	<br>
	<form class="border-3">
		<table border="1">
			<%
			EntityManagerFactory factory = null;
			EntityManager manager = null;

			try {

				factory = Persistence.createEntityManagerFactory("console");
				manager = factory.createEntityManager();

				
				Integer oldId = (Integer) session.getAttribute("name");

				String que = "from EmployeesInfo ";

				Query query = manager.createQuery(que);

				List<EmployeesInfo> ref = query.getResultList();

				for (EmployeesInfo obj : ref) {
			%>

			<h3 class="text-center">Employee Account Details</h3>

			<br>
			<tr>
				<td><b> Employee Id: </b></td>
				<td>&emsp;<b> <%=obj.getId()%>
				</b></td>
			</tr>
			<tr>
				<th>Name:</th>
				<td>&emsp;<b> <%=obj.getName()%>
				</b></td>
			</tr>
			<tr>
				<th>Role:</th>
				<td>&emsp;<b> <%=obj.getDesgination()%>
				</b></td>
			</tr>
			<tr>
				<th>Hire Date:</th>
				<td>&emsp;<b> <%=obj.getHiredate()%>
				</b></td>
			</tr>
			<tr>
				<th>Salary:</th>
				<td>&emsp;<b> <%=obj.getSalary()%>
				</b></td>
			</tr>
			<tr>
				<th>Password:</th>
				<td>&emsp;<b> <%=obj.getPassword()%>
				</b></td>
			</tr>
			<br>
		</table>
		<br> <a href="./user.jsp" class="btn btn-dark">Go Back</a>
	</form>
	<script src="./jquery.slim.min.js"></script>
	<script src="./bootstrap-4.6.1-dist/js/bootstrap.min.js"></script>
</body>
</html>
<%
	}
%>
<%
	} catch (Exception e) {
e.printStackTrace();
} finally {
if (manager != null) {
	manager.close();
}
if (factory != null) {
	factory.close();
}

}
%>