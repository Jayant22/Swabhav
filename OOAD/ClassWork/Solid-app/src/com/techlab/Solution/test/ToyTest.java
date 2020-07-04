package com.techlab.Solution.test;

import com.techlab.Solution.*;

public class ToyTest {

	//The solution is- Segregate the Toy interface into multiple role interfaces each for a specific behavior.
	//Let’s segregate the Toy interface, 
	//so that our application now have three interfaces: Toy, Movable, and Flyable.
	public static void main(String[] args) {

		ToyHouse toyHouse = new ToyHouse();
		toyHouse.setPrice(15.00);
		toyHouse.setColor("green");
		System.out.println(toyHouse);

		ToyCar toyCar = new ToyCar();
		toyCar.setPrice(25.00);
		toyCar.setColor("red");
		toyCar.move();
		System.out.println(toyCar);


		ToyPlane toyPlane = new ToyPlane();
		toyPlane.setPrice(125.00);
		toyPlane.setColor("white");
		toyPlane.move();
		toyPlane.fly();
		System.out.println(toyPlane);

	}

}
