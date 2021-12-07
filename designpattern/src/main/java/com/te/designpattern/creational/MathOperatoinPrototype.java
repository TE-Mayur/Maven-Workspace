package com.te.designpattern.creational;

public class MathOperatoinPrototype {

	// step 1
	private MathOperatoinPrototype() {
	}

	// step 2
	static MathOperatoinPrototype mathoperations = null;

	public static MathOperatoinPrototype getMathObject() {
		
		return	mathoperations = new MathOperatoinPrototype();

		 
	}
}
