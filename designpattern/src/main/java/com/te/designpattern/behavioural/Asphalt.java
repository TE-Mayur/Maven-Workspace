package com.te.designpattern.behavioural;

public class Asphalt implements Game{

	@Override
	public void start() {
		System.out.println("Alshalt 8 started");
	}

	@Override
	public void init() {
		System.out.println("Cars are loaded");
	}

	@Override
	public void end() {
		System.out.println("You won..... Game Over ");
	}
	
}
