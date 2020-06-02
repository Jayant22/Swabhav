package com.techlab.serializable.test;

import java.io.*;
import java.util.ArrayList;


import com.techlab.serializable.AccountSerializable;

public class AccountSerializableTest {

	static String filename = "Techlab.txt";

	public static void main(String[] args) throws Exception {

		//AccountSerializable[] accHolders = new AccountSerializable[4];
		
		ArrayList<AccountSerializable> accHolders = new ArrayList<AccountSerializable>();
		
		accHolders.add(new AccountSerializable("Jay", 50000, "2019-10-22", "2019-10-22","5"));
		accHolders.add(new AccountSerializable("Sub", 60000, "2018-10-22", "2019-10-22","7"));
		accHolders.add(new AccountSerializable("moon", 30000, "2017-10-22", "2019-10-22","6"));
		accHolders.add(new AccountSerializable("Sun", 20000, "2019-05-22", "2019-10-22","10"));

		System.out.println("Case 1::");
		System.out.println("Serialization ::");
		storingAccountHolderDetails(accHolders);
		System.out.println("Deserialization ::");
		retrivingAccountHolderDetails(accHolders);

		System.out.println("Case 2::");
		
		//accHolders[4] = new AccountSerializable("Jupiter", 80000, "2018-05-22", "2018-10-22");
		accHolders.add(new AccountSerializable("Jupiter", 80000, "2018-05-22", "2018-10-22","12"));

		
		System.out.println("Serialization ::");
		storingAccountHolderDetails(accHolders);
		System.out.println("Deserialization ::");
		retrivingAccountHolderDetails(accHolders);
		
	}

	public static void storingAccountHolderDetails(ArrayList<AccountSerializable> accHolders) {

		try {

			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);

			for (int i = 0; i < accHolders.size(); i++) {

				out.writeObject(accHolders.get(i));
				printdata(accHolders.get(i));

			}
			out.close();
			file.close();
		} catch (IOException ex) {
			System.out.println("IOException is caught");
		}
	}

	public static void retrivingAccountHolderDetails(ArrayList<AccountSerializable> accHolders) {

		try {

			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);

			for (int i = 0; i < accHolders.size(); i++) {

				accHolders.set(i, (AccountSerializable) in.readObject());
				printdata(accHolders.get(i));

			}

			in.close();
			file.close();
		}

		catch (IOException ex) {
			System.out.println("IOException is caught");
		}

		catch (ClassNotFoundException ex) {
			System.out.println("ClassNotFoundException" + " is caught");
		}
	}

	public static void printdata(AccountSerializable acc) {
		System.out.println("Name: " + acc.getName());
		System.out.println("Account Number: " + acc.getAccountNumber());
		System.out.println("Balance: " + acc.getBalance());
		System.out.println("Creation Date: " + acc.getCreationDate());
		System.out.println("Date of birth: " + acc.getDateOfBirth());
		System.out.println("No of Transactions: " + acc.getTransactions());
		System.out.println();

	}

}
