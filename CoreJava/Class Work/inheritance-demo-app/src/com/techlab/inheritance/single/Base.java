package com.techlab.inheritance.single;

public class Base {

	int foo;

	public Base(int foo) {
		foo++;
		System.out.println("inside parent class " + foo);
	}
}
