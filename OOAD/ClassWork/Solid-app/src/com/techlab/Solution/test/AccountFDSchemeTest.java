package com.techlab.Solution.test;

import com.techlab.Solution.*;

public class AccountFDSchemeTest {

	public static void main(String[] args) {
		
		IFestivalRate diwaliRate = new DiwaliRate();
		IFestivalRate holiRate = new HoliRate();
		
		FixedDeposit deposit = new FixedDeposit(1,"ABC",1000,5,diwaliRate);
		System.out.println(deposit);
		
		FixedDeposit deposit1 = new FixedDeposit(1,"ABC",1000,5,holiRate);
		System.out.println("\n" + deposit1);		
	}
}
