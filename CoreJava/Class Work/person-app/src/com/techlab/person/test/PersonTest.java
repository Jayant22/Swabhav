package com.techlab.person.test;

import com.techlab.person.Person;

public class PersonTest {
	
    static final float UNDER_WEIGHT = 18.5F, OVER_WEIGHT = 24.9F; 

	public static void main(String[] args) {
		
		Person p = new Person("abc",-26,"M",2.34f,100f);
		
		Person p1 = new Person("","F",2.5f,200f);
		
		p.doWorkOut();
		p.doEat();
		p.calulateBMI();
		
		p1.doWorkOut();
		p1.doEat();
		p1.calulateBMI();
		
		System.out.println("Peron P :");
		printpersonInfo(p);
		System.out.println("Peron P1 :");
		printpersonInfo(p1);
		
		

	}

	private static void printpersonInfo(Person p) {
		
		System.out.println(p.getName());
		System.out.println(p.getAge());
		System.out.println(p.getGender());
		System.out.println(p.getHeight());
		System.out.println(p.getWeight());
		
		if(p.getBMI() < UNDER_WEIGHT)
			System.out.println("Under Weight: " + p.getBMI());
		else if(p.getBMI() > UNDER_WEIGHT && p.getBMI() < OVER_WEIGHT)
			System.out.println("Noraml Weight: " + p.getBMI());
		else
			System.out.println("Over Weight: " + p.getBMI());
	}
	
	

}
