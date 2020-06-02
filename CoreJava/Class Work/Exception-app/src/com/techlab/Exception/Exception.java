package com.techlab.Exception;

public class Exception {
	public static void main(String[] args) {
		
		int a = Integer.parseInt(args[0]);//NumberFormatException i.e I/P : abc
		int b = Integer.parseInt(args[1]);//ArrayIndexOutOfBoundsExceptions
	
		int c = a/b;//Arithmetic Exception
		
		System.out.println("Result is " + c);
		System.out.println("End Of Program");
	}

}
