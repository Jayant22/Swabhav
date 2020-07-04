package com.techlab.Solution;

public class Rectangle extends IShapeable {
	private int length;
	private int breadth;

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBreadth() {
		return breadth;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}

	@Override
	public int Area() {
		return this.length * this.breadth;
	}

	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", breadth=" + breadth + ", getLength()=" + getLength()
				+ ", getBreadth()=" + getBreadth() + ", Area()=" + Area() + "]";
	}
	
	
}
