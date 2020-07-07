package com.techlab.TicTacToe;

public class Cell {

	public void changePlayer(Game game, Board boardlist) {
		game.currPlayer = game.currPlayer.equals(game.player1) ? game.player : game.player1;
	}

	public boolean cheakOutOfCell(Board boardlist, int xPosition, int yPosition) {

		if (xPosition >= boardlist.SIZE || yPosition >= boardlist.SIZE || xPosition < 0 || yPosition < 0)
			return false;

		return true;
	}

	public boolean cheakCellAlreadyOccupied(Board boardlist, int xPosition, int yPosition) {

		if (!boardlist.board[xPosition][yPosition].equals(boardlist.FILLER))
			return false;

		return true;
	}

}
