package com.te.jpawithhibernate.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class CountOfInterns {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("interns");
		EntityManager manager = factory.createEntityManager();
		
		String countOf = "select count(*) from InternsInfo";
		
		Query query = manager.createQuery(countOf);
		
		Object res = query.getSingleResult();
		
		System.out.println("No. of Employees => " + res);
	
		manager.close();
		factory.close();
	}
}