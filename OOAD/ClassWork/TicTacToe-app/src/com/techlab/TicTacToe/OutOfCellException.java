package com.techlab.TicTacToe;

public class OutOfCellException extends Exception {

	public OutOfCellException(Game game) {
		System.out.println("Positions exceeds the Cell Limit!!!!!!!!.");
		game.playMove(game.currPlayer);
	}
}
