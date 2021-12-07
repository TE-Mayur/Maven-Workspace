package com.te.casestudy.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.te.casestudy.beans.EmployeesInfo;

@WebServlet("/Register")
public class EmpRegister extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		EntityManagerFactory factory = null;
		EntityManager manager = null;
		EntityTransaction transaction = null;
		EmployeesInfo emp = null;

		try {

			factory = Persistence.createEntityManagerFactory("console");
			manager = factory.createEntityManager();
			transaction = manager.getTransaction();

			Integer id = Integer.parseInt(req.getParameter("id"));
			String name = req.getParameter("name");
			String desgination = req.getParameter("desgination");

			Date hiredate = null;

			try {
				hiredate = new SimpleDateFormat("yyyy-MM-dd").parse(req.getParameter("hiredate"));
			} catch (ParseException e) {

				e.printStackTrace();
			}

			Double salary = Double.parseDouble(req.getParameter("salary"));
			String password = req.getParameter("password");

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
				emp.setHiredate(hiredate);
				emp.setSalary(salary);
				emp.setPassword(password);

				manager.persist(emp);

				transaction.commit();

				resp.sendRedirect("./registerSuccess.jsp");
			} else {
				resp.sendRedirect("./failure.jsp");
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
	}
}
