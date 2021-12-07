package com.te.casestudy.operations;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DeleteUser extends WelcomePage {

	public static void delete() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("console");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();

		String delete = "delete EmployeesInfo where id = : id";

		Query query = manager.createQuery(delete);

		query.setParameter("id", le.getId());

		query.executeUpdate();
		System.out.println("======== Account Deleted Successfully =======");
		System.out.println("======== See You Soon =======");

		transaction.commit();
		manager.close();
		factory.close();
	}

}
