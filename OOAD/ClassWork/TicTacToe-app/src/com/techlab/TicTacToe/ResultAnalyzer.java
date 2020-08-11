package com.techlab.TicTacToe;

public class ResultAnalyzer {

	private Board boardlist;
	private String[][] board;

	public ResultAnalyzer(Board boardlist) {
		this.boardlist = boardlist;
		board = boardlist.getBoard();
	}

	
	private String rowCrossed() {
		for (int i = 0; i < boardlist.getSIZE(); i++) {
			String check = board[i][0];
			for (int j = 1; j < boardlist.getSIZE(); j++) {
				if (!check.equals(board[i][j])) {
					check = boardlist.getFILLER();
					break;
				}
			}
			if (!check.equals(boardlist.getFILLER())) {
				return check;
			}
		}
		return boardlist.getFILLER();
	}

	private String columnCrossed() {
		for (int i = 0; i < boardlist.getSIZE(); i++) {
			String check = board[0][i];
			for (int j = 1; j < boardlist.getSIZE(); j++) {
				if (!check.equals(board[j][i])) {
					check = boardlist.getFILLER();
					break;
				}
			}
			if (!check.equals(boardlist.getFILLER())) {
				return check;
			}
		}
		return boardlist.getFILLER();
	}

	private String diagonalCrossed() {
		String check = board[0][0];
		for (int i = 1; i < boardlist.getSIZE(); i++) {
			if (!check.equals(board[i][i])) {
				check = boardlist.getFILLER();
				break;
			}
		}
		if (!check.equals(boardlist.getFILLER())) {
			return check;
		}
		check = board[0][2];
		for (int i = 1; i < boardlist.getSIZE(); i++) {
			if (!check.equals(board[i][boardlist.getSIZE() - 1 - i])) {
				check = boardlist.getFILLER();
				break;
			}
		}
		if (!check.equals(boardlist.getFILLER())) {
			return check;
		}
		return boardlist.getFILLER();
	}

	public Player getWinner(Game game) {
		String rowSymbol = rowCrossed();
		String columnSymbol = columnCrossed();
		String diagonalSymbol = diagonalCrossed();
		
		if (rowSymbol.equals(game.getPlayer().getMark().toString()))
			return game.getPlayer();
		if (columnSymbol.equals(game.getPlayer().getMark().toString()))
			return game.getPlayer();
		if (diagonalSymbol.equals(game.getPlayer().getMark().toString()))
			return game.getPlayer();
		if (rowSymbol.equals(game.getPlayer1().getMark().toString()))
			return game.getPlayer1();
		if (columnSymbol.equals(game.getPlayer1().getMark().toString()))
			return game.getPlayer1();
		if (diagonalSymbol.equals(game.getPlayer1().getMark().toString()))
			return game.getPlayer1();
		return null;
	}
}
