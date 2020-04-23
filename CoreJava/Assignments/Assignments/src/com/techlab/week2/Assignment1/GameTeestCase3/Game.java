package com.techlab.week2.Assignment1.GameTeestCase3;

import java.util.Scanner;

public class Game {

	static Scanner scan = new Scanner(System.in);
	static int count = 0;

	public static void StartGame(int Random) {

		int userInput = 0;
		while (true) {

			System.out.println("Enter The Guessed Number::");
			userInput = scan.nextInt();

			if (Random == userInput) {
				System.out.println("Your Guess Is Correct");
				System.out.println("Actual Random Number::" + Random);
				System.out.println("No of Trials::" + count + "\n");
				break;
			} else if (Random < userInput) {
				count++;
				System.out.println("Your Guess Is High");
			} else {
				count++;
				System.out.println("Your Guess Is Low");
			}
		}
	}
}
