package com.techlab.Template.test;

import com.techlab.Template.*;

public class TemplateTest {

	public static void main(String[] args) {

		Game game = new Cricket();
		game.play();
		System.out.println();
		game = new Football();
		game.play();
	}
}
