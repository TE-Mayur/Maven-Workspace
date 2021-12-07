package com.te.jpawithhibernate.beans;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GetInternsInfo {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("interns");
		
		EntityManager em = emf.createEntityManager();
		
//		InternsInfo info = em.find(InternsInfo.class, 50);
		InternsInfo info = em.getReference(InternsInfo.class, 50);
		
		if(info != null) {
			System.out.println(info.getName());
			System.out.println(info.getId());
			System.out.println(info.getGender());
			System.out.println(info.getDateOfBirth());
			System.out.println(info.getMobile());
			System.out.println(info.getSalary());
			System.out.println(info.getDesignation());
			System.out.println(info.getDeptId());
		}
		try {
			emf.close();
			em.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}

}
