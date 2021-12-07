package com.te.console.operations;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.te.console.beans.EmployeesInfo;

public class LoginRegisterOperation implements Login, Register {
	@Override
	public void login1(EmployeesInfo le) {

		Scanner scan = new Scanner(System.in);
		System.out.println("=-=-=-=-= Login =-=-=-=-=");
		System.out.println( );

		System.out.print("1 - Enter Your User Id : ");
		le.setId(scan.nextInt());

		System.out.print("2 - Enter Your Password : ");
		le.setPassword(scan.next());
		
		System.out.println("Please Wait....");
		System.out.println( );
	}

	@Override
	public void register2(EmployeesInfo abc) {

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
			System.out.println("-=-=-=-=  Register =-=-=-=-");
			System.out.println();

			System.out.print("1 - Enter The Employee Id : ");
			int i = 1;
			while (i > 0) {
				String que = "from EmployeesInfo where empno=:emp";
				Query query = manager.createQuery(que);
				int empno = scan.nextInt();
				EmployeesInfo user = null;
				try {
					user = (EmployeesInfo) query.setParameter("emp", empno).getSingleResult();
					if (user != null) {
						System.out.println("--------- Id Already Exists, Try Again :-(  ----------");
					}
				} catch (Exception e) {
					info.setId(empno);
					i = 0;
				}
			}
			System.out.print("2 - Enter The Employee Name : ");
			scan.nextLine();
			info.setName(scan.nextLine());

			System.out.print("3 - Enter The Employee Designation : ");
			info.setDesgination(scan.next());

			try {
				System.out.print("4 - Enter The Employee Hiredate : ");
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
				Date dt = null;
				info.setHiredate(dt = sdf.parse(scan.next()));
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.print("5 - Enter The Employee Salary : ");
			info.setSalary(scan.nextDouble());

			System.out.print("6 - Enter The Password : ");
			info.setPassword(scan.next());

			manager.persist(info);
			transaction.commit();

			System.out.println("=========== Your Account Created Successfully ========");
			System.out.println("=========== Thank You :-) ========");
		} catch (Exception e) {
			transaction.rollback();
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
