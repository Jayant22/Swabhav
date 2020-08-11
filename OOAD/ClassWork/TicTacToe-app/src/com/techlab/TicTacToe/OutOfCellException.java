package com.techlab.TicTacToe;

import com.techlab.TicTacToe.GameFacade;
import com.techlab.TicTacToe.test.MainTest;

public class OutOfCellException extends Exception {

	public OutOfCellException() {
		
		super("Positions exceeds the Cell Limit!!!!!!!!.");
	}
}
