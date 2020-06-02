package com.techlab.moveable;

public class Bike implements IMoveble {

	@Override
	public void start() {
		System.out.println("Bike Started.");
	}

	@Override
	public void stop() {
		System.out.println("Bike Stopped.");
	}
}
