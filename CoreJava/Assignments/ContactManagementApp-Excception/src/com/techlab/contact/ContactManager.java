package com.techlab.contact;

import java.io.*;
import java.util.ArrayList;

public class ContactManager extends Contact {

	private static final long serialVersionUID = 1L;
	private static final String FILENAME = "src/resource/FileIoOperation.txt";

	public ContactManager() {
		super();
	}

	public ContactManager(String firstName, String lastName, long phoneNo, String emailId) {
		super(firstName, lastName, phoneNo, emailId);
	}

	public void addToContacts(ArrayList<ContactManager> am) throws Exception {

		FileOutputStream file = new FileOutputStream(FILENAME);
		ObjectOutputStream out = new ObjectOutputStream(file);

		out.writeObject(am);

		out.flush();
		out.close();
	}

	public void modifyContactByName(String modifyName, String newName) throws Exception {

		ObjectInputStream in = deserializeContactsList();

		ArrayList<ContactManager> contactList = displayContactList();

		int contactPosition = findContact(contactList, modifyName);

		if (contactPosition != -1) {
			contactList.get(contactPosition).setFirstName(newName);
			addToContacts(contactList);
		}
		else {
			throw new ContactNotFoundException();
		}

		in.close();

	}

	public ArrayList<ContactManager> searchContactByName(String searchContact) throws Exception {

		ObjectInputStream in = deserializeContactsList();

		ArrayList<ContactManager> contactList = displayContactList();
		ArrayList<ContactManager> dummyList = new ArrayList<ContactManager>();

		int contactPosition = findContact(contactList, searchContact);

		if (contactPosition != -1) {
			dummyList.add(contactList.get(contactPosition));
		}
		else {
			throw new ContactNotFoundException();
		}

		in.close();

		return dummyList;
	}

	public void deleteContactByName(String deleteContact) throws Exception {

		ObjectInputStream in = deserializeContactsList();

		ArrayList<ContactManager> contactList = displayContactList();

		int contactPosition = findContact(contactList, deleteContact);

		if (contactPosition != -1) {
			contactList.remove(contactPosition);
			addToContacts(contactList);
		}
		else {
			throw new ContactNotFoundException();
		}

		in.close();

	}

	@SuppressWarnings("unchecked")
	public static ArrayList<ContactManager> displayContactList() throws Exception {

		ArrayList<ContactManager> contact;
		FileInputStream file = new FileInputStream(FILENAME);
		ObjectInputStream in = new ObjectInputStream(file);

		contact = (ArrayList<ContactManager>) in.readObject();

		in.close();

		if(contact.isEmpty())
			throw new ContactListIsEmpty();
		else
			return contact;
	}

	public ObjectInputStream deserializeContactsList() throws Exception {

		FileInputStream file = new FileInputStream(FILENAME);
		ObjectInputStream in = new ObjectInputStream(file);

		return in;
	}

	public static int findContact(ArrayList<ContactManager> contacts, String contactName) {

		int x = -1;
		for (int i = 0; i < contacts.size(); i++) {
			if (contacts.get(i).getFirstName().equals(contactName)) {
				x = i;
			}
		}
		return x;
	}

}
