package com.te.carapplication.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.te.carapplication.beans.AdminInfo;

public class AdminLogin extends MainClass{

	public static boolean login(String name, String pwd) {

		EntityManagerFactory factory = null;
		EntityManager manager = null;
		AdminInfo info = null;

		try {
			factory = Persistence.createEntityManagerFactory("cardetails");
			manager = factory.createEntityManager();

			String login = "from AdminInfo where username = : un and password = : pwd";
			Query query = manager.createQuery(login);

			query.setParameter("un", name);
			query.setParameter("pwd", pwd);

			info = (AdminInfo) query.getSingleResult();
			return true;
		} catch (Exception e) {
			return false;
		} finally {
			if (factory != null) {
				factory.close();
			}
			if (manager != null) {
				manager.close();
			}

		}
	}
}
