package com.techlab.week2.Assignment1;

import java.util.Scanner;

public class GameTestCase_2 {
	
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

	public static void main(String[] args) {
		
		int upper = 10, lower = 0, rand = (int) (Math.random() * (upper - lower)) + lower, choice = 0;
		final int Bound = 3;
		
		while(choice < Bound) {
			System.out.println("Enter Your Choice::" + "\n1.Start Game\n2.ReStart Game\n3.Exit");
			choice = scan.nextInt();
			switch (choice) { 
	        	case 1:
	        		System.out.println("New Game Started");
	        		StartGame(rand);
	        		break; 
	        	case 2: 
	        		System.out.println("Game Re_Started");
	        		rand = (int) (Math.random() * (upper - lower)) + lower;
	        		StartGame(rand); 
	        		break;
	        	default: 
	        		System.out.println("Exit"); 
	        		break; 
		 
			}
		}
	}
}
/*
 * remove the magic no using final keyword approach
 */
