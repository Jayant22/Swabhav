package com.techlab.serialization;

import java.io.Serializable;

public class Serializations implements Serializable {

	private static final long serialVersionUID = 1L;
	transient int a;
	private static int b;
	String name;
	int age;

	public Serializations(String name, int age, int a, int b) {
		this.name = name;
		this.age = age;
		this.a = a;
		Serializations.setB(b);
	}

	public static int getB() {
		return b;
	}

	public static void setB(int b) {
		Serializations.b = b;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public int getA() {
		return a;
	}
}