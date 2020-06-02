package com.techlab.moveable;

public class Car implements IMoveble{

	@Override
	public void start() {
		System.out.println("Car Started.");
	}

	@Override
	public void stop() {
		System.out.println("Car Stopped.");
	}
}
