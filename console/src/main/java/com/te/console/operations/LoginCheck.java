package com.te.console.operations;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class LoginCheck extends WelcomePage {

	public static void logCheck() {

		EntityManagerFactory factory = null;
		EntityManager manager = null;

		try {
			factory = Persistence.createEntityManagerFactory("console");
			manager = factory.createEntityManager();

			String valid = "select id,password from EmployeesInfo";

			Query query2 = manager.createQuery(valid);

			List<Object[]> list = query2.getResultList();

			for (Object[] obj : list) {

				if (obj[0] == le.getId()) {
					if (obj[1].equals(le.getPassword())) {
						System.out.println("********** Login Sucessfull :-) **********");
						System.out.println();
						int i = 1;
						while (i != 0) {

							Scanner scan1 = new Scanner(System.in);
							System.out.println("============ Choose Your Option ==========");
							System.out.println();
							System.out.println("1. --------- View Your Account Details  ---------");
							System.out.println("2. --------- Update Your Details ----------");
							System.out.println("3. --------- Delete Your Account  ---------------");
							int option1 = scan1.nextInt();

							switch (option1) {
							case 1:
								ShowDetails.details();
								break;

							case 2:
								UpdateRecord.update();
								break;

							case 3:
								DeleteUser.delete();
								break;

							default:
								break;
							}
							i--;
						}
						break;
					} else {
						System.out.println(":::::::::::::: Wrong Credentials !!!! :-( ::::::::::");
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (factory != null) {
					factory.close();
				}
				if (manager != null) {
					manager.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}
