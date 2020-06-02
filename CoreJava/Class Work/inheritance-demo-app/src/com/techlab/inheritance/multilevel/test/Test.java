package com.techlab.inheritance.multilevel.test;

import com.techlab.inheritance.multilevel.*;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("GrandParent Object ::");
		GrandParent g = new GrandParent(10);
		System.out.println("Parent Object ::");
		Parent p = new Parent(20);
		System.out.println("Child Object ::");
		Child c = new Child(30);
		
	}

}
