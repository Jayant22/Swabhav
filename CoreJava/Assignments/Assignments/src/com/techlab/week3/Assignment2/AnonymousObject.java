package com.techlab.week3.Assignment2;

public class AnonymousObject {

	public String anonymousClass() {
		return "This is Anonymous Object";
	}

	public static void main(String[] args) {
		System.out.println(new AnonymousObject().anonymousClass());
	}
}
