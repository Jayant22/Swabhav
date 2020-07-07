package com.techlab.TicTacToe.test;

import java.util.Scanner;

import com.techlab.TicTacToe.*;

public class MainTest {

	public static void main(String[] args) {
		
		MainTest test = new MainTest();

		Player player = new Player("Player1", Mark.X);

		Player player1 = new Player("Player2", Mark.O);

		Player currPlayer = player;

		System.out.println("Enter the of matrix::");
		Scanner scanner = new Scanner(System.in);
		
		int Size = scanner.nextInt();
		
		Board board = new Board(Size);

		ResultAnalyzer analyzer = new ResultAnalyzer(board);

		Game game = new Game(player, player1, board, analyzer);
		game.start();

		playMove(test, game, currPlayer);
		
		Player winner = analyzer.getWinner(game);
		displayResult(winner);
	}

	public static void displayResult(Player winner) {
		
		System.out.println(winner != null ? "Winner is " + winner.getName() : "Tied");
		
	}

	public static void playMove(MainTest test, Game game, Player currPlayer) {

		System.out.println("Enter your x,y positions -> ");
		Scanner scanner = new Scanner(System.in);
		int input1 = scanner.nextInt();
		int input2 = scanner.nextInt();

		game.board.move(test, game, input1 - 1, input2 - 1);

	}
}
