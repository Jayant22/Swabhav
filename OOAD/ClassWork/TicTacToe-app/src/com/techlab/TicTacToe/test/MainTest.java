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
		gameFacade.startGame();

		playMove(test, gameFacade, gameFacade.getCurrPlayer());

		Player winner = gameFacade.displayResult();
		System.out.println(winner != null ? "Winner is " + winner.getName() : "Tied");
	}

	public static void playMove(MainTest test, GameFacade gameFacade, Player currPlayer) {

		printBoard(gameFacade, gameFacade.getGame().getCurrPlayer());
		System.out.println(currPlayer.getName() + " Turn now");
		System.out.println("Enter your x,y positions -> ");
		Scanner scanner = new Scanner(System.in);
		int input1 = scanner.nextInt();
		int input2 = scanner.nextInt();

		try {
			gameFacade.passToMove(test, gameFacade, currPlayer, input1, input2);
		} catch (OutOfCellException e) {
			System.out.println(e.getMessage());
			playMove(test, gameFacade, gameFacade.getGame().getCurrPlayer());
		} catch (CellAlreadyOccupiedException e) {
			System.out.println(e.getMessage());
			playMove(test, gameFacade, gameFacade.getGame().getCurrPlayer());
		}

	}

	public static void printBoard(GameFacade gameFacade, Player currPlayer) {
		
		String[][] board = gameFacade.getBoard().getBoard();
		String header = "  ";
		for (int j = 0; j < gameFacade.getBoard().getSIZE(); j++) {
			header += "|" + (j + 1);
		}
		System.out.println(header);
		for (int j = 0; j < gameFacade.getBoard().getSIZE() * 3; j++) {
			System.out.print("_");
		}
		System.out.println();
		for (int i = 0; i < gameFacade.getBoard().getSIZE(); i++) {
			String row = (i + 1) + " ";
			for (int j = 0; j < gameFacade.getBoard().getSIZE(); j++) {
				row += "|" + board[i][j];
			}
			System.out.println(row);
			for (int j = 0; j < gameFacade.getBoard().getSIZE() * 3; j++) {
				System.out.print("_");
			}
			System.out.println();
		}
		
	}

}
