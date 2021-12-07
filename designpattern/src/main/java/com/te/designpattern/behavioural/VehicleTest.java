package com.te.designpattern.behavioural;

public class VehicleTest {
	public static void main(String[] args) {
		
		Vehicle bike = new Bike();
		bike.features();
		
		System.out.println("=======================");
		
		Vehicle car = new Car();
		car.features();
	}
}
