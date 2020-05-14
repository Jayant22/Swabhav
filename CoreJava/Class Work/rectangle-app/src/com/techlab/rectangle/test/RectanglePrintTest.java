package com.techlab.rectangle.test;

import com.techlab.rectangle.Rectangle;

public class RectanglePrintTest {

	public static void main(String[] args) {

		Rectangle r1 = new Rectangle();
		r1.setBreadth(10);
		r1.setLength(30);
		
		System.out.println("r1 object has::" + r1.hashCode());

		Rectangle r2 = new Rectangle();
		r2.setBreadth(11);
		r2.setLength(3);
		
		System.out.println("r2 object has::" + r2.hashCode());

		printRectangleInfo(r1);
		printRectangleInfo(r2);

	}

	public static void printRectangleInfo(Rectangle r) {
		Rectangle r1 = new Rectangle();
		//System.out.println("r object::" + r.getLength());
		System.out.println("r object::" + r.hashCode());
		//System.out.println("r1 object::" + r1.getLength());
		//System.out.println(r.getBreadth());
		//System.out.println(r.calculateArea());

	}
}
