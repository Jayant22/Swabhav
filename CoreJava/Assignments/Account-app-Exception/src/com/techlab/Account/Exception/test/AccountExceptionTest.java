package com.techlab.Account.Exception.test;

import com.techlab.Account.Exception.AccountException;
import com.techlab.Account.Exception.InsufficientBalance;


public class AccountExceptionTest {

public static void main(String[] args) throws Exception {
		
	AccountException a = new AccountException("Jayant", 10000);
		
	AccountException a1 = new AccountException("Techlab");
		
		System.out.println("Account A :");
		printpersonInfo(a);
		
		System.out.println();
		
		System.out.println("Account A1 :");
		printpersonInfo(a1);
		
	}


	public static void printpersonInfo(AccountException acc) throws Exception {

		System.out.println("name: " + acc.getName());
		System.out.println("balance: " + acc.getBalance());
		System.out.println("accountNumber: " + acc.getAccountNumber());
		acc.deposit(1000);
		System.out.println("New Balance: " + acc.getBalance());
		try {
	    	acc.withdraw(1500);
		    System.out.println("Amount Withdrawn. Balance left: " + acc.getBalance());
		}catch(InsufficientBalance e) {
			System.out.println(e.getMessage());
		}
	}
}
