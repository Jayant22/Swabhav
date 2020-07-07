package com.techlab.TicTacToe.testcases;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import com.techlab.TicTacToe.Board;
import com.techlab.TicTacToe.Mark;
import com.techlab.TicTacToe.Player;

class BoardTest {

	@Test
	void check_if_board_is_created_with_proper_number_of_Cells() {

		String FILLER = " ";
		String[][] expectedBoard = new String[3][3];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				expectedBoard[i][j] = FILLER;
			}
		}
		Board boardcell = new Board();
		assertEquals(expectedBoard.length, boardcell.board.length);

	}

	@Test
	void check_if_board_has_empty_cells() {

		boolean exceptedResult = true;

		Board board = new Board();

		assertEquals(exceptedResult, board.isBoardEmpty());
	}

	@Test
	void check_if_marks_can_be_set_on_a_given_position() {

		boolean exceptedResultOfOutOfCell = true;
		boolean exceptedResultOfCellOccupied = true;

		Board boardcell = new Board();
		Player player = new Player("Player1", Mark.X);

		boardcell.board[1][1] = player.getMark().toString();

		assertEquals(exceptedResultOfOutOfCell, boardcell.cell.cheakOutOfCell(boardcell, 2, 2));
		assertEquals(exceptedResultOfCellOccupied, boardcell.cell.cheakCellAlreadyOccupied(boardcell, 2, 2));
	}

	@Test
	void check_if_marks_dont_overwrite_other_marks_and_throws_exception_if_we_try() {

		boolean exceptedResultOfCellOccupied = false;

		Board boardcell = new Board();
		Player player = new Player("Player1", Mark.X);

		boardcell.board[1][1] = player.getMark().toString();

		assertEquals(exceptedResultOfCellOccupied, boardcell.cell.cheakCellAlreadyOccupied(boardcell, 1, 1));
	}

	@Test
	void check_if_board_full_returns_true_if_board_is_full() {

		boolean exceptedResultBoardFull = false;
	
		Player player = new Player("Player1", Mark.X);
		Player player1 = new Player("Player1", Mark.O);
		Board boardcell = new Board();
	
		int flag = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if(flag == 0) {
					boardcell.board[i][j] = player.getMark().toString() ;
					flag = 1;
				}
				else {
					boardcell.board[i][j] = player1.getMark().toString() ;
					flag = 0;
				}	
			}
		}
		
		
		assertEquals(exceptedResultBoardFull, boardcell.isBoardEmpty());
		
	}

}
