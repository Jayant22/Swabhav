package com.techlab.Singleton.test;

import com.techlab.Singleton.DataService;

public class SingletonTest {

	public static void main(String[] args) {

		DataService s1 = DataService.getInstance();
		DataService s2 = DataService.getInstance();
		
		System.out.println("s1:" + s1.hashCode() + "\n");
		System.out.println("s2:" + s2.hashCode() + "\n");
		
		s1.processData();
		s2.processData();
	}

}
