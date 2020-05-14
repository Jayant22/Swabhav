package com.techlab.account.test;

import com.techlab.account.Account;

public class AccountTest {

	public static void main(String[] args) {
		
		Account a = new Account("Jayant", 10000);
		
		Account a1 = new Account("Techlab");
		
		System.out.println("Account A :");
		printpersonInfo(a);
		
		System.out.println();
		
		System.out.println("Account A1 :");
		printpersonInfo(a1);
		
	}

	private static void printpersonInfo(Account acc) {

		System.out.println("name: " + acc.getName());
		System.out.println("balance: " + acc.getBalance());
		System.out.println("accountNumber: " + acc.getAccountNumber());
		acc.deposit(1000);
		System.out.println("New Balance: " + acc.getBalance());
		acc.withdraw(1500);
		System.out.println("Amount Withdrawn. Balance left: " + acc.getBalance());
	}
	
	public void printwithdrawLimit() {
		
		System.out.println("Your Account Does not Have Suffient Balance");
	}

}
