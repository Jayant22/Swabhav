package com.techlab.Solution;

public class Bicycle extends DeviceWithOutEngine{
	   @Override
	   public void startMoving() {
		   System.out.println("Bicycle Engine Started::");
		   System.out.println(this.getName());
		   System.out.println(this.getSpeed());
	   }
	}
