package com.techlab.contact.test;

import java.util.ArrayList;
import java.util.Scanner;

import com.techlab.contact.ContactManager;

public class ContactTest {

	static Scanner scan = new Scanner(System.in);
	static ContactManager contact = new ContactManager();
	static ArrayList<ContactManager> contactList = new ArrayList<ContactManager>();

	public static void main(String[] args) throws Exception {

		boolean exit = false;
		final int ADD_CONTACT = 1, MODIFY_CONTACT = 2, SEARCH_CONTACT = 3, DELETE_CONTACT = 4, DISPLAY_CONTACT = 5,
				EXIT = 6;

		do {
			System.out.println("Enter your choice");
			System.out.println("1. Add Contact." + "\n2. Modify Contact." + "\n3. Search Contact." + "\n4. Delete Contact." + "\n5. Display Contact" + "\n6. Exit");

			int choice = scan.nextInt();

			switch (choice) {

			case ADD_CONTACT:
				addContact();
				break;

			case MODIFY_CONTACT:
				modifyContact();
				break;

			case SEARCH_CONTACT:
				searchContact();
				break;

			case DELETE_CONTACT:
				deleteContact();
				break;

			case DISPLAY_CONTACT:
				displayContact();
				break;

			case EXIT:
				exit = true;
				break;

			default:
				System.out.println("Enter valid choice");
			}

		} while (!exit);

		System.out.println("Exiting.....");
	}

	public static void addContact() throws Exception {

		System.out.print("Enter first name: ");
		String firstName = scan.next();

		System.out.print("Enter last name: ");
		String lastName = scan.next();

		System.out.print("Enter phone no: ");
		Long phoneNo = scan.nextLong();

		System.out.print("Enter email id: ");
		String emailID = scan.next();

		ContactManager newContact = new ContactManager(firstName, lastName, phoneNo, emailID);
		contactList.add(newContact);

		contact.addToContacts(contactList);
		System.out.println("Contact Added!\n");
	}

	public static void modifyContact() throws Exception {
		System.out.print("Enter name which should be modified: ");
		String modifyName = scan.next();
		System.out.print("Enter new name: ");
		String newName = scan.next();
		contact.modifyContactByName(modifyName, newName);
	}

	public static void searchContact() throws Exception {
		System.out.print("Enter name to be searched: ");
		String searchContact = scan.next();
		contactList = contact.searchContactByName(searchContact);
		printContactInfo(contactList);
	}

	private static void deleteContact() throws Exception {
		System.out.print("Enter name to be deleted: ");
		String deleteContact = scan.next();
		contact.deleteContactByName(deleteContact);
	}
	
	public static void displayContact() {
		try {
			contactList = ContactManager.displayContactList();
			printContactInfo(contactList);
		} catch (Exception e) {
			System.out.println("Exception: " + e);
		}
	}

	public static void printContactInfo(ArrayList<ContactManager> am) {

		if (am.isEmpty()) {
			System.out.println("No Contacts Found");
		} else {
			for (ContactManager contact : am) {
				System.out.println("Contact Name: " + contact.getFirstName() + " " + contact.getLastName());
				System.out.println("Phone No: " + contact.getPhoneNo());
				System.out.println("Email Id: " + contact.getEmailId());
				System.out.println();
			}
		}
	}
}
