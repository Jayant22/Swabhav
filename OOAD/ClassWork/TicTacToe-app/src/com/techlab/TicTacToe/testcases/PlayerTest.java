package com.techlab.TicTacToe.testcases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.techlab.TicTacToe.*;

class PlayerTest {

	@Test
	void testPlayerConstructor() {

		// Arrange
		String expectedName = "Sam";
		String expectedMark = "X";
		
		// Act
		Player p = new Player("Sam", Mark.X);
		
		// Assert
		assertEquals(expectedName, p.getName());
		assertEquals(expectedMark, p.getMark());
		
	}

}
