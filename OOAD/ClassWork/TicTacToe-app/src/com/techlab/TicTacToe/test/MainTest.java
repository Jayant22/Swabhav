package com.techlab.TicTacToe.test;

import com.techlab.TicTacToe.*;

public class MainTest {

	public static void main(String[] args) {
		
		Player player= new Player("Player1",Mark.X);
		
		Player player1 = new Player("Player2",Mark.O);
		
		Player currPlayer = player;
		
		Board board = new Board();
		
		ResultAnalyzer analyzer = new ResultAnalyzer(board);
		
		Game game = new Game(player, player1, board, analyzer, currPlayer);
		game.start();
		
		Player winner = analyzer.getWinner(game);
		System.out.println(winner != null ? "Winner is " + winner.getName() : "Tied");
	}
}
