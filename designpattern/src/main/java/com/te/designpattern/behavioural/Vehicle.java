package com.te.designpattern.behavioural;

public interface Vehicle {

	public void topSpeed();

	public void milage();

	public void price();

	public default void features() {
		topSpeed();
		milage();
		price();
	}
}
