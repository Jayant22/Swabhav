package com.techlab.Solution;

public class Manager implements IWorkEat {

	@Override
	public void startWork() {
		System.out.println("Start Working");
	}

	@Override
	public void stopWork() {
		System.out.println("Stop Working");
	}

	@Override
	public void startEat() {
		System.out.println("Start Eating");
	}

	@Override
	public void stopEat() {
		System.out.println("Stop Eating");
	}	
}
