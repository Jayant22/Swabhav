package com.techlab.Violation.test;

import com.techlab.Violation.FestivalType;
import com.techlab.Violation.FixedDeposit;

public class FixedDepositTest {
	
	public static void main(String[] args) {
		
		FixedDeposit deposit = new FixedDeposit(1,"ABC",1000,5,FestivalType.DIWALI);
		System.out.println(deposit);
	}
}
