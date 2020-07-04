package com.techlab.Violation.test;

import com.techlab.Violation.Manager;
import com.techlab.Violation.Robot;

import Exception.RobotCanNotEatException;

public class WorkableTest {

	public static void main(String[] args) throws Exception {
		
		Manager manager = new Manager();
		System.out.println("Manager:::");
		manager.startWork();
		manager.startEat();
		manager.startWork();
		manager.stopWork();
		
		Robot robot = new Robot();
		System.out.println("Robot:::");
		robot.startWork();
		try {
			robot.startEat();
		} catch (RobotCanNotEatException e) {
			System.out.println(e.getMessage());
		}
		robot.startWork();
		try {
			robot.stopEat();
		} catch (RobotCanNotEatException e) {
			System.out.println(e.getMessage());
		}	}

}
