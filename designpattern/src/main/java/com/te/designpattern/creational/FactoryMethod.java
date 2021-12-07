package com.te.designpattern.creational;

public class FactoryMethod {
	
	public static Employee getEmployee(String str) throws Exception {
		
		if(str.equalsIgnoreCase("mgr")) {
			return new Manager();
		}else if (str.equalsIgnoreCase("itn")) {
			return new Interns();
		}else {
			return null;
		}
	
	}

}
