package com.techlab.TicTacToe;

import java.util.Scanner;

public class Game {

	public Player player;
	public Player player1;
	public Player currPlayer;
	public Board board1;
	public ResultAnalyzer analyzer;

	public Game(Player player, Player player1, Board board, ResultAnalyzer analyzer, Player currPlayer) {

		this.player = player;
		this.player1 = player1;
		this.board1 = board;
		this.analyzer = analyzer;
		this.currPlayer = currPlayer;
	}

	public Player getCurrPlayer() {
		return currPlayer;
	}

	public void start() {
		board1.printBoard(this.getCurrPlayer());
		playMove(this.getCurrPlayer());
	}

	public void playMove(Player currPlayer) {

		System.out.println("Enter your x,y positions -> ");
		Scanner scanner = new Scanner(System.in);
		int input1 = scanner.nextInt();
		int input2 = scanner.nextInt();

		board1.move(this, input1 - 1, input2 - 1);

	}

	private boolean isNoMovesLeft() {
		for (int i = 0; i < board1.SIZE; i++) {
			for (int j = 0; j < board1.SIZE; j++) {
				if (board1.board[i][j].equals(board1.FILLER)) {
					return false;
				}
			}
		}
		return true;
	}

	public boolean isGameOver() {
		return analyzer.getWinner(this) != null || isNoMovesLeft();
	}
}
