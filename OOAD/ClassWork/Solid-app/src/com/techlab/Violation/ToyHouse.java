package com.techlab.Violation;

public class ToyHouse implements Toy {
	double price;
	String color;

	@Override
	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public void move() {
		System.out.println("Toy Is moving");
		System.out.println(this.price);
		System.out.println(this.color);
	}

	@Override
	public void fly() {
		System.out.println("Toy Is Flying");
		System.out.println(this.price);
		System.out.println(this.color);
	}
}
