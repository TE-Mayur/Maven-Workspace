package com.te.casestudy.controllers;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.te.casestudy.beans.EmployeesInfo;

import java.io.IOException;
import java.util.List;

public class ShowDetails extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
	
		EntityManagerFactory factory = null;
		EntityManager manager = null;
			
		
		factory = Persistence.createEntityManagerFactory("console");
		manager = factory.createEntityManager();
		
		HttpSession session = req.getSession();
		Integer oldId = (Integer)session.getAttribute("name");
		
		String que="from EmployeesInfo";
		
		Query query=manager.createQuery(que);
		
		List<EmployeesInfo> ref=query.getResultList();
		
		for(EmployeesInfo obj:ref) {
	}

}
		}