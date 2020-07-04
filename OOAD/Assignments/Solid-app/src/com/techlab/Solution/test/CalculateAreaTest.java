package com.techlab.Solution.test;

import com.techlab.Solution.*;

public class CalculateAreaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Shape s1 = new Rectangle(4.5, 7.4);
		Shape s2 = new Circle(5.3);
		
		System.out.println(s1.calculateArea());
		System.out.println(s2.calculateArea());
	}

}
