package com.techlab.Violation.test;

import com.techlab.Violation.*;

public class ToyTest {
	//ToyHouse needs to provide implementation of the move() and fly() methods,
	//even though it does not require them.
	//This is a violation of the Interface Segregation Principle.
	public static void main(String[] args) {

		ToyHouse toyHouse=new ToyHouse();
        toyHouse.setPrice(15.00);
        toyHouse.setColor("green");
        
        toyHouse.move();
        toyHouse.fly();
	}

}
