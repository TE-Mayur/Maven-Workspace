package com.te.designpattern.behavioural;

public class TemplateMethodTest {

	public static void main(String[] args) {

		Game game = new Asphalt();
		game.play();
		System.out.println("--------------------------------");
		Game game1 = new BGMI();
		game1.play();
	}
}
