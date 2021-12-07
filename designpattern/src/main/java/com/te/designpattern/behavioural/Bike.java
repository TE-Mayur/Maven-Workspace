package com.te.designpattern.behavioural;

public class Bike implements Vehicle{

	@Override
	public void topSpeed() {
		System.out.println("Top Speed is 150km/hr");
	}

	@Override
	public void milage() {
		System.out.println("Milage is 45km/l");
	}

	@Override
	public void price() {
		System.out.println("Price is 1 Lakh");
	}

}
