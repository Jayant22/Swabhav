package com.techlab.TicTacToe.testcases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.techlab.TicTacToe.*;

class ResultAnalyzerTest {

	@Test
	void check_row_for_winner() {

		Player expectedplayer = new Player("Player1", Mark.X);

		Player player = new Player("Player1", Mark.X);

		Player player1 = new Player("Player2", Mark.O);

		Player currPlayer = player;

		Board board = new Board();

		ResultAnalyzer analyzer = new ResultAnalyzer(board);

		Game game = new Game(player, player1, board, analyzer);
		game.start();

		playMove(test, game, currPlayer);
		
		Player winner = analyzer.getWinner(game);
		System.out.println(winner != null ? "Winner is " + winner.getName() : "Tied");

		assertEquals(expectedplayer, winner);

	}

	@Test
	void check_column_for_winner() {

		Player expectedplayer = new Player("Player1", Mark.X);

		Player player = new Player("Player1", Mark.X);

		Player player1 = new Player("Player2", Mark.O);

		Player currPlayer = player;

		Board board = new Board();

		ResultAnalyzer analyzer = new ResultAnalyzer(board);

		Game game = new Game(player, player1, board, analyzer, currPlayer);
		game.start();

		Player winner = analyzer.getWinner(game);
		System.out.println(winner != null ? "Winner is " + winner.getName() : "Tied");

		assertEquals(expectedplayer, winner);
	}

	@Test
	void check_diagonal_for_winner() {

		Player expectedplayer = new Player("Player1", Mark.X);

		Player player = new Player("Player1", Mark.X);

		Player player1 = new Player("Player2", Mark.O);

		Player currPlayer = player;

		Board board = new Board();

		ResultAnalyzer analyzer = new ResultAnalyzer(board);

		Game game = new Game(player, player1, board, analyzer, currPlayer);
		game.start();

		Player winner = analyzer.getWinner(game);
		System.out.println(winner != null ? "Winner is " + winner.getName() : "Tied");

		assertEquals(expectedplayer, winner);
	}

	@Test
	void check_for_draw() {

		boolean exceptedDraw = false;

		Player player = new Player("Player1", Mark.X);
		Player player1 = new Player("Player1", Mark.O);
		Board boardcell = new Board();

		int flag = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (flag == 0) {
					boardcell.board[i][j] = player.getMark().toString();
					flag = 1;
				} else {
					boardcell.board[i][j] = player1.getMark().toString();
					flag = 0;
				}
			}
		}

		assertEquals(exceptedDraw, boardcell.isBoardEmpty());
	}

}
