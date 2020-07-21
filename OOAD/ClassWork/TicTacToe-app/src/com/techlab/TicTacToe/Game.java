package com.techlab.TicTacToe;

public class Game {

	public Player player;
	public Player player1;
	public Player currPlayer;
	public Board board;
	public ResultAnalyzer analyzer;

	public Game(Player player, Player player1, Board board, ResultAnalyzer analyzer) {

		this.player = player;
		this.player1 = player1;
		this.board = board;
		this.analyzer = analyzer;
		this.currPlayer = player;
	}

	public Player getCurrPlayer() {
		return currPlayer;
	}

	public void start() {
		//board.printBoard(this.getCurrPlayer());
	}

	public boolean isGameOver() {
		return analyzer.getWinner(this) != null || board.isNoMovesLeft();
	}
}
