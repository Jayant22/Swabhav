package com.techlab.week3.Assignment2;

import java.util.Arrays;

public class IntegerArraySumEqualToGivenNumber {

	public static void main(String args[]) {
		int[] numbers = { 4, 6, 5, -10, 8, 5, 20 };
		int sum = 10;
		
		System.out.println("Given array : " + Arrays.toString(numbers));
		System.out.println("Given sum : " + sum);
		System.out.println("Integer numbers, whose sum is equal to value : " + sum);
		printPairs(numbers, sum);

	}

	public static void printPairs(int[] array, int sum) {
		for (int i = 0; i < array.length; i++) {
			int first = array[i];
			for (int j = i + 1; j < array.length; j++) {
				int second = array[j];
				if ((first + second) == sum) {
					System.out.println(first + second);
				}
			}
		}
	}

}
