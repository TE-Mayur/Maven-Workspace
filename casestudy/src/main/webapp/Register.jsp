<%@page import="javax.persistence.Query"%>
<%@page import="javax.persistence.Persistence"%>
<%@page import="java.text.ParseException"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@page import="com.te.casestudy.beans.EmployeesInfo"%>
<%@page import="javax.persistence.EntityTransaction"%>
<%@page import="javax.persistence.EntityManager"%>
<%@page import="javax.persistence.EntityManagerFactory"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>TE | Register</title>
<link rel="stylesheet" type="text/css" href="./bootstrap-4.6.1-dist/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="./Design.css">
</head>
<body>
<%
EntityManagerFactory factory = null;
EntityManager manager = null;
EntityTransaction transaction = null;
EmployeesInfo emp = null;

try {

	factory = Persistence.createEntityManagerFactory("console");
	manager = factory.createEntityManager();
	transaction = manager.getTransaction();

	Integer id = Integer.parseInt(request.getParameter("id"));
	String name = request.getParameter("name");
	String desgination = request.getParameter("desgination");

	Date date = null;

	try {
		date = new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("hiredate"));
	} catch (Exception e) {
		e.printStackTrace();
	}

	Double salary = Double.parseDouble(request.getParameter("salary"));
	String password = request.getParameter("password");

	String que1 = "Select count(*) from EmployeesInfo where id=:em";
	Query queryEmpno = manager.createQuery(que1);

	Object resEmpno = queryEmpno.setParameter("em", id).getSingleResult();

	int i = ((Number) resEmpno).intValue();

	if (i == 0) {

		transaction.begin();
		emp = new EmployeesInfo();

		emp.setId(id);
		emp.setName(name);
		emp.setDesgination(desgination);;
		emp.setHiredate(date);
		emp.setSalary(salary);
		emp.setPassword(password);

		manager.persist(emp);

		transaction.commit();

		response.sendRedirect("/registerSuccess.jsp");
	} else {
		response.sendRedirect("/failure.jsp");
	}

} catch (Exception e) {
	transaction.rollback();
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

 <nav class="navbar navbar-dark bg-warning">
        <div class="container">
            <a class="navbar-brand" href="./Welcome.jsp">
                <img src="te.jpeg" alt="" width="180" height="50">&emsp;&emsp;&emsp;
                <a href="./Welcome.jsp" class="btn btn-dark ">Home</a>
            </a>
        </div>
    </nav>
    <form>
        <table>
        <div class="input-container">
            <h3 class="text-center badge-dark">New User Registration Sign Up</h3>
            <div>
                <label class="lab" for="id">Enter user Id : </label>
                <input class="input-field" type="number" name="id">
            </div>
            <br>
            <div>
                <label class="lab" for="name">Enter your name : </label>
                <input class="input-field" type="text" name="name">
            </div>
            <br>
            <div>
                <label class="lab" for="desgination">Enter the Employee Designation : </label>
                <input class="input-field" type="text" name="desgination">
            </div>
            <br>
            <div>
                <label class="lab" for="hiredate" >Enter the Employee Hiredate : </label>
                <input class="input-field" type="date" name="hiredate">
            </div>
            <br>
            <div>
                <label class="lab" for="salary" >Enter the Employee Salary : </label>
                <input class="input-field" type="number" name="salary">
            </div>
            <br>
            <div>
                <label class="lab"  for="password" >Enter the Password : </label>
                <input class="input-field" type="password" name="password">
            </div>
            <br>
            <div class="text-center">
                <button class="btn btn-dark" type="submit">Register</button>
            </div>
            <br>
            <div class="text-center">
                <button class="btn btn-dark" type="reset">Reset</button>
            </div>
        </div>
    </table>
    </form>
    <script src="./jquery.slim.min.js"></script>
    <script src="./bootstrap-4.6.1-dist/js/bootstrap.min.js"></script>
</body>
</html>