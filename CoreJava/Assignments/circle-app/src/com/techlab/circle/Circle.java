package com.techlab.circle;

import java.lang.Math;
import java.util.Scanner;

public class Circle {

	private float radius ;
	private String color;
	private final float pi = (float) 3.1415;
	Scanner scan = new Scanner(System.in);
	private float area = 0f;
	private float peri = 0f;
	
	public float getRadius() {
		return radius;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setRadius(float radius) {
		if (radius < 1 ) {
			this.radius = Math.abs(radius);
		}
		else
			this.radius = radius;
	}
	
	public void setColor(String color) {
		
		if (color.equalsIgnoreCase("Pink"))
			this.color = color;
		else if (color.equalsIgnoreCase("Grey"))
			this.color = color;
		else if (color.equalsIgnoreCase("Black"))
			this.color = color;
		else
			this.color = "Pink";
		
	}
	
	public float calculateArea() {
		area = pi * radius * radius;
		return area;
	}
	
	public float getArea() {
		return area;
	}

	public float calculatePerimeter() {
		peri = 2 * pi * radius;
		return peri;
	}
	public float getPeri() {
		return peri;
	}
}
