package com.techlab.DogDoor;

public class DogDoor {
	
	private boolean open;
	
	public DogDoor() {
		this.open = false;
	}
	
	public void open() {
		System.out.println("The Dog Door is opening");
		this.open = true;
	}
	
	public void close() {
		System.out.println("The Dog Door is closed");
		this.open = false;
	}
	
	public boolean isOpen() {
		return open;
	}

}
