package com.techlab.Observer.test;

import com.techlab.Observer.Account;
import com.techlab.Observer.EmailListner;
import com.techlab.Observer.SmsListner;

public class Test {
	
	public static void main(String[] args) throws Exception {
		
		Account account = new Account(100, "Jayant", 10000);
		
		new SmsListner(account);
		new EmailListner(account);
		
		System.out.println("Amount Deposited::");
		account.deposit(1000);
		
		System.out.println("Amount Withdrawed::");
		account.withdraw(1000);
		
	}

}
