package com.techlab.Solution.test;

import com.techlab.Solution.*;

public class AccountTest {

	public static void main(String[] args) {
	
		ILogable txtLog = new TxtLogger();
		ILogable XmlLog = new XmlLogger();
		
		TaxCalculation txtTax = new TaxCalculation(txtLog);
		TaxCalculation xmlTax = new TaxCalculation(XmlLog);
		
		
		System.out.println("Output Without Exception::" + txtTax.calculation(10, 5));
		System.out.println("Output With Exception::" + txtTax.calculation(0, 0));
		
		System.out.println("Output Without Exception::" + xmlTax.calculation(10, 5));
		System.out.println("Output With Exception::" + xmlTax.calculation(0, 0));
	}
}
