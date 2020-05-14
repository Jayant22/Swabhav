package com.techlab.boxing;

public class Demo {

	public static void main(String[] args) {

		implictTypeCasting();
		explicitTypeCasting();
		boxingAndunboxing();

	}

	private static void implictTypeCasting() {
		int i = 100;

		System.out.println("Implicit Casting ::");

		// automatic type conversion
		float f = i;

		System.out.println("Int value " + i);

		System.out.println("Float value " + f);

	}

	private static void boxingAndunboxing() {
		Integer i = new Integer(10);

		System.out.println("Boxing And Unboxing ::");

		// Unboxing the Object
		int i1 = i;

		System.out.println("Value of i: " + i);
		System.out.println("Value of i1: " + i1);

		// Autoboxing of char
		Character str = 'a';

		// Auto-unboxing of Character
		char ch = str;
		System.out.println("Value of ch: " + ch);
		System.out.println("Value of gfg: " + str);

	}

	private static void explicitTypeCasting() {

		double d = 100.04;

		System.out.println("Explicit Casting ::");

		// explicit type casting
		int i = (int) d;
		System.out.println("Double value " + d);

		// fractional part lost
		System.out.println("Int value " + i);

	}

}
