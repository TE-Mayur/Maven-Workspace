package com.te.jpawithhibernate.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class UpdateRecord {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("interns");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		
		String update = "update InternsInfo set name='Vignesh',"
				+ "salary = 40000.00 where id = 120"; 
		
		Query query = manager.createQuery(update);
		
		int res = query.executeUpdate();
		System.out.println(res + "No of rows effected");
		
		transaction.commit();
		manager.close();
		factory.close();
	}
}