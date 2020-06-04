package com.techlab.Account.Exception;

public class AccountException {

	private double balance;
	private String name, accountNumber;
	private static final double MINIMUM_BALANCE = 500;

	public AccountException(String name, double amount) {
		this.name = name;
		this.balance = amount;
		this.accountNumber = setAccountNumber();
	}

	public AccountException(String name) {
		this(name, MINIMUM_BALANCE);
	}

	public String getName() {
		return this.name;
	}

	public double getBalance() {
		return this.balance;
	}

	public String getAccountNumber() {
		return this.accountNumber;
	}

	private String setAccountNumber() {

		String alphaNum = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
		StringBuilder str = new StringBuilder(10);

		for (int i = 0; i < 10; i++) {
			int index = (int) (Math.random() * alphaNum.length());
			str.append(alphaNum.charAt(index));
		}
		return str.toString();
	}

	public void deposit(double amount) {
		balance = balance + amount;
	}

	public void withdraw(double amount) throws Exception {
		
		if ((balance - amount) > 500) {
			balance = balance - amount;
		} else
			throw new InsufficientBalance();
	}
}
