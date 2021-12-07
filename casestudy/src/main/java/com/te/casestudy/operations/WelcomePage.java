		package com.te.casestudy.operations;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.LogManager;

import com.te.casestudy.beans.EmployeesInfo;

public class WelcomePage {

	public static LoginRegisterOperation page = null;
	public static EmployeesInfo info = null;
	public static EmployeesInfo le = null;

	public static void main(String[] args) {
		LogManager.getLogManager().getLogger("").setLevel(Level.OFF);

		page = new LoginRegisterOperation();
		info = new EmployeesInfo();
		le = new EmployeesInfo();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("============== Welcome to TestYantra ============");
		System.out.println("---------------  Choose the option ------------");
		System.out.println();
		System.out.println("1 - Login :-) ");
		System.out.println("2 - Register :-) ");
		int option = scan.nextInt();

		switch (option) {
		case 1:
			login();
			break;
		case 2:
			register();
			break;
		default:
			break;
		}
		if (option == 1) {
			page.login1(le);
			LoginCheck.logCheck();
		} else {
			page.register2(info);
		}
	}
	
	public static void login() {
		System.out.println("You Have Choosed Login");
		System.out.println();
	}

	public static void register() {
		System.out.println("You Have Choosed Register ");
		System.out.println("Please Wait...");
		System.out.println();
	}
}