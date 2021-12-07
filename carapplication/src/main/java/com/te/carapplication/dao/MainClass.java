package com.te.carapplication.dao;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.LogManager;

public class MainClass {

	public static void main(String[] args) {
		LogManager.getLogManager().getLogger("").setLevel(Level.OFF);
		
		MainClass main = new MainClass();

		Scanner scan = new Scanner(System.in);
		System.out.println("====== Choose login =====");
		System.out.print(" Enter the username : ");
		String user = scan.next();

		System.out.println("Enter the password : ");
		String pass = scan.next();

		AdminLogin.login(user,pass);
		
		System.out.println("Login Successfull..... ");

	}
}
