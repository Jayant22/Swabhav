package com.techlab.Solution;

public class Robot implements IWork {

	@Override
	public void startWork() {
		System.out.println("Start Working");
	}

	@Override
	public void stopWork() {
		System.out.println("Stop Working");
	}
}
