package com.techlab.TicTacToe;

import com.techlab.TicTacToe.test.MainTest;

public class OutOfCellException extends Exception {

	public OutOfCellException(MainTest test, Game game) {
		System.out.println("Positions exceeds the Cell Limit!!!!!!!!.");
		MainTest.playMove(test, game, game.currPlayer);
	}
}
