package com.techlab.Violation.test;

import com.techlab.Violation.*;

public class TrasportationDeviceTest {

	public static void main(String[] args) {
		
		//There is no problem here, right? 
		//A car is definitely a transportation device, 
		//and here we can see that it overrides the startEngine()  method of its superclass.
		TrasportationDevice car = new Car();
		car.setName("Honda");
		car.setSpeed(50);
		car.setEngine("V8");
		
		car.startEngine();
		
		//bicycle is a transportation device,
		//however, it does not have an engine and hence, the method startEngine() cannot be implemented.
		TrasportationDevice bicycle = new Bicycle();
		bicycle.setName("Normal");
		bicycle.setSpeed(10);
		bicycle.setEngine("Man");
		
		bicycle.startEngine();
		
		//These are the kinds of problems that are violation of Liskov Substitution Principle
	}
}
