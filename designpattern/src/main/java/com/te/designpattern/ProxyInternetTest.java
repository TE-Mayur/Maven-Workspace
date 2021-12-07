package com.te.designpattern;

import com.te.designpattern.structural.OfficeInternet;
import com.te.designpattern.structural.ProxyInternetAccess;

public class ProxyInternetTest {
	public static void main(String[] args) {
		OfficeInternet internet = new ProxyInternetAccess("ZXC");
		internet.getInternetAccess();
	}

}
