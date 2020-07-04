package com.techlab.Violation;

public class TrasportationDevice {

	String name;
	double speed;
	String engine;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}
	
	public String getEngine() {
		return engine;
	}
	
	public void startEngine() {
		   System.out.println("Car Engine Started::");
		   System.out.println(this.getName());
		   System.out.println(this.getSpeed());
		   System.out.println(this.getEngine());
	   }
}
