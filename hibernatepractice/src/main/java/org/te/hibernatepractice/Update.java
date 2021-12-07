package org.te.hibernatepractice;

import java.sql.Date;

//import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.te.hibernatepractice.beans.BrothersInfo;

public class Update {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = null;
		EntityManager manager = null;
		EntityTransaction transaction = null;
		
		try {
			factory = Persistence.createEntityManagerFactory("brothers");
			manager = factory.createEntityManager();
			transaction = manager.getTransaction();
			BrothersInfo brothersInfo = manager.find(BrothersInfo.class, 50);
			transaction.begin();
			brothersInfo.setName("Yash");
			brothersInfo.setMail("yash@gmail.com");
			brothersInfo.setPassword("yash123");
			brothersInfo.setDob(Date.valueOf("1999-05-23"));
			brothersInfo.setMobile(8945356193L);
			transaction.commit();
			System.out.println("Updated Successfully");
			
		}catch (Exception e) {
			transaction.rollback();
		}finally {
			factory.close();
			manager.close();
		}
	}
}
