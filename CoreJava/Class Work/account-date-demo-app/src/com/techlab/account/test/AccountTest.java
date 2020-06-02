package com.techlab.account.test;

import java.util.Date;

import com.techlab.account.AccountSerializable;

public class AccountTest {

	public static void main(String[] args) throws Exception {

		AccountSerializable[] accHolders = new AccountSerializable[4];

		accHolders[0] = new AccountSerializable("Jay", 50000, "2019-10-22", "2019-10-22");
		accHolders[1] = new AccountSerializable("Sub", 60000, "2018-10-22", "2019-10-22");
		accHolders[2] = new AccountSerializable("moon", 30000, "2017-10-22", "2019-10-22");
		accHolders[3] = new AccountSerializable("Sun", 20000, "2019-05-22", "2019-10-22");

		AccountSerializable accRich = findRichAccountHolder(accHolders);
		AccountSerializable accYoung = findYoungAccountHolder(accHolders);

		System.out.println("Rich Account Holder");
		printInfo(accRich);
		System.out.println("Young Account Holder");
		printInfo(accYoung);
	}

	public static AccountSerializable findRichAccountHolder(AccountSerializable[] accHolders) {

		AccountSerializable acc = accHolders[0];
		double balance = acc.getBalance();

		for (int i = 1; i < accHolders.length - 1; i++) {
			if (balance < accHolders[i].getBalance()) {
				balance = accHolders[i].getBalance();
				acc = accHolders[i];
			}
		}

		return acc;

	}

	public static AccountSerializable findYoungAccountHolder(AccountSerializable[] accHolders) {

		AccountSerializable acc = accHolders[0];
		Date date = accHolders[0].getCreationDate();

		for (int i = 1; i < accHolders.length - 1; i++) {
			if (date.after(accHolders[i].getCreationDate())) {
				date = accHolders[i].getCreationDate();
				acc = accHolders[i];
			}
		}
		return acc;
	}

	public static void printInfo(AccountSerializable acc) {

		System.out.println("Name: " + acc.getName());
		System.out.println("Account Number: " + acc.getAccountNumber());
		System.out.println("Balance: " + acc.getBalance());
		System.out.println("Creation Date: " + acc.getCreationDate());
		System.out.println("Date of birth: " + acc.getDateOfBirth());
		System.out.println();
	}
}
