package com.techlab.Solution;

public class Rectangle implements Shape {
	
	private double length, width;

	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public double getWidth() {
		return width;
	}

	@Override
	public double calculateArea() {
		return length * width;
	}	
	
}
