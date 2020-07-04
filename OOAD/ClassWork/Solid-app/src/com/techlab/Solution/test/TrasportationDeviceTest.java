package com.techlab.Solution.test;

import com.techlab.Solution.*;

public class TrasportationDeviceTest {

	public static void main(String[] args) {

		//our case we would solve the problem by differentiating classes of transportation devices with and without engines.
		DeviceWithEngine car = new Car();
		car.setName("Honda");
		car.setSpeed(50);
		car.setEngine("V8");

		car.startEngine();

		
		DeviceWithOutEngine bicycle = new Bicycle();
		bicycle.setName("Normal");
		bicycle.setSpeed(10);

		bicycle.startMoving();

	}
}
