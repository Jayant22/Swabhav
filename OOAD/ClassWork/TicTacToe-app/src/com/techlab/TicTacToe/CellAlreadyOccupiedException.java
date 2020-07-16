package com.techlab.TicTacToe;

import com.techlab.TicTacToe.test.MainTest;

public class CellAlreadyOccupiedException extends Exception {

	public CellAlreadyOccupiedException(MainTest test, GameFacade gameFacade) {
		System.out.println("Cell is already occupied!!!!!!!!");
		test.playMove(test, gameFacade, gameFacade.getGame().currPlayer);
				
	}
}
