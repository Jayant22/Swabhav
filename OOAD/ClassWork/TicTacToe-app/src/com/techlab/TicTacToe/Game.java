package com.techlab.TicTacToe;

public class Game {

	private Player player;
	private Player player1;
	private Player currPlayer;
	private Board board;
	private ResultAnalyzer analyzer;

	public Game(Player player, Player player1, Board board, ResultAnalyzer analyzer) {

		this.player = player;
		this.player1 = player1;
		this.board = board;
		this.analyzer = analyzer;
		this.currPlayer = player;
	}

	
	public Player getPlayer() {
		return player;
	}


	public Player getPlayer1() {
		return player1;
	}


	public Board getBoard() {
		return board;
	}


	public ResultAnalyzer getAnalyzer() {
		return analyzer;
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
	
	public void changePlayer() {
		currPlayer = currPlayer.equals(player1) ? player : player1;
	}
}
