package com.techlab.TicTacToe.testcases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.techlab.TicTacToe.*;

class CellTest {

	@Test
	void if_mark_is_empty_when_cell_is_created() {

		boolean exceptedResult = true;

		Board board = new Board();

		assertEquals(exceptedResult, board.isBoardEmpty());

	}

	@Test
	void if_marking_is_done_properly() {

		boolean exceptedResultOfOutOfCell = true;
		boolean exceptedResultOfCellOccupied = true;

		Board boardcell = new Board();
		Player player = new Player("Player1", Mark.X);

		boardcell.board[1][1] = player.getMark().toString();

		assertEquals(exceptedResultOfOutOfCell, boardcell.cell.cheakOutOfCell(boardcell, 2, 2));
		assertEquals(exceptedResultOfCellOccupied, boardcell.cell.cheakCellAlreadyOccupied(boardcell, 2, 2));

	}

	@Test
	void check_if_marks_dont_overwrite_other_marks_in_a_call_and_throws_exception_if_we_try() {

		boolean exceptedResultOfCellOccupied = false;

		Board boardcell = new Board();
		Player player = new Player("Player1", Mark.X);

		boardcell.board[1][1] = player.getMark().toString();

		assertEquals(exceptedResultOfCellOccupied, boardcell.cell.cheakCellAlreadyOccupied(boardcell, 1, 1));
	}

	@Test
	void if_set_mark_works_properly() {

		String[][] exceptedResultboard = new String[3][3];

		Player player = new Player("Player1", Mark.X);

		Board boardcell = new Board();

		exceptedResultboard[1][1] = player.getMark().toString();
		boardcell.board[1][1] = player.getMark().toString();

		assertEquals(exceptedResultboard[1][1], boardcell.board[1][1]);

	}

}
