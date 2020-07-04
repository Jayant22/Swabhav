package com.techlab.Shopping.test;

import java.util.*;

import com.techlab.Shopping.Customer;
import com.techlab.Shopping.SerializableCustomer;

public class ShoppingMenuTest {

	static ArrayList<Customer> customerlist = new ArrayList<Customer>();

	Customer customer = new Customer();

	static SerializableCustomer Serialize = new SerializableCustomer();

	public static void main(String[] args) throws Exception {

		boolean exitMain = false;
		final int ADD_NEW_CUSTOMER = 1, EXISITING_CUSTOMER = 2, GET_CUSTOMERS = 3, EXIT_MAIN = 4;

		Scanner scan = new Scanner(System.in);

		do {
			System.out.println("Enter ur choice");
			System.out.println("1. Create new Customer." + "\n2. Existing Custome.r" +"\n3. Print customer details." + "\n3. Exit");

			int mainChoice = scan.nextInt();

			switch (mainChoice) {

			case ADD_NEW_CUSTOMER:
				System.out.println("Enter Customer Details");
				Customer customerDetails = addCustomerDetails();

				AddNewCustomer(customerDetails);
				break;

			case EXISITING_CUSTOMER:

				System.out.println("Enter Customer ID");
				Customer customerDetails1 = addCustomerDetails();

				ExistingCustomer(customerDetails1);
				break;

			case GET_CUSTOMERS:
				DisplayCustomer();

				break;

			case EXIT_MAIN:
				exitMain = true;
				break;

			default:
				System.out.println("Enter valid choice");
			}
		} while (!exitMain);
	}

	private static void menuForProducts(Customer customer) {
		// TODO Auto-generated method stub

	}

	private static void AddNewCustomer(Customer customerDetails) throws Exception {

		menuForProducts(customerDetails);
		customerlist.add(customerDetails);
		Serialize.serializeCustomer(customerlist);

	}
	
	private static void ExistingCustomer(Customer customerDetails) throws Exception {

	
		boolean Found = false;
		customerlist = Serialize.deserializeCustomer();

		for (Customer customer : customerlist) {
			if(customer.getID() == customerDetails.getID()) {
				Found = true;
			}
		}
		if (Found) {
			System.out.println("Customer Found!!");
			menuForProducts(customerDetails);
		}
		else {
			System.out.println("Customer Not Found!!");
			AddNewCustomer(customerDetails);
		}
	}

	private static void DisplayCustomer() throws Exception {
		
		customerlist = Serialize.deserializeCustomer();

		for (Customer customerDetails2 : customerlist) {
			System.out.println(customerDetails2);
		}
	}

	private static Customer addCustomerDetails() {

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter Customer Id: ");
		int customerId = scan.nextInt();

		System.out.print("Enter Customer Name: ");
		String customerName = scan.next();

		System.out.print("Enter Customer Address: ");
		String customerAddress = scan.next();

		Customer customer = new Customer(customerId, customerName, customerAddress);

		return customer;

	}

}
