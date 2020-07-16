package com.techlab.TicTacToe;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Game extends JFrame {

	private JLabel lb1;
	private JLabel lb2;
	private JLabel lb3;
	private JTextField tf1;
	private JTextField tf2;
	private JTextField tf3;
	private JButton Play_Button;

	public Player player;
	public Player player1;
	public Player currPlayer;
	public Board board;
	public ResultAnalyzer analyzer;

	public Game() {

		this.setLayout(new FlowLayout());  
		this.setSize(500, 500);
		lb1 = new JLabel("Player_One");
		lb1.setVisible(true);
		lb2 = new JLabel("Player_Two");
		lb2.setVisible(true);
		lb3 = new JLabel("Size");
		lb3.setVisible(true);

		tf1 = new JTextField("Enter Player One Name", 25);
		tf2 = new JTextField("Enter Player Two Name", 25);
		tf3 = new JTextField("Enter The Size", 25);
		
		Play_Button = new JButton("Play The Game");

		this.add(lb1);
		this.add(tf1);
		this.add(lb2);
		this.add(tf2);
		this.add(lb3);
		this.add(tf3);

		this.add(Play_Button);

		Play_Button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				player = new Player(tf1.getText(), Mark.X);
				player1 = new Player(tf2.getText(), Mark.O);
				board = new Board(Integer.parseInt(tf3.getText()));
				analyzer = new ResultAnalyzer(board);;
				currPlayer = player;
				start();
				dispose();
			}
		});
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(400, 400);
		this.setVisible(true);
	}

	public Player getCurrPlayer() {
		return currPlayer;
	}

	public void start() {
		board.setGame(this);
		board.printBoard();
	}

	public boolean isGameOver() {
		return analyzer.getWinner(this) != null || board.isNoMovesLeft();
	}

}
