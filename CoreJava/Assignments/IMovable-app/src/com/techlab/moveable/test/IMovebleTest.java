package com.techlab.moveable.test;

import com.techlab.moveable.*;

public class IMovebleTest {

	public static void main(String[] args) {

		IMoveble[] Moveble = new IMoveble[3];
		
		Moveble[0] = new Truck();
		Moveble[1] = new Car();
		Moveble[2] = new Bike();
		
		printInfo(Moveble);
	}

	private static void printInfo(IMoveble[] moveble) {
		
		for (int i = 0; i < moveble.length; i++) {
		
			moveble[i].start();
			moveble[i].stop();
		}	
	}
}
