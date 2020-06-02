package com.techlab.inheritance.multilevel;

public class Child extends Parent {

	public Child(int foo) {
		super(foo);
		System.out.println("inside child " + foo);
	}

}
