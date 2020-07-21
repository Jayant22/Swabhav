package com.techlab.TicTacToe.test;

import java.util.Scanner;

import com.techlab.TicTacToe.*;

public class MainTest {

	public int Size;

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

	public static void playMove(MainTest test, GameFacade gameFacade, Player currPlayer) {

		printBoard(gameFacade, gameFacade.getGame().currPlayer);

		System.out.println("Enter your x,y positions -> ");
		Scanner scanner = new Scanner(System.in);
		int input1 = scanner.nextInt();
		int input2 = scanner.nextInt();

		gameFacade.passToMove(test, gameFacade, currPlayer, input1, input2);

	}

	public static void printBoard(GameFacade gameFacade, Player currPlayer) {
		String header = "  ";
		for (int j = 0; j < gameFacade.getBoard().SIZE; j++) {
			header += "|" + (j + 1);
		}
		System.out.println(header);
		for (int j = 0; j < gameFacade.getBoard().SIZE * 3; j++) {
			System.out.print("_");
		}
		System.out.println();
		for (int i = 0; i < gameFacade.getBoard().SIZE; i++) {
			String row = (i + 1) + " ";
			for (int j = 0; j < gameFacade.getBoard().SIZE; j++) {
				row += "|" + gameFacade.getBoard().board[i][j];
			}
			System.out.println(row);
			for (int j = 0; j < gameFacade.getBoard().SIZE * 3; j++) {
				System.out.print("_");
			}
			System.out.println();
		}
		System.out.println(currPlayer.getName() + " Turn now");
	}

}
