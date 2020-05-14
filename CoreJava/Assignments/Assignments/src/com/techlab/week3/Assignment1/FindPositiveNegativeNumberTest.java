package com.techlab.week3.Assignment1;

import java.util.Scanner;

public class FindPositiveNegativeNumberTest {
	
	private static Scanner scan;
	final static int mod = 2, low = 0;

	public static void fetchEvenNumber(int[] Array) {
	
		System.out.print("Positive numbers are: \n");
		for (int i = 0; i < Array.length ; i++) {
			if (Array[i] >= low) {
				System.out.println(Array[i]);
			}
		}
	}
	
	public static void fetchOddNumber(int[] Array) {
		
		System.out.print("Negative numbers are: \n");
		for (int i = 0; i < Array.length; i++) {
			if (Array[i] < low) {
				System.out.println(Array[i]);
			}
		}
	}

	public static void main(String args[]) {
		scan = new Scanner(System.in);
		System.out.print("Enter the array size :\n");
		int size = scan.nextInt();
		System.out.print("Enter the elements of the array :\n");
		int array[] = new int[size];
		for (int i = 0; i < array.length; i++) {
			array[i] = scan.nextInt();
		}
		
		fetchEvenNumber(array);
		fetchOddNumber(array);
		
	}

}
