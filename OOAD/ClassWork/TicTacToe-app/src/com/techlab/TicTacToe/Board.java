package com.techlab.TicTacToe;

import com.techlab.TicTacToe.GameFacade;
import com.techlab.TicTacToe.test.MainTest;

public class Board {

	public String[][] board;
	public final String FILLER = " ";
	public int SIZE;
	public Cell cell;

	public Board(int size) {
		this.SIZE = size;
		board = new String[SIZE][SIZE];
		cell = new Cell();
		clearBoard();
	}

	public String[][] getBoard() {
		return board;
	}

	public boolean isBoardEmpty() {
		int flag = 0;
		for (int i = 0; i < SIZE; i++) {
			for (int j = 0; j < SIZE; j++) {
				if (board[i][j] == FILLER)
					flag = 1;
			}
		}
		if (flag == 1)
			return true;
		else
			return false;
	}

	private void clearBoard() {
		for (int i = 0; i < SIZE; i++) {
			for (int j = 0; j < SIZE; j++) {
				board[i][j] = FILLER;
			}
		}
	}

	/*
	 * public void printBoard(Player currPlayer) { String header = "  "; for (int j
	 * = 0; j < SIZE; j++) { header += "|" + (j + 1); } System.out.println(header);
	 * for (int j = 0; j < SIZE * 3; j++) { System.out.print("_"); }
	 * System.out.println(); for (int i = 0; i < SIZE; i++) { String row = (i + 1) +
	 * " "; for (int j = 0; j < SIZE; j++) { row += "|" + board[i][j]; }
	 * System.out.println(row); for (int j = 0; j < SIZE * 3; j++) {
	 * System.out.print("_"); } System.out.println(); }
	 * System.out.println(currPlayer.getName() + " Turn now"); }
	 */

	public void move(MainTest test, GameFacade gameFacade, int xPosition, int yPosition) {
		try {
			if (!cell.cheakOutOfCell(this, xPosition, yPosition)) {
				throw new OutOfCellException(test, gameFacade);
			}
			if (!cell.cheakCellAlreadyOccupied(this, xPosition, yPosition)) {
				throw new CellAlreadyOccupiedException(test, gameFacade);
			}

		} catch (CellAlreadyOccupiedException e) {
		} catch (OutOfCellException e) {
		}
		board[xPosition][yPosition] = gameFacade.getGame().currPlayer.getMark().toString();
		cell.changePlayer(gameFacade.getGame(), this);
		//printBoard(gameFacade.getGame().currPlayer);
		if (!gameFacade.getGame().isGameOver()) {
			test.playMove(test, gameFacade, gameFacade.getGame().currPlayer);
		}
	}

	public boolean isNoMovesLeft() {
		for (int i = 0; i < SIZE; i++) {
			for (int j = 0; j < SIZE; j++) {
				if (board[i][j].equals(FILLER)) {
					return false;
				}
			}
		}
		return true;
	}
}
