package com.techlab.TicTacToe;

public class CellAlreadyOccupiedException extends Exception {

	public CellAlreadyOccupiedException(Game game) {
		System.out.println("Cell is already occupied!!!!!!!!");
		game.playMove(game.currPlayer);
				
	}
}
