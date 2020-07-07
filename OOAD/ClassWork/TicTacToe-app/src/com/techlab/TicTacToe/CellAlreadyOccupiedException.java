package com.techlab.TicTacToe;

import com.techlab.TicTacToe.test.MainTest;

public class CellAlreadyOccupiedException extends Exception {

	public CellAlreadyOccupiedException(MainTest test, Game game) {
		System.out.println("Cell is already occupied!!!!!!!!");
		MainTest.playMove(test, game, game.currPlayer);
				
	}
}
