package com.techlab.inheritance.single;

public class Child extends Base {
	
	public int foo1;

	public Child(int foo) {
		
		super(foo);
		System.out.println("hi inside child " + foo1);
	}
}
