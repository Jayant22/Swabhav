package com.techlab.Solution;

public class TxtLogger implements ILogable{

	public void log(String Error) {
		
		System.out.println("Writing to Text File::::\n" + Error );
	}
}
