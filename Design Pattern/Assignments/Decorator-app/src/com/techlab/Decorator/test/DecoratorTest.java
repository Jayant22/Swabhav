package com.techlab.Decorator.test;

import com.techlab.Decorator.*;

public class DecoratorTest {

	public static void main(String[] args) {

		IBikeService service = new ChainAlignment(new OilChange(new BasicBikeService()));

		System.out.println(service.getdescription());
		System.out.println("Total Cost: " + service.getCost());
	}
}
