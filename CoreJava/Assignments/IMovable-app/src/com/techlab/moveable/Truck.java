package com.techlab.moveable;

public class Truck implements IMoveble {

	@Override
	public void start() {
		System.out.println("Truck Started.");
	}

	@Override
	public void stop() {
		System.out.println("Truck Stopped.");
	}
}
