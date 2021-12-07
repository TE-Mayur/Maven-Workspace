package com.te.designpattern.creational;

public class MathOperatoinSingleton {

	// step 1
	private MathOperatoinSingleton() {
	}

	// step 2

	static MathOperatoinSingleton mathoperations = null;

	public static MathOperatoinSingleton getMathObject() {
		if (mathoperations == null) {
			mathoperations = new MathOperatoinSingleton();
		}
		return mathoperations;
	}
}
