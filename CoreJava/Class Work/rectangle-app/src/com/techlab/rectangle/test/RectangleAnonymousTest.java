package com.techlab.rectangle.test;

import com.techlab.rectangle.Rectangle;

public class RectangleAnonymousTest {

	public static void main(String[] args) {
		System.out.println(new Rectangle());
		System.out.println("Main Hashcode: " + new Rectangle().hashCode());

		new Rectangle().setBreadth(10);
		new Rectangle().setBreadth(11);

		System.out.println(new Rectangle().getLength());
		System.out.println(new Rectangle().getBreadth());

		printInfo(new Rectangle());

	}

	public static void printInfo(Rectangle r) {

		System.out.println(r.getLength());
		System.out.println(r.getBreadth());
		System.out.println("Inside Method: " + r.hashCode());

	}

}
