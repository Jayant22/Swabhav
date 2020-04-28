package com.techlab.rectangle;

public class Rectangle {
	
	private int length;
	private int breadth;
	private String color;
	
	public int getBreadth() {
		return breadth;
	}
	public int getLength() {
		return length;
	}
	public String getColor() {
		return color;
	}
	public void setLength(int length) {
		if (length < 1 ) 
			this.length = 1;
		else if(length > 100)
	        this.length = 100;
		else
			this.length = length;
		
	}
	public void setBreadth(int breadth) {
		if (breadth < 1 ) 
			this.breadth = 1;
		else if(breadth > 100)
	        this.breadth = 100;
		else
			this.breadth = breadth;
	}
	public void setColor(String color) {
		
		if (color.equals("Red"))
			this.color = color;
		else if (color.equals("Green"))
			this.color = color;
		else if (color.equals("Black"))
			this.color = color;
		else
			this.color = "Black";
	}
	public double calculateArea() {
		double area = 0.0;
		area = length * breadth;
		return area;
	}
}
