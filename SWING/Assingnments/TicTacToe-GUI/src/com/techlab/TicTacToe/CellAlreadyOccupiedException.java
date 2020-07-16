package com.techlab.TicTacToe;

public class CellAlreadyOccupiedException extends Exception {

	public CellAlreadyOccupiedException(Board test) {
		System.out.println("Cell is already occupied!!!!!!!!");
	}
}
