package com.techlab.Violation.test;

import com.techlab.Violation.LogType;
import com.techlab.Violation.TaxCalculation;

public class AccountTest {

	public static void main(String[] args) {
	
		TaxCalculation Tax = new TaxCalculation(LogType.XML);
		
		System.out.println("Output Without Exception::" + Tax.calculation(10, 5));
		System.out.println("Output With Exception::" + Tax.calculation(0, 0));
	}
}
