package com.techlab.Solution.test;

import com.techlab.Solution.*;

public class Test {

	public static void main(String[] args) {

		Rectangle rect = new Rectangle();
		rect.setLength(20);
		rect.setBreadth(10);

		Square sqr = new Square();
		sqr.setSides(10);

		System.out.println(rect);
		System.out.println(sqr);
	}

	
}
