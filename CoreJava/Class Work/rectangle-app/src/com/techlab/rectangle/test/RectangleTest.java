package com.techlab.rectangle.test;

import java.util.Scanner;

import com.techlab.rectangle.Rectangle;

public class RectangleTest {

	private static final int Bound = 4;
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		Rectangle rect = new Rectangle();

		int choice = 0;

		while (choice < Bound) {
			System.out.println("Enter Your Choice::");
			choice = scan.nextInt();
			switch (choice) {
			case 1:
				System.out.println(rect.getLength());
				System.out.println(rect.getBreadth());
				System.out.println(rect.getColor());
				break;
			case 2:
				rect.setLength(10);
				rect.setBreadth(100);
				rect.setColor("Red");

				System.out.println(rect.getLength());
				System.out.println(rect.getBreadth());
				System.out.println(rect.getColor());
				break;
			case 3:
				rect.setLength(-10);
				rect.setBreadth(101);
				rect.setColor("Yellow");

				System.out.println(rect.getLength());
				System.out.println(rect.getBreadth());
				System.out.println(rect.getColor());

				// System.out.println(rect.setLength(12));
				break;
			default:
				System.out.println("Exit");
				break;

			}
		}
	}
}

/*
 * class PoolPuzzleOne { public static void main(String [] args) { int x = 0;
 * while ( X < 4 ) { System.out.print(“a”); if ( x < 1 ) { System.out.print(“
 * “); } System.out.print(“n”); if ( X > 1 ) { System.out.print(“ oyster”); x =
 * x + 2; } if ( x == 1 ) { System.out.print(“noys”); } if ( X < 1 ) {
 * System.out.print(“oise”); } System.out.println(““); X = X + 1; } } }
 */
