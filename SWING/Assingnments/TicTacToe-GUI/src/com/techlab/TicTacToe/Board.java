package com.techlab.TicTacToe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Board extends JFrame {

	private JPanel panel;
	private JLabel msgs;
	public final String FILLER = " ";
	public int SIZE;
	public Cell cell;
	public JButton[][] button;
	public Game game;
	int i, j;

	
	public Board(int size) {
		
		this.SIZE = size;

		this.setLayout(new BorderLayout());
		this.setSize(500, 500);

		cell = new Cell();
		this.button = new JButton[SIZE][SIZE];

		msgs = new JLabel();
		msgs.setVisible(true);
		this.add(msgs, BorderLayout.NORTH);

		panel = new JPanel();
		panel.setLayout(new java.awt.GridLayout(SIZE, SIZE));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		for (i = 0; i < SIZE; i++) {
			for (j = 0; j < SIZE; j++) {
				button[i][j] = new JButton();
				button[i][j].setText(FILLER);
				button[i][j].setFont(new Font("Arial", Font.PLAIN, 40));
				button[i][j].setBorder(BorderFactory.createLineBorder(Color.BLACK));
			}
		}

		this.add(panel);
		this.setSize(400, 400);
		this.setVisible(true);
	}
	
	public void setSize(int size) {
		this.SIZE = size;
	}

	public void setGame(Game game) {
		this.game = game;
	}

	public void printBoard() {

		msgs.setText(game.currPlayer.getName() + " Turn now");

		for (i = 0; i < SIZE; i++) {
			for (j = 0; j < SIZE; j++) {
				panel.add(button[i][j]);
				button[i][j].addActionListener(new myActionListener());
			}
		}
	}

	private class myActionListener implements ActionListener {
		public void actionPerformed(ActionEvent a) {

			JButton Temp_Btn = new JButton();
			Temp_Btn = (JButton) a.getSource();
			try {
				if (!cell.cheakCellAlreadyOccupied(game.board, Temp_Btn)) {
					throw new CellAlreadyOccupiedException(game.board);
				}
				else
					move(game, Temp_Btn);

			} catch (CellAlreadyOccupiedException e) {
			}
			
		}
	}

	public void move(Game game, JButton button_passed) {
		
		button_passed.setText(game.currPlayer.getMark().toString());
		cell.changePlayer(game);
		msgs.setText(game.currPlayer.getName() + " Turn now");
		if (game.isGameOver()) {
			Player winner = game.analyzer.getWinner(game);
			JOptionPane.showMessageDialog(null, winner != null ? "Winner is " + winner.getName() : "Tied");
		}
	}

	public boolean isNoMovesLeft() {
		for (int i = 0; i < SIZE; i++) {
			for (int j = 0; j < SIZE; j++) {
				if (button[i][j].getText().equals(FILLER)) {
					return false;
				}
			}
		}
		return true;
	}
}
