package com.te.casestudy.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.hibernate.sql.ordering.antlr.Factory;

public class UpdateDao {

	public static int update(String name, Double salary, String password){  
	        int status=0;  
	        try{  
	        	EntityManagerFactory factory = null;
	    		EntityManager manager = null;

	    		factory = Persistence.createEntityManagerFactory("console");
	    		manager = factory.createEntityManager();
	    	
	    		Integer newId=request.getParameter("newNumber");
	    		Double empSalary=request.getParameter("salary");
	    		String pwd=request.getParameter("password");
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
	    		response.sendRedirect("./success.jsp");
	    		}else{
	    		response.sendRedirect("./failure.jsp");
	    		}

	        
	        }catch (Exception e) {
	        	e.printStackTrace();
			}
	}
}
