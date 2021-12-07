package com.te.casestudy.operations;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.te.casestudy.beans.EmployeesInfo;

public class UpdateRecord extends WelcomePage {

	public static void update() {
		EntityManagerFactory factory = null;
		EntityManager manager = null;
		EntityTransaction transaction = null;

		try {
			factory = Persistence.createEntityManagerFactory("console");
			manager = factory.createEntityManager();
			transaction = manager.getTransaction();
			transaction.begin();

			EmployeesInfo info = new EmployeesInfo();

			Scanner scan = new Scanner(System.in);
			String que = "update EmployeesInfo set name = :nm , salary = :sal , password = :pwd where id = :id";
			Query query = manager.createQuery(que);

			System.out.println("==========Update Your Account Details========");
			System.out.println();

			System.out.print("1 - Enter The User New Name : ");
			String str = scan.next();
			System.out.println();

			query.setParameter("nm", str);

			System.out.print("2 - Enter The User New Salary : ");
			double doub = scan.nextDouble();
			System.out.println();

			query.setParameter("sal", doub);

			System.out.print("3 - Enter The New Password : ");
			String str1 = scan.next();
			System.out.println();

			query.setParameter("pwd", str1);

			System.out.println("------- For Confirmation Please Provide The User Id : ---------");

			System.out.print("4 - Enter The User Id : ");
			int num = scan.nextInt();
			System.out.println();

			query.setParameter("id", num);
			query.executeUpdate();
			transaction.commit();
			System.out.println("=========== Account Updated Successfully :-) ========");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (manager != null) {
				manager.close();
			}
			if (factory != null) {
				factory.close();
			}
		}
	}

}
