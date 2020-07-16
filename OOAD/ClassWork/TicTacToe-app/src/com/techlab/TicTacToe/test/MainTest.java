package com.techlab.TicTacToe.test;

import java.util.Scanner;

import com.techlab.TicTacToe.*;

public class MainTest {

	public static void main(String[] args) {
		
		MainTest test = new MainTest();
		System.out.println("Enter the of matrix::");
		Scanner scanner = new Scanner(System.in);
		
		int Size = scanner.nextInt();
	
		GameFacade gameFacade = new GameFacade(Size);	
		gameFacade.getGame().start();
		
		playMove(test, gameFacade, gameFacade.currPlayer);

		Player winner = gameFacade.getAnalyzer().getWinner(gameFacade.getGame());
		displayResult(winner);
	}

	public static void displayResult(Player winner) {
		
		System.out.println(winner != null ? "Winner is " + winner.getName() : "Tied");
		
	}
	
	public static void playMove(MainTest test,GameFacade gameFacade, Player currPlayer) {

		System.out.println("Enter your x,y positions -> ");
		Scanner scanner = new Scanner(System.in);
		int input1 = scanner.nextInt();
		int input2 = scanner.nextInt();

		gameFacade.passToMove(test, gameFacade, currPlayer, input1, input2);

	}

	
}
