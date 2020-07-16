package com.techlab.TicTacToe;

import com.techlab.TicTacToe.test.MainTest;

public class GameFacade {

	private Player player;
	private Player player1;
	private static Board board;
	private ResultAnalyzer analyzer;
	private Game game;
	public Player currPlayer;

	public GameFacade(int Size) {
		this.player = new Player("Player1", Mark.X);
		this.player1 = new Player("Player2", Mark.O);

		currPlayer = player;
		board = new Board(Size);
		analyzer = new ResultAnalyzer(board);
		game = new Game(player, player1, board, analyzer);
	}

	public Player player_One() {
		return player;
	}

	public Player player_Two() {
		return player1;
	}

	public Board getBoard() {
		return board;
	}

	public ResultAnalyzer getAnalyzer() {
		return analyzer;
	}

	public Game getGame() {
		return game;
	}

	public Player getCurrPlayer() {
		return currPlayer;
	}
	
	public void passToMove(MainTest test,GameFacade gameFacade, Player currPlayer,int input1, int input2) {
		board.move(test, gameFacade, input1 - 1, input2 - 1);
	}

}
