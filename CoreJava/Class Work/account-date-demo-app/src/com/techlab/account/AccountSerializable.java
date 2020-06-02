package com.techlab.account;

import java.text.SimpleDateFormat;
import java.util.Date;

public class AccountSerializable {

	private String accName;
	private String accNumber;
	private double balance;
	private Date creationDate, dateOfBirth;
	private static String ID;
	private static int num = 1001;

	static {
		ID = "SBI";
	}

	public AccountSerializable(String accName, double balance, String creationDate, String dateOfBirth) throws Exception {

		this.accNumber = setAccountNumber();
		this.accName = accName;
		this.balance = balance;
		this.creationDate = setDate(creationDate);
		this.dateOfBirth = setDate(dateOfBirth);
	}

	private String setAccountNumber() {
		String accNum = ID + Integer.toString(num++);
		return accNum;
	}

	private Date setDate(String aDate) throws Exception {
		SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
		Date date = sd.parse(aDate);
		return date;
	}

	public double getBalance() {
		return balance;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public String getName() {
		return accName;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public String getAccountNumber() {
		return accNumber;
	}
}
