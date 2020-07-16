package com.techlab.Observer;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Account {

	private int Account_No;
	private String Account_Name;
	private double balance;
	private String creationDate;
	private boolean withdrawed = false;
	private boolean deposited = false;

	public double amount;
	private ArrayList<Listner> listners = new ArrayList<Listner>();

	public Account(int account_No, String account_Name, double balance) throws Exception {
		super();
		this.Account_No = account_No;
		this.Account_Name = account_Name;
		this.balance = balance;
		this.creationDate = setDate();
	}

	private String setDate() throws Exception {
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
	    Date date = new Date();
		return formatter.format(date);
	}

	public int getAccount_No() {
		return Account_No;
	}

	public String getAccount_Name() {
		return Account_Name;
	}

	public double getBalance() {
		return balance;
	}

	public String  getCreationDate() {
		return creationDate;
	}

	public ArrayList<Listner> getListners() {
		return listners;
	}

	public boolean isWithdrawed() {
		return withdrawed;
	}

	public boolean isDeposited() {
		return deposited;
	}

	public void setDeposited(boolean deposited) {
		this.deposited = deposited;
	}

	public void setWithdrawed(boolean withdrawed) {
		this.withdrawed = withdrawed;
	}

	public void deposit(double amount) {
		this.amount = amount;
		balance = balance + amount;
		deposited = true;
		notifyAllObservers();
		deposited = false;
	}

	public void withdraw(double amount) {

		if ((balance - amount) > 500) {
			this.amount = amount;
			balance = balance - amount;
			withdrawed = true;
			notifyAllObservers();
			withdrawed = false;
		}
	}

	public void attach(Listner listner) {
		listners.add(listner);
	}

	public void notifyAllObservers() {
		for (Listner listner : listners) {
			listner.update();
		}
	}
}
