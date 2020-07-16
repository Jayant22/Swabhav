package com.techlab.TicTacToe;

public class ResultAnalyzer {

	private Board board;

	public ResultAnalyzer(Board board) {
		this.board = board;
	}

	private String rowCrossed() {
		for (int i = 0; i < board.SIZE; i++) {
			String check = board.button[i][0].getText();
			for (int j = 1; j < board.SIZE; j++) {
				if (!check.equals(board.button[i][j].getText())) {
					check = board.FILLER;
					break;
				}
			}
			if (!check.equals(board.FILLER)) {
				return check;
			}
		}
		return board.FILLER;
	}

	private String columnCrossed() {
		for (int i = 0; i < board.SIZE; i++) {
			String check = board.button[0][i].getText();
			for (int j = 1; j < board.SIZE; j++) {
				if (!check.equals(board.button[j][i].getText())) {
					check = board.FILLER;
					break;
				}
			}
			if (!check.equals(board.FILLER)) {
				return check;
			}
		}
		return board.FILLER;
	}

	private String diagonalCrossed() {
		String check = board.button[0][0].getText();
		for (int i = 1; i < board.SIZE; i++) {
			if (!check.equals(board.button[i][i].getText())) {
				check = board.FILLER;
				break;
			}
		}
		if (!check.equals(board.FILLER)) {
			return check;
		}
		check = board.button[0][2].getText();
		for (int i = 1; i < board.SIZE; i++) {
			if (!check.equals(board.button[i][board.SIZE - 1 - i].getText())) {
				check = board.FILLER;
				break;
			}
		}
		if (!check.equals(board.FILLER)) {
			return check;
		}
		return board.FILLER;
	}

	public Player getWinner(Game game) {
		String rowSymbol = rowCrossed();
		String columnSymbol = columnCrossed();
		String diagonalSymbol = diagonalCrossed();
		
		if (rowSymbol.equals(game.player.getMark().toString()))
			return game.player;
		if (columnSymbol.equals(game.player.getMark().toString()))
			return game.player;
		if (diagonalSymbol.equals(game.player.getMark().toString()))
			return game.player;
		if (rowSymbol.equals(game.player1.getMark().toString()))
			return game.player1;
		if (columnSymbol.equals(game.player1.getMark().toString()))
			return game.player1;
		if (diagonalSymbol.equals(game.player1.getMark().toString()))
			return game.player1;
		return null;
	}
}
