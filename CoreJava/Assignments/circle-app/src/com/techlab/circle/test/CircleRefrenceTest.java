package com.techlab.circle.test;

import com.techlab.circle.Circle;

public class CircleRefrenceTest {

	public static void main(String[] args) {

		Circle c1 = new Circle();

		c1.setRadius((float) 10.0);
		c1.setColor("Pink");
		
		Circle c2;
		
		c2 = c1;
		
		c1.setRadius((float) 20.0);
		c1.setColor("Grey");

		printCircleInfo(c1);
		printCircleInfo(c2);
		
	}

	public static void printCircleInfo(Circle circle) {
		
		System.out.println("C object::" + circle.hashCode());
		System.out.println("Radius is:: " + circle.getRadius() + "\n" + "Colur of Circle is:: " + circle.getColor());
		
		System.out.println("Area Of Circle::" + circle.calculateArea());
		System.out.println("Perimeter Of Circle::" + circle.calculatePerimeter());
	}
}
