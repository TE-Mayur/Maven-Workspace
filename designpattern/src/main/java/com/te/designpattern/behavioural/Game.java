package com.te.designpattern.behavioural;

public interface Game {

	public void start();
	
	public void init();
	
	public void end();
	
	public default void play() {
		start();
		init();
		end();
	}
}
