package com.techlab.circle.test;

import com.techlab.circle.Circle;

public class CirclePrintTest {
	
	public static void main(String[] args) {
		
		Circle circle = new Circle();
		
		circle.setRadius((float) -10.0);
		circle.setColor("piNK");
		
		printCircleInfo(circle);
		
	}

	public static void printCircleInfo(Circle circle) {
			
		System.out.println("Radius is:: " + circle.getRadius() + "\n" + "Colur of Circle is:: " + circle.getColor());
		System.out.println("Area Of Circle::" + circle.calculateArea());
		
		System.out.println("Perimeter Of Circle::" + circle.calculatePerimeter());
	}
	
}
