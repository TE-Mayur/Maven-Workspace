package com.te.designpattern.behavioural;

public class Car implements Vehicle{

	@Override
	public void topSpeed() {
		System.out.println("Top speed is 200km/hr");
	}

	@Override
	public void milage() {
		System.out.println("Milage is 20km/l");
	}

	@Override
	public void price() {
		System.out.println("Price is 15 Lakhs");
	}
	

}
