package com.techlab.Solution;

public class XmlLogger implements ILogable{

	public void log(String Error) {

		System.out.println("Writing to XML File::::\n" + Error);
	}
}
