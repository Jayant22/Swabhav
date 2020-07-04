package com.techlab.Violation.test;

import com.techlab.Violation.*;

public class Test {

	public static boolean S_N_C_W_I_H_C(Rectangle obj) {

		int before = obj.getBreadth();
		obj.setLength(obj.getLength() + 10);
		int after = obj.getBreadth();
		if (after == before)
			return true;

		return false;

	}

	public static void main(String[] args) {

		Rectangle rect = new Rectangle();
		rect.setLength(20);
		rect.setBreadth(10);

		Square sqr = new Square();
		sqr.setLength(10);
		sqr.setBreadth(10);

		System.out.println(Test.S_N_C_W_I_H_C(rect));
		System.out.println(Test.S_N_C_W_I_H_C(sqr));
	}
}
