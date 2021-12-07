package org.te.hibernatepractice;

import java.sql.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.te.hibernatepractice.beans.BrothersInfo;

public class Insert {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = null;
		EntityManager manager = null;
		EntityTransaction transaction = null;
		BrothersInfo brothersInfo = new BrothersInfo();
		
		brothersInfo.setId(60);
		brothersInfo.setName("Rahul");
		brothersInfo.setMail("rahul@gmail.com");
		brothersInfo.setDob(Date.valueOf("1999-07-29"));
		brothersInfo.setMobile(954946146L);
		brothersInfo.setPassword("rahul123");
		
		try {
			factory = Persistence.createEntityManagerFactory("brothers");
			manager = factory.createEntityManager();
			transaction = manager.getTransaction();
			transaction.begin();
			manager.persist(brothersInfo);
			transaction.commit();
			System.out.println("Inserted Successfully");
			
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		}finally {
			factory.close();
			manager.close();
		}
	}
}
