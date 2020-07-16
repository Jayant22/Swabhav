package com.techlab.JFrame;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class ChangeBackGroundColor extends JFrame {

	public ChangeBackGroundColor() {
		JButton button1 = new JButton(" Red Button");
        JButton button2 = new JButton(" Blue Button ");
    
        setLayout(new FlowLayout());
        button1.setBounds(100, 100, 150, 40);
        add(button1);
        button1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				getContentPane().setBackground(Color.RED);
				
			}
		});
        button2.setBounds(300, 100, 150, 40);
        add(button2);
        button2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				getContentPane().setBackground(Color.BLUE);
				
			}
		});
        setSize(500, 500);
        setVisible(true);
	}
}
