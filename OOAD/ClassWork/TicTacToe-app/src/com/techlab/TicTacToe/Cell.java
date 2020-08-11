package com.techlab.TicTacToe;

public class Cell {

	public boolean cheakOutOfCell(Board boardlist, int xPosition, int yPosition) {

		if (xPosition >= boardlist.getSIZE() || yPosition >= boardlist.getSIZE() || xPosition < 0 || yPosition < 0)
			return false;

		return true;
	}

	public boolean cheakCellAlreadyOccupied(Board boardlist, int xPosition, int yPosition) {

		if (!boardlist.getBoard()[xPosition][yPosition].equals(boardlist.getFILLER()))
			return false;

		return true;
	}

}
