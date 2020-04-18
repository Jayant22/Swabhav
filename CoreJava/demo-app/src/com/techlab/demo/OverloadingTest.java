package com.techlab.demo;

public class OverloadingTest {
	
	public static void printscreen(int a) {
		System.out.println(a);
	}
	public static void printscreen(boolean a) {
		System.out.println(a);
	}
	public static void printscreen(char a) {
		System.out.println(a);
	}
	public static void printscreen(double a) {
		System.out.println(a);
	}
	public static void printscreen(float a) {
		System.out.println(a);
	}
	public static void printscreen(long a) {
		System.out.println(a);
	}
	public static void printscreen(char[] a) {
		System.out.println(a);
	}
	public static void printscreen(String a) {
		System.out.println(a);
	}

	public static void main(String[] args) {
		int integer = 10;
		String string = "Jayant";
		char character = 'C';
		double dou = 32.32;
		float flo = 5.5f;
		long lon = 98l;
		char[] chararray = {'r', 's', 't', 'u', 'v'};
		boolean bool = true;
		
		printscreen(integer);
		printscreen(bool);
		printscreen(character);
		printscreen(dou);
		printscreen(flo);
		printscreen(lon);
		printscreen(chararray);
		printscreen(string);
		
	}
}
