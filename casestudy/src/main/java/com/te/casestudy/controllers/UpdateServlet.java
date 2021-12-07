package com.te.casestudy.controllers;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class UpdateServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		EntityManagerFactory factory = null;
		EntityManager manager = null;

		factory = Persistence.createEntityManagerFactory("console");
		manager = factory.createEntityManager();
		
		Integer newId=Integer.parseInt(request.getParameter("newNumber"));
		Double empSalary=Double.parseDouble(request.getParameter("salary"));
		String pwd=request.getParameter("password");
		HttpSession session = request.getSession();
		Integer oldId=(Integer)session.getAttribute("id");

		String que="update EmployeesInfo set empno=:newId,salary=:sal and password=:pwd where empno=:oldId";
		Query query=manager.createQuery(que);

		query.setParameter("newId",newId);
		query.setParameter("sal",empSalary);
		query.setParameter("pwd",pwd);
		query.setParameter("oldId",oldId);

		String que1="Select count(*) from EmployeesInfo where empno=:newId";

		Query query1=manager.createQuery(que1);

		query1.setParameter("newId",newId);

		Object check=query1.getSingleResult();

		int x=((Number)check).intValue();

		if(x==0){
		query.executeUpdate();
		response.sendRedirect("./user.jsp");
		}else{
		response.sendRedirect("./updatefail.jsp");
		}

	}
}
