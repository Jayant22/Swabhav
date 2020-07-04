package com.techlab.Solution;

public class DeviceWithEngine extends TrasportationDevice {
	
	String engine;

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public void startEngine() {
		System.out.println("Car Engine Started::");
		System.out.println(this.getName());
		System.out.println(this.getSpeed());
	}
}
