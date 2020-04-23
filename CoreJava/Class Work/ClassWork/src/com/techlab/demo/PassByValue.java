package com.techlab.demo;

public class PassByValue {

	public static void main(String[] args) {
		int a = 10;
		mutableData(a); // 10,20??
		System.out.println(a);
		int[] a1 = { 10, 20, 30, 40 };
		for (int i = 0; i < a1.length; i++) {
			System.out.print(a1[i] + " ");
		}
		mutableArrayvalue(a1); // 10,20,30,40.............0 0 0 0??
		System.out.println();
		for (int i = 0; i < a1.length; i++) {
			System.out.print(a1[i] + " ");
		}
	}

	static void mutableData(int n) {
		n = 20;
	}

	static void mutableArrayvalue(int[] a) {

		for (int i = 0; i < a.length; i++) {
			a[i] = 0;
		}

	}

}
