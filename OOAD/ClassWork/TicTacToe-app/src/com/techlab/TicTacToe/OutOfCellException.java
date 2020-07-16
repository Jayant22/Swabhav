package com.techlab.TicTacToe;

import com.techlab.TicTacToe.GameFacade;
import com.techlab.TicTacToe.test.MainTest;

public class OutOfCellException extends Exception {

	public OutOfCellException(MainTest test, GameFacade gameFacade) {
		System.out.println("Positions exceeds the Cell Limit!!!!!!!!.");
		test.playMove(test, gameFacade, gameFacade.getGame().currPlayer);
	}
}
