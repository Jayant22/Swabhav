package com.techlab.week1.Assignment2.Dry;

public class DryTest {

public static void main(String[] args) {
		
		int a = 10,b = 10,total = 0;
		double avg = 0;
		WithoutDryTest test_1 = new WithoutDryTest();
		WithDryTest test_2 = new WithDryTest();
		
		total = test_1.total(a, b);
		avg = test_1.average(a, b);
		
		System.out.println("Without Dry Test::");
		System.out.println("Sum = " + total + "\n" + "Avg = " + avg);
		
		total = test_2.total(a, b);
		avg = test_2.average(a, b);
		
		System.out.println("With Gry Test::");
		System.out.println("Sum = " + total + "\n" + "Avg = " + avg);
	}
}
