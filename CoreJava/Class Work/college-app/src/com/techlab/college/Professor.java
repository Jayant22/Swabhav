package com.techlab.college;

public class Professor extends Person {

	private double salary;
	private final double INCREMENT = 500.0;

	public Professor(String id, String address, String dateOfBirth, double salary) throws Exception {
		super(id, address, dateOfBirth);
		this.salary = salary;
	}

	public void calculateSalary(int noOfDaysWorked) {
		salary = noOfDaysWorked * INCREMENT;
	}

	public double getSalary() {
		return salary;
	}

}
