package com.techlab.week3.Assignment2;

import java.util.Arrays;

public class SegregateZerosAndNonZeros {

	public static void main(String[] args) {

		separateZeroAndNonZero(new int[]{1, -5, 0, 0, 8, 0, 1});
		separateZeroAndNonZero(new int[]{12, 0, 7, 0, 8, 0, 3});

		
	}
	static void separateZeroAndNonZero(int[] myArray) {
		
		System.out.println("The array created is: " + Arrays.toString(myArray));
		int pos = 0;
		for (int i = 0; i < myArray.length; i++) {
			if (myArray[i] != 0) {
				myArray[pos] = myArray[i];
				pos++;
			}
		}
		while (pos < myArray.length) {
			myArray[pos] = 0;
			pos++;
		}
		System.out.println("Resultant array: " + Arrays.toString(myArray));
		
	}
}
