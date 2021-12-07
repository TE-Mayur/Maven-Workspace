package com.te.designpattern.structural;

public class RealInternetAccess implements OfficeInternet {

	private String employeeeName;

	public RealInternetAccess(String empName) {
		this.employeeeName = empName;
	}

	@Override
	public void getInternetAccess() {
		grantInternetAccess();
	}

	public void grantInternetAccess() {
		System.out.println("Internet Access is provided for " + employeeeName);
	}

}
