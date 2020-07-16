package com.techlab.JFrame;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class ChangeButtonColor extends JFrame {

	JFrame frame;

	public ChangeButtonColor() {
		JButton button1 = new JButton(" Red Button");
        JButton button2 = new JButton(" Blue Button ");
        JFrame frame = new JFrame();
        JPanel p = new JPanel();
        p.setLayout(null);
        button1.setBounds(100, 100, 150, 40);
        p.add(button1);
        button1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				button1.setBackground(Color.RED);
				
			}
		});
        button2.setBounds(300, 100, 150, 40);
        p.add(button2);
        button2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				button2.setBackground(Color.BLUE);
				
			}
		});
        frame.getContentPane().add(p);
        frame.setSize(500, 500);
        frame.setVisible(true);
	}
}
