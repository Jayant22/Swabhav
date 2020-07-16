package com.techlab.JFrame;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Component;
import java.awt.Frame;
import java.awt.TextArea;

import javax.swing.JFrame;

public class CustomFrame extends JFrame {

	public void sayHelloFrame() {
		Frame frame = new Frame("Custom Frame");

		Component textArea = new TextArea("Hello Everyone......");

		frame.add(textArea, BorderLayout.NORTH);

		int width = 300;

		int height = 300;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.setSize(width, height);

		frame.setVisible(true);
		
		
	}
	
	public void sayByeFrame() {
		Frame frame = new Frame("Custom Frame");

		Component textArea = new TextArea("Byee Everyone......");

		frame.add(textArea, BorderLayout.NORTH);

		int width = 300;

		int height = 300;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.setSize(width, height);

		frame.setVisible(true);
	}
}
