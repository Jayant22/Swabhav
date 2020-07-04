package com.techlab.Solution.test;

import com.techlab.Solution.*;

public class WorkableTest {

	public static void main(String[] args) {

		Manager manager = new Manager();
		System.out.println("Manager:::");
		manager.startWork();
		manager.startEat();
		manager.startWork();
		manager.stopWork();

		Robot robot = new Robot();
		System.out.println("Robot:::");
		robot.startWork();
		robot.startWork();
	}

}
