package com.techlab.Violation.test;

import com.techlab.Violation.*;

public class AreaCalculatorTest {

	public static void main(String[] args) {
		//AS we are using Object creation and then using them due to which the 
		//program is efficient for extension and prone for more modification..

		Rectangle r = new Rectangle(4.5, 7.4);
		Circle c = new Circle(8.3);
		AreaCalculator t = new AreaCalculator();
		
		System.out.println("Rectangle: " + t.caluclateArea(r));
		System.out.println("Circle: " + t.caluclateArea(c));
	}

}
