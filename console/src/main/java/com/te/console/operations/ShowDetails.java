package com.te.console.operations;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.te.console.beans.EmployeesInfo;

public class ShowDetails extends WelcomePage {

	public static void details() {

		EntityManagerFactory factory = null;
		EntityManager manager = null;

		try {
			factory = Persistence.createEntityManagerFactory("console");
			manager = factory.createEntityManager();

			String ref = "from EmployeesInfo where id = : id ";

			Query query = manager.createQuery(ref);

			query.setParameter("id", le.getId());

			List<EmployeesInfo> list = query.getResultList();

			for (EmployeesInfo info : list) {
				System.out.println("---------------USER INFORMATION-------------");
				System.out.println();
				System.out.println("ID          : " + info.getId());
				System.out.println("NAME        : " + info.getName());
				System.out.println("DESGINATION : " + info.getDesgination());
				System.out.println("HIREDATE    : " + info.getHiredate());
				System.out.println("SALARY      : " + info.getSalary());
				System.out.println("PASSWORD    :    ************");
				System.out.println();
				System.out.println("--------------------------------------------");
				System.out.println("======== THANK YOU =======");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (manager != null) {
					manager.close();
				}
				if (factory != null) {
					factory.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}
