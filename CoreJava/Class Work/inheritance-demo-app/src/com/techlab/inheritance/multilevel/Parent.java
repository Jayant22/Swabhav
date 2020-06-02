package com.techlab.inheritance.multilevel;

public class Parent extends GrandParent {

	public Parent(int foo) {
		super(foo);
		System.out.println("inside parent " + foo);
	}

}
