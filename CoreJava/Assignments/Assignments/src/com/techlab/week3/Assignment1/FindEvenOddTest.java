package com.techlab.week3.Assignment1;

import java.util.Scanner;

public class FindEvenOddTest {

	private static Scanner scan;
	final static int MOD = 2, LOW = 0, HIGH = 1;

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

	public static void fetchEvenNumber(int[] Array) {

		System.out.print("Even numbers are: \n");
		for (int i = 0; i < Array.length; i++) {
			if (Array[i] % MOD == LOW) {
				System.out.println(Array[i]);
			}
		}
	}

	public static void fetchOddNumber(int[] Array) {

		System.out.print("Odd numbers are: \n");
		for (int i = 0; i < Array.length; i++) {
			if (Array[i] % MOD == HIGH) {
				System.out.println(Array[i]);
			}
		}
	}

}
