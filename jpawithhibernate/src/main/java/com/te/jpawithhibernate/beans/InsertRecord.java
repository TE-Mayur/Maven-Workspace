package com.te.jpawithhibernate.beans;

import java.sql.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class InsertRecord {

	public static void main(String[] args) {

		EntityManagerFactory factory = null;
		EntityManager manager = null;
		EntityTransaction transaction = null;

		InternsInfo info = new InternsInfo();

		info.setDateOfBirth(Date.valueOf("1998-07-25"));
		info.setDeptId(200);
		info.setDesignation("SSD");
		info.setEmailId("nhfbvhjf@gmail.com");
		info.setGender("M");
		info.setId(160);
		info.setMobile(9684549566L);
		info.setName("Kishore");
		info.setSalary(30000.00);

		try {
			factory = Persistence.createEntityManagerFactory("interns");
			manager = factory.createEntityManager();
			transaction = manager.getTransaction();
			transaction.begin();
			manager.persist(info);
			transaction.commit();
			System.out.println("Inserted Successfully");

		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		}

		finally {
			try {
				manager.close();
				factory.close();
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}
