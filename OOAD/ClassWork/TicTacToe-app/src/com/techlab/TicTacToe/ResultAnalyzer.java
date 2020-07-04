package com.techlab.TicTacToe;

public class ResultAnalyzer {

	private Board boardlist;

	public ResultAnalyzer(Board boardlist) {
		this.boardlist = boardlist;
	}

	private String rowCrossed() {
		for (int i = 0; i < boardlist.SIZE; i++) {
			String check = boardlist.board[i][0];
			for (int j = 1; j < boardlist.SIZE; j++) {
				if (!check.equals(boardlist.board[i][j])) {
					check = boardlist.FILLER;
					break;
				}
			}
			if (!check.equals(boardlist.FILLER)) {
				return check;
			}
		}
		return boardlist.FILLER;
	}

	private String columnCrossed() {
		for (int i = 0; i < boardlist.SIZE; i++) {
			String check = boardlist.board[0][i];
			for (int j = 1; j < boardlist.SIZE; j++) {
				if (!check.equals(boardlist.board[j][i])) {
					check = boardlist.FILLER;
					break;
				}
			}
			if (!check.equals(boardlist.FILLER)) {
				return check;
			}
		}
		return boardlist.FILLER;
	}

	private String diagonalCrossed() {
		String check = boardlist.board[0][0];
		for (int i = 1; i < boardlist.SIZE; i++) {
			if (!check.equals(boardlist.board[i][i])) {
				check = boardlist.FILLER;
				break;
			}
		}
		if (!check.equals(boardlist.FILLER)) {
			return check;
		}
		check = boardlist.board[0][2];
		for (int i = 1; i < boardlist.SIZE; i++) {
			if (!check.equals(boardlist.board[i][boardlist.SIZE - 1 - i])) {
				check = boardlist.FILLER;
				break;
			}
		}
		if (!check.equals(boardlist.FILLER)) {
			return check;
		}
		return boardlist.FILLER;
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
