package com.techlab.JFrame;

import javax.swing.*;

public class DisplayName extends JFrame {

	JFrame frame;

	public DisplayName() {
	  
        // create button 
        JButton button = new JButton("Jayant"); 
  
        button.setBounds(165, 135, 115, 55); 
          
        // adding button on frame 
        add(button); 
   
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
  
        setSize(400, 500); 
        setLayout(null); 
        setVisible(true); 
	}
}
