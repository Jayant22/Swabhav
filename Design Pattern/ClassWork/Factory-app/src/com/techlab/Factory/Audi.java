package com.techlab.Factory;

public class Audi implements IAutoMobile {

	@Override
	public void start() {
		System.out.println("AUDI Starts!!!!");	
	}
	@Override
	public void stop() {
		System.out.println("AUDI Stops!!!!");
	}
}
