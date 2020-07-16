package com.techlab.JFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ButtonClicked extends JFrame{
	
	 JFrame frame; 
	 public ButtonClicked() 
	    { 
	        setTitle("this is also a title"); 
	  
	        // create button 
	        JButton button = new JButton("click"); 
	  
	        button.setBounds(165, 135, 115, 55); 
	          
	        // adding button on frame 
	        add(button); 
	  
	        button.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					new DisplayName();
					
				}
			});
	        // setting close operation 
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	  
	        setSize(400, 500); 
	        setLayout(null); 
	        setVisible(true); 
	    }
}
