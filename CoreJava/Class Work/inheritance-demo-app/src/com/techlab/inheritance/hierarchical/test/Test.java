package com.techlab.inheritance.hierarchical.test;

import com.techlab.inheritance.hierarchical.*;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Man m = new Man();
		m.plays();
		m.reads();
		System.out.println();
		
		Boy b = new Boy();
		b.plays();
		b.eats();
		b.reads();
		System.out.println();

		Kid k = new Kid();
		k.plays();
		k.reads();
		System.out.println();

		Infant i = new Infant();
		i.plays();
		i.reads();
		System.out.println();
		
		case1();
		System.out.println();
		
		case2();
		System.out.println();
		
		case3();
		System.out.println();
		
		case4();
		System.out.println();
		
		case5();
		System.out.println();
	}

	public static void case1() {
		Man x;
		x = new Man();
		x.plays();
		x.reads();
		
	}
	
	public static void case2() {
		Boy y;
		y = new Boy();
		y.plays();
		y.eats();
		y.reads();
	}
	
	public static void case3() {
		Man x;
		x = new Boy();
		x.plays();
		x.reads();
	}
	
	public static void atThePark(Man b) {
		System.out.println("At the park");
		b.plays();
		System.out.println();
	}
	
	public static void case4() {
		atThePark(new Man());
		atThePark(new Boy());
		atThePark(new Kid());
		atThePark(new Infant());
	}
	
	public static void case5() {
		Object x;
		x = 10;
		System.out.println(x.getClass());
		x = "Hello";
		System.out.println(x.getClass());
		x = new Man();
	}
	
}
