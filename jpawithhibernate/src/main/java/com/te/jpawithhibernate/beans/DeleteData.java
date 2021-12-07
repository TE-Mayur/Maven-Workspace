package com.te.jpawithhibernate.beans;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeleteData {
	public static void main(String[] args) {

		EntityManagerFactory factory = null;
		EntityManager manager = null;
		EntityTransaction transaction = null;

		try {
			factory = Persistence.createEntityManagerFactory("interns");
			manager = factory.createEntityManager();
			transaction = manager.getTransaction();
			transaction.begin();
			InternsInfo info = manager.find(InternsInfo.class, 130);
			manager.remove(info);
			transaction.commit();
			System.out.println("Deleted Successfully");

		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
			try {
				manager.close();
				factory.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}
