package com.techlab.Account;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AccountTest {

	@Test
	void testAccountConstructor() {
		// Arrange
		double balance = 10000;
		String name = "Jayant";
		//Act
		Account a = new Account("Jayant", 10000);
		//Assert
		System.out.println("For Constructor");
		assertEquals(name, a.getName());
		assertEquals(balance, a.getBalance());
	}
	
	@Test
	void testAccountBalanceWithDeposit() {
		double balance = 11000;
		//Act
		Account a = new Account("Jayant", 10000);
		a.deposit(1000);
		//Assert
		System.out.println("For Deposit");
		assertEquals(balance, a.getBalance());
	}
	
	@Test
	void testAccountBalanceWithWithdraw() {
		double balance = 9000;
		//Act
		Account a = new Account("Jayant", 10000);
		a.withdraw(1000);
		//Assert
		System.out.println("For Withdraw");
		assertEquals(balance, a.getBalance());
	}
	
}
