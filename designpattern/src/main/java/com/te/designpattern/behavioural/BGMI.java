package com.te.designpattern.behavioural;

public class BGMI implements Game {

	@Override
	public void start() {
		System.out.println("BGMI Starting");
	}

	@Override
	public void init() {
		System.out.println("Erangle is loaded");
	}

	@Override
	public void end() {
		System.out.println("Winner Winner Chicken Dinner");
	}

}
