package com.techlab.demo.codeMagnet;

public class TestBoats {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Boat b1 = new Boat();
		Sailboat b2 = new Sailboat();
		Rowboat b3 = new Rowboat();
		
		b2.setLength(32);
		b1.move();
		b3.move();
		b2.move();
	}

}

class Boat{

	private int length;
	
	public void setLength(int len) {
		length = len;
	}
	
	public int getLength() {
		return length;
	}
	
	public void move() {
		System.out.print("drift ");
	}
}

class Rowboat extends Boat {
	
	public void rowTheBoat() {
		System.out.println("stroke natasha");
	}
}

class Sailboat extends Boat {
	
	public void move() {
		System.out.print("hoist sail");
	}
	
}