package com.techlab.week1.Assignment2.Dry;

public class WithDryTest {

	public int total(int a, int b) {
		int sum =  a + b;
		
		return sum;
	}

	public double average(int a, int b) {
		int sum = total(a, b);
		
		return sum / 2;
	}

	

}
