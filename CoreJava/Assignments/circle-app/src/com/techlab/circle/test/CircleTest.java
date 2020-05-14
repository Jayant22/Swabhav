package com.techlab.circle.test;

import com.techlab.circle.Circle;

public class CircleTest {

	public static void main(String[] args) {

		System.out.println(new Circle());
			Circle c1 = new Circle();	
			c1.setRadius((float) 10.0);
			c1.setColor("Pink");
			
			//System.out.println("r1 object has::" + c1.hashCode());

			Circle c2 = new Circle();
			c2.setRadius((float) 20.0);
			c2.setColor("Grey");
			
			//System.out.println("r2 object has::" + c2.hashCode());

			//printCircleInfo(c1);
			//printCircleInfo(c2);
			
			printCircleInfo(new Circle());
			

		}

		public static void printCircleInfo(Circle c) {
			//Circle c1 = new Circle();
			System.out.println("r object::" + c.hashCode());
			System.out.println("r object::" + c.getRadius());
			//System.out.println("r1 object::" + r1.getLength());
			//System.out.println(r.getBreadth());
			//System.out.println(r.calculateArea());

		}
}
