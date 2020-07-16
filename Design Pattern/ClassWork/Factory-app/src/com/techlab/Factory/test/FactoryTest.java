package com.techlab.Factory.test;

import com.techlab.Factory.*;

public class FactoryTest {

	public static void main(String[] args) {
		AutoMobileFactory factory = AutoMobileFactory.getInstace();
		
		IAutoMobile audi = factory.getAutoMobile(AutoType.AUDI);
		System.out.println("AUDI 1: " + audi.hashCode());
		audi.start();
		audi.stop();
		
		IAutoMobile tesla = factory.getAutoMobile(AutoType.TESLA);
		System.out.println(tesla.hashCode());
		tesla.start();
		tesla.stop();
		
		IAutoMobile bmw = factory.getAutoMobile(AutoType.BMW);
		System.out.println(bmw.hashCode());
		bmw.start();
		bmw.stop();
		
		IAutoMobile audi1 = factory.getAutoMobile(AutoType.AUDI);
		System.out.println("AUDI 2: " + audi1.hashCode());
		audi.start();
		audi.stop();
		
	}

}
