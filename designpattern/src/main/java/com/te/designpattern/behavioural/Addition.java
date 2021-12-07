package com.te.designpattern.behavioural;

public class Addition implements Strategy{

	@Override
	public int doOperation(int a, int b) {
		return a+b;
	}
}
