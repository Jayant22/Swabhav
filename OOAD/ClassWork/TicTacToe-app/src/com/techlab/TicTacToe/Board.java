package com.techlab.TicTacToe;

public class Board {

	public String[][] board;
	public final String FILLER = " ";
	public final int SIZE = 3;
	public Cell cell;

	public Board() {
		board = new String[SIZE][SIZE];
		cell = new Cell();
		clearBoard();
	}

	public String[][] getBoard() {
		return board;
	}

	private void clearBoard() {
		for (int i = 0; i < SIZE; i++) {
			for (int j = 0; j < SIZE; j++) {
				board[i][j] = FILLER;
			}
		}
	}

	public void printBoard(Player currPlayer) {
		String header = "  ";
		for (int j = 0; j < SIZE; j++) {
			header += "|" + (j + 1);
		}
		System.out.println(header);
		for (int j = 0; j < SIZE * 3; j++) {
			System.out.print("_");
		}
		System.out.println();
		for (int i = 0; i < SIZE; i++) {
			String row = (i + 1) + " ";
			for (int j = 0; j < SIZE; j++) {
				row += "|" + board[i][j];
			}
			System.out.println(row);
			for (int j = 0; j < SIZE * 3; j++) {
				System.out.print("_");
			}
			System.out.println();
		}
		System.out.println(currPlayer.getName() + " Turn now");
	}
	
	public void move(Game game, int xPosition, int yPosition) {
		if (!cell.isValidMove(this,xPosition, yPosition))
			game.playMove(game.currPlayer);
		board[xPosition][yPosition] = game.currPlayer.getMark().toString();
		cell.changePlayer(game,this);
		printBoard(game.currPlayer);
		if (!game.isGameOver()) {
			game.playMove(game.currPlayer);
		}
	}

}
