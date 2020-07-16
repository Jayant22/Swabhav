package com.techlab.Factory;

public class Tesla implements IAutoMobile {
	@Override
	public void start() {
		System.out.println("Tesla Starts!!!!");
	}
	@Override
	public void stop() {
		System.out.println("Tesla Stops!!!!");	
	}
}
