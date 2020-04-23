package com.techlab.game;

import java.util.Scanner;

public class GameTest {

	public static void main(String[] args) {

		int upper = 10,lower = 0;
		int rand = (int) (Math.random() * (upper - lower)) + lower;
		Scanner scan = new Scanner(System.in);
		
		int userInput = 0;
		while(true) {
			
			System.out.println("Enter The Guessed Number::");
			userInput = scan.nextInt();
			
			if (rand == userInput) {
				System.out.println("Your Guess Is Correct");
				break;
			}
			else if (rand < userInput) {
				System.out.println("Your Guess Is High");
			}
			else {
				System.out.println("Your Guess Is Low");
			}
		}

	}

}
