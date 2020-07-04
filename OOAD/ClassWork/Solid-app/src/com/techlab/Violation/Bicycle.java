package com.techlab.Violation;

public class Bicycle extends TrasportationDevice{
	   @Override
	   /*problem!*/
	   public void startEngine() {
		   System.out.println("Bicycle Engine Started::");
		   System.out.println(this.getName());
		   System.out.println(this.getSpeed());
		   System.out.println(this.getEngine());
	   }
	}
