package com.techlab.week3.Assignment2;

public class FindMissingNumberInArray {

	public static void main(String args[]) {
		int a[] = { 1, 4, 5, 3, 2, 8, 6 };
		int miss = getMissingNo(a, a.length);
		System.out.println("Missind Number From Array is:: " + miss);
	}

	static int getMissingNo(int a[], int n) {
		int i, total;
		total = (n + 1) * (n + 2) / 2;
		for (i = 0; i < n; i++)
			total -= a[i];
		return total;
	}
}
