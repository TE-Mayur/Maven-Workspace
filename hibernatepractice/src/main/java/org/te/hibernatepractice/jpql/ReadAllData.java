package org.te.hibernatepractice.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.te.hibernatepractice.beans.BrothersInfo;

public class ReadAllData {

	public static void main(String[] args) {
		EntityManagerFactory factory = null;
		EntityManager manager = null;

		try {
			factory = Persistence.createEntityManagerFactory("brothers");
			manager = factory.createEntityManager();

			String str = "from BrothersInfo";

			Query query = manager.createQuery(str);

			List<BrothersInfo> list = query.getResultList();

			for (BrothersInfo brothersInfo : list) {
				brothersInfo.getId();
				brothersInfo.getName();
				brothersInfo.getMail();
				brothersInfo.getDob();
				brothersInfo.getPassword();
				brothersInfo.getMobile();
				System.out.println("++++++++++++++++++++++++++++++++");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
//			finally {
//			if (factory != null) {
//				factory.close();
//			}
//			if (manager != null) {
//				manager.close();
//			}
//		}

	}
}
