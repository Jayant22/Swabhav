package com.techlab.week2.Assignment1;

import java.util.Scanner;

public class GameTestCase_1 {

	private static Scanner scan;

	public static void main(String[] args) {

		int upper = 10, lower = 0, count = 0;
		int rand = (int) (Math.random() * (upper - lower)) + lower;
		scan = new Scanner(System.in);

		int userInput = 0;
		while (true) {

			System.out.println("Enter The Guessed Number::");
			userInput = scan.nextInt();

			if (rand == userInput) {
				System.out.println("Your Guess Is Correct");
				System.out.println("Actual Random Number::" + rand);
			    System.out.println("No of Trials::" + count);
				
				break;
			} else if (rand < userInput) {
				count++;
				System.out.println("Your Guess Is High");
			} else {
				count++;
				System.out.println("Your Guess Is Low");
			}
		}
	}
}
/*
 * print the no of trials;
 * actual rand no;
 */
