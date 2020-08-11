package com.techlab.TicTacToe;

import com.techlab.TicTacToe.GameFacade;
import com.techlab.TicTacToe.test.MainTest;

public class Board {

	private String[][] board;
	private final String FILLER = " ";
	private int SIZE;
	private Cell cell;

	public Board(int size) {
		this.SIZE = size;
		board = new String[SIZE][SIZE];
		cell = new Cell();
		clearBoard();
	}

	public String getFILLER() {
		return FILLER;
	}

	public int getSIZE() {
		return SIZE;
	}

	public Cell getCell() {
		return cell;
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

	public void move(MainTest test, GameFacade gameFacade, int xPosition, int yPosition)
			throws OutOfCellException, CellAlreadyOccupiedException {
		if (!cell.cheakOutOfCell(this, xPosition, yPosition)) {
			throw new OutOfCellException();
		}
		if (!cell.cheakCellAlreadyOccupied(this, xPosition, yPosition)) {
			throw new CellAlreadyOccupiedException();
		}

		board[xPosition][yPosition] = gameFacade.getGame().getCurrPlayer().getMark().toString();
		gameFacade.getGame().changePlayer();
		// printBoard(gameFacade.getGame().currPlayer);
		if (!gameFacade.getGame().isGameOver())
			test.playMove(test, gameFacade, gameFacade.getGame().getCurrPlayer());
		else
			test.printBoard(gameFacade, gameFacade.getGame().getCurrPlayer());
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
