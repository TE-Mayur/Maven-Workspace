package com.te.jpawithhibernate.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DynamicUpdateRecord {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("interns");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();

		String update = "update InternsInfo set name=:nm , salary = :sal where id = :id";

		Query query = manager.createQuery(update);

		query.setParameter("nm", "Harry");
		query.setParameter("sal", 2000.00);

		query.setParameter("id", 150);

		int res = query.executeUpdate();
		transaction.commit();
		System.out.println(res + " No of rows effected");

		manager.close();
		factory.close();

	}

}
