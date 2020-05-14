package com.techlab.circle.test;

import com.techlab.circle.Circle;

public class CircleAnonymousTest {

	public static void main(String[] args) {

		System.out.println("new Circle()"+new Circle());
		System.out.println("r object::" + new Circle().hashCode());
		
		new Circle().setRadius((float) 10.0);
		new Circle().setColor("Grey");
		
		System.out.println("Radius::"+new Circle().getRadius()); 
		System.out.println("Color::"+new Circle().getColor());
	}

	public static void printCircleInfo(Circle c) {
		// Circle c1 = new Circle();
		System.out.println("r object::" + c.hashCode());
		System.out.println("r object::" + c.getRadius());
		System.out.println("r object::" + c.getColor());

	}

}
