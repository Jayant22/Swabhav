package com.techlab.rectangle.test;

import com.techlab.rectangle.Rectangle;

public class RectangleReferenceTest {
	public static void main(String[] args) {

		Rectangle r1 = new Rectangle();
		Rectangle r2;

		r2 = r1;

		r2.setLength((int) 15);
		r2.setBreadth((int) 11);

		System.out.println("Main: " + r1.hashCode() + " " + r2.hashCode());

		printInfo(r1);
		printInfo(r2);

	}

	public static void printInfo(Rectangle r) {

		System.out.println("Length: " + r.getLength());
		System.out.println("Breadth: " + r.getBreadth());
		System.out.println("HashCode: " + r.hashCode());

	}
}
