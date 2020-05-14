package com.techlab.rectangle.test;

import com.techlab.rectangle.Rectangle;

public class RectangleArrayOfObjectTest {

	public static void main(String[] args) {
		Rectangle[] r = new Rectangle[3];

		r[0] = new Rectangle();
		r[0].setLength((int) 15);
		r[0].setBreadth((int) 11);

		Rectangle r1 = new Rectangle();
		r1.setLength((int) 10);
		r1.setBreadth((int) 11);

		Rectangle r2 = new Rectangle();
		r2.setLength((int) 14);
		r2.setBreadth((int) 18);

		r[1] = r1;
		r[2] = r2;

		printInfo(r);

	}

	public static void printInfo(Rectangle[] r) {

		for (int i = 0; i < r.length; i++) {
			System.out.println("HashCode: " + r[i].hashCode());
			System.out.println("Length: " + r[i].getLength());
			System.out.println("Breadth: " + r[i].getBreadth());
		}

	}

}
