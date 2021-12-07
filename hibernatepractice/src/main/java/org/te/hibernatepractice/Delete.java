package org.te.hibernatepractice;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.transaction.Transaction;

import org.jboss.jandex.ThrowsTypeTarget;
import org.te.hibernatepractice.beans.BrothersInfo;

public class Delete {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = null;
		EntityManager manager = null;
		EntityTransaction transaction = null;
		
		try {
			factory = Persistence.createEntityManagerFactory("brothers");
			manager = factory.createEntityManager();
			transaction = manager.getTransaction();
			BrothersInfo brothersInfo = manager.getReference(BrothersInfo.class, 60);
			transaction.begin();
			manager.remove(brothersInfo);
			transaction.commit();
			System.out.println("Deleted Successfully");
			
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		}finally {
			factory.close();
			manager.close();
		}
	}
}
