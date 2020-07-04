package com.techlab.Violation;

import Exception.RobotCanNotEatException;

public class Robot implements IWorkable {

	@Override
	public void startWork() {
		System.out.println("Start Working");
	}

	@Override
	public void stopWork() {
		System.out.println("Stop Working");
	}

	@Override
	public void startEat() throws Exception {
		throw new RobotCanNotEatException();
	}

	@Override
	public void stopEat() throws Exception {
		throw new RobotCanNotEatException();
	}
}
