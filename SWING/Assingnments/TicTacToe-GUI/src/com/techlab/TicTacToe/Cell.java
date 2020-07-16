package com.techlab.TicTacToe;

import javax.swing.JButton;

public class Cell {

	public void changePlayer(Game game) {
		if(game.currPlayer.equals(game.player))
			game.currPlayer = game.player1;
		else
			game.currPlayer = game.player;
		/*
		 * game.currPlayer = game.currPlayer.equals(game.player1) ? game.player :
		 * game.player1;
		 */
	}

	public boolean cheakCellAlreadyOccupied(Board test, JButton button) {

		if (!button.getText().equals(test.FILLER))
			return false;

		return true;
	}

}
