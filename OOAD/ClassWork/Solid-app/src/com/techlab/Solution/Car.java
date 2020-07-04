package com.techlab.Solution;

public class Car extends DeviceWithEngine{

	@Override
	public void startEngine() {
		System.out.println("Car Engine Started::");
		System.out.println(this.getName());
		System.out.println(this.getSpeed());
		System.out.println(this.getEngine());
	}
}
