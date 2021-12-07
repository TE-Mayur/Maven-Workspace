package com.te.designpattern;

import java.util.Scanner;

import com.te.designpattern.creational.Employee;
import com.te.designpattern.creational.FactoryMethod;

public class EmployeeTest {
	public static void main(String[] args) {
		try {

			Scanner scan = new Scanner(System.in);
			System.out.println("Enter the type of employee");
			String choice = scan.nextLine();
			Employee emp = FactoryMethod.getEmployee(choice);
			emp.getDesignation();
			scan.close();
			
		} catch (Exception e) {
			System.out.println("NO such employee found");
		}

	}
}
