package com.techlab.circle.test;

import com.techlab.circle.Circle;

public class CircleArrayOfObjectTest {

	public static void main(String[] args) {

		Circle[] c = new Circle[3];

		c[0] = new Circle();
		c[0].setRadius(12.4f);
		c[0].setColor("Purple");

		Circle c1 = new Circle();
		c1.setRadius(15.2f);
		c1.setColor("red");

		Circle c2 = new Circle();
		c2.setRadius(18.2f);
		c2.setColor("grey");

		c[1] = c1;
		c[2] = c2;

		printInfo(c);
		Circle smallArea = new Circle();
		Circle Largeperimeter = new Circle();

		smallArea = findSmallCircleArea(c);
		Largeperimeter = findLargeCirclePerimeter(c);

		System.out.println("Area =" + smallArea.getArea());
		System.out.println("perimeter =" + Largeperimeter.getPeri());

	}

	public static void printInfo(Circle[] c) {

		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i].getRadius());
			System.out.println(c[i].getColor());
		}

	}

	public static Circle findSmallCircleArea(Circle[] c) {

		Circle smallest = new Circle();

		for (int i = 0; i < c.length - 1; i++) {
			if (c[i].calculateArea() < c[i + 1].calculateArea()) {
				smallest = c[i];
			} else
				smallest = c[i + 1];
		}
		return smallest;
	}

	public static Circle findLargeCirclePerimeter(Circle[] c) {

		Circle biggest = new Circle();

		for (int i = 0; i < c.length - 1; i++) {
			if (c[i].calculatePerimeter() > c[i + 1].calculatePerimeter()) {
				biggest = c[i];
			} else
				biggest = c[i + 1];
		}
		return biggest;

	}
}
