package com.techlab.JFrame;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

public class Registration extends JFrame {

	public Registration() {
		
		int x=0,y=0,width=100,height=20;

		JButton bnt1 = new JButton("SUBMIT");
		bnt1.setBounds(x+200, y+180, width, height);

		JTextField tf1 = new JTextField(35);
		tf1.setBounds(x+75, y+2, width+200, height);
		
		JTextField tf2 = new JTextField(35);
		tf2.setBounds(x+75, y+35, width+200, height);
		
		JTextField tf3 = new JTextField(35);
		tf3.setBounds(x+75, y+150, width+200, height);
		
		JLabel lbl1 = new JLabel("First Name :");
		lbl1.setBounds(x,y,width,height);
		 
		JLabel lbl2 = new JLabel("Last Name :");
		lbl2.setBounds(x,y+30,width,height);
				
		JLabel lbl3 = new JLabel("Age :");
		lbl3.setBounds(x,y+60,width,height);
		
		JLabel lbl4 = new JLabel("Gender :");
		lbl4.setBounds(x,y+90,width,height);
		
		JLabel lbl5 = new JLabel("Select a Course");
		lbl5.setBounds(x,y+120,width,height);
		
		JLabel lbl6 = new JLabel("Orgination");
		lbl6.setBounds(x,y+150,width,height);
		
		JLabel Success = new JLabel();
		Success.setBounds(x+100,y+210,width+200,height);

		String Courses[] = { "Core Java", "JavaScript", "Python", "GoLang", "Web Development" };
		ArrayList<Integer> agelist = new ArrayList<Integer>();
		for (int i = 10; i <= 30; ++i) {
			agelist.add(i);
		}

		JComboBox cb1 = new JComboBox(agelist.toArray());
		cb1.setBounds(x+75, y+60, width, height);
		
		JComboBox cb2 = new JComboBox(Courses);
		cb2.setBounds(x+100, y+120, width, height);
		
		JRadioButton r1 = new JRadioButton(" Male");
		r1.setBounds(x+75, y+90, width, height);
		
		JRadioButton r2 = new JRadioButton(" Female");
		r2.setBounds(x+175, y+90, width, height);

		lbl1.setForeground(Color.BLUE);
		lbl2.setForeground(Color.BLUE);
		lbl3.setForeground(Color.BLUE);
		lbl4.setForeground(Color.BLUE);
		lbl5.setForeground(Color.BLUE);
		lbl6.setForeground(Color.BLUE);
		
		add(lbl1);
		add(tf1);
		
		add(lbl2);
		add(tf2);
		
		add(lbl3);
		add(cb1);
		
		add(lbl4);
		add(r1);
		add(r2);
		
		add(lbl5);
		add(cb2);
		
		add(lbl6);
		add(tf3);
	
		add(bnt1);
		add(Success);
		
	    bnt1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {	
				String result = "Regictration Successful....Welcome to ";
				result += tf3.getText();
				Success.setText(result);
				add(Success);
			}
		});
		
		setLayout(null);
		setSize(500, 500);
		setVisible(true);

	}
}