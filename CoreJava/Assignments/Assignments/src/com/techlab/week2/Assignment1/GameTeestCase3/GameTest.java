package com.techlab.week2.Assignment1.GameTeestCase3;

import java.util.Scanner;

import com.techlab.week2.Assignment1.GameTeestCase3.Game;;

public class GameTest {
	
	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		int upper = 10, lower = 0, rand = (int) (Math.random() * (upper - lower)) + lower, choice = 0;
		final int Bound = 3;
		final Game game = new Game();
		
		while(choice < Bound) {
			System.out.println("Enter Your Choice::" + "\n1.Start Game\n2.ReStart Game\n3.Exit");
			choice = scan.nextInt();
			switch (choice) { 
	        	case 1:
	        		System.out.println("New Game Started");
	        		game.StartGame(rand);
	        		break; 
	        	case 2: 
	        		System.out.println("Game Re_Started");
	        		rand = (int) (Math.random() * (upper - lower)) + lower;
	        		game.StartGame(rand); 
	        		break;
	        	default: 
	        		System.out.println("Exit"); 
	        		break; 
			}
		}
	}
}
