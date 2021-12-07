package com.te.designpattern.structural;

public class ProxyInternetAccess implements OfficeInternet {

	private String employeeName;

	private RealInternetAccess internetAccess;

	public ProxyInternetAccess(String employeeName) {
		this.employeeName = employeeName;
	}

	@Override
	public void getInternetAccess() {
		if (getLevel() > 5) {
			internetAccess = new RealInternetAccess(employeeName);
			internetAccess.getInternetAccess();
		} else {
			System.out.println("Level is below 5 !!");
		}
	}

	public long getLevel() {
		return Math.round(Math.random() * 10); 
	}

}
