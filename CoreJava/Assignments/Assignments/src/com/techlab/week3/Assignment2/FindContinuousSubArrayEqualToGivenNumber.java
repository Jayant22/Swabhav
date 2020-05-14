package com.techlab.week3.Assignment2;

import java.util.Arrays;

public class FindContinuousSubArrayEqualToGivenNumber {

	public static void main(String args[]) {
		
		findSubArray(new int[]{42, 15, 12, 8, 6, 32}, 26);
		findSubArray(new int[]{12, 5, 31, 13, 21, 8}, 49);
		
	}

	static void findSubArray(int[] inputArray, int inputNumber) {
		int sum = 0;
		for (int i = 0; i < inputArray.length; i++) {
			sum = inputArray[i];
			for (int j = i + 1; j < inputArray.length; j++) {
				sum = sum + inputArray[j];
				if (sum == inputNumber) {
					System.out.println("Continuous sub array of " + Arrays.toString(inputArray) + " whose sum is " + inputNumber + " is ");
					for (int k = i; k <= j; k++) {
						System.out.print(inputArray[k] + " ");
					}
					System.out.println();
				}
				else if (sum < inputNumber) {
					continue;
				}
				else if (sum > inputNumber) {
					break;
				}
			}
		}
	}
}
