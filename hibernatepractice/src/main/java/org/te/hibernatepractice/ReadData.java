package org.te.hibernatepractice;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.te.hibernatepractice.beans.BrothersInfo;

public class ReadData {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = null;
		
		EntityManager em = null;
		try {
			emf = Persistence.createEntityManagerFactory("brothers");
			
			em = emf.createEntityManager();
			
			BrothersInfo brothersInfo = em.find(BrothersInfo.class, 30);
			
			if (brothersInfo != null) {
				System.out.println(brothersInfo.getName());
				System.out.println(brothersInfo.getMail());
				System.out.println(brothersInfo.getPassword());
				System.out.println(brothersInfo.getDob());
				System.out.println(brothersInfo.getId());
				System.out.println(brothersInfo.getMobile());
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if (emf != null) {
					emf.close();
				}
				if (em != null) {
					em.close();
				}
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
	}
}
