package com.techlab.contact.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import com.techlab.contact.*;

class ContactManagerTest {

	@Test
	void testContactConstructor() {

		// Arrange
		String expectedFirstName = "Jay";
		String expectedLastName = "jones";
		long expectedPhoneNo = 1234567890;
		String expectedEmailID = "jay@gmail.com";

		// Act
		Contact c = new Contact(expectedFirstName, expectedLastName, expectedPhoneNo, expectedEmailID);

		// Assert
		assertEquals(expectedFirstName, c.getFirstName());
		assertEquals(expectedLastName, c.getLastName());
		assertEquals(expectedPhoneNo, c.getPhoneNo());
		assertEquals(expectedEmailID, c.getEmailId());
	}

	@Test
	void testContactManagerConstructor() {

		// Arrange
		String expectedFirstName = "Jay";
		String expectedLastName = "jones";
		long expectedPhoneNo = 1234567890;
		String expectedEmailID = "jay@gmail.com";

		// Act
		Contact c = new Contact(expectedFirstName, expectedLastName, expectedPhoneNo, expectedEmailID);

		// Assert
		assertEquals(expectedFirstName, c.getFirstName());
		assertEquals(expectedLastName, c.getLastName());
		assertEquals(expectedPhoneNo, c.getPhoneNo());
		assertEquals(expectedEmailID, c.getEmailId());
	}

	@Test
	void testAddToContacts() throws Exception {

		// Arrange
		String expectedFirstName = "Jay";
		String expectedLastName = "jones";
		long expectedPhoneNo = 1234567890;
		String expectedEmailID = "jay@gmail.com";
		// Act
		ContactManager contact = new ContactManager();
		ArrayList<ContactManager> list = new ArrayList<ContactManager>();
		list.add(new ContactManager(expectedFirstName, expectedLastName, expectedPhoneNo, expectedEmailID));
		contact.addToContacts(list);

		ArrayList<ContactManager> contactManager = ContactManager.displayContactList();

		// Assert
		for (ContactManager con : contactManager) {
			assertEquals(expectedFirstName, con.getFirstName());
			assertEquals(expectedLastName, con.getLastName());
			assertEquals(expectedPhoneNo, con.getPhoneNo());
			assertEquals(expectedEmailID, con.getEmailId());

		}
	}

	@Test
	void testmodifyContact() throws Exception {
		// Arrange
		String expectedFirstName = "Jay";
		String expectedLastName = "jones";
		long expectedPhoneNo = 1234567890;
		String expectedEmailID = "jay@gmail.com";
		// Act
		ContactManager contact = new ContactManager();
		ArrayList<ContactManager> list = new ArrayList<ContactManager>();
		list.add(new ContactManager("abc", expectedLastName, expectedPhoneNo, expectedEmailID));
		
		contact.addToContacts(list);
		contact.modifyContactByName("abc", "Jay");

		ArrayList<ContactManager> contactManager = ContactManager.displayContactList();

		// Assert
		for (ContactManager con : contactManager) {
			assertEquals(expectedFirstName, con.getFirstName());
			assertEquals(expectedLastName, con.getLastName());
			assertEquals(expectedPhoneNo, con.getPhoneNo());
			assertEquals(expectedEmailID, con.getEmailId());

		}
	}

	@Test
	void testDeleteContact() throws Exception {

		// Arrange
		String expectedFirstName = "Jay";
		String expectedLastName = "jones";
		long expectedPhoneNo = 1234567890;
		String expectedEmailID = "jay@gmail.com";
		// Act
		ContactManager contact = new ContactManager();
		ArrayList<ContactManager> list = new ArrayList<ContactManager>();
		list.add(new ContactManager(expectedFirstName, expectedLastName, expectedPhoneNo, expectedEmailID));
		list.add(new ContactManager("abc", "pqr", 987654321, "abc@gmail.com"));

		contact.addToContacts(list);
		contact.deleteContactByName("abc");

		ArrayList<ContactManager> contactManager = ContactManager.displayContactList();

		// Assert
		for (ContactManager con : contactManager) {
			assertEquals(expectedFirstName, con.getFirstName());
			assertEquals(expectedLastName, con.getLastName());
			assertEquals(expectedPhoneNo, con.getPhoneNo());
			assertEquals(expectedEmailID, con.getEmailId());

		}
	}

	@Test
	void testSearchContact() throws Exception {

		// Arrange
		String expectedFirstName = "Jay";
		String expectedLastName = "jones";
		long expectedPhoneNo = 1234567890;
		String expectedEmailID = "jay@gmail.com";
		// Act
		ContactManager contact = new ContactManager();
		ArrayList<ContactManager> list = new ArrayList<ContactManager>();
		list.add(new ContactManager(expectedFirstName, expectedLastName, expectedPhoneNo, expectedEmailID));
		list.add(new ContactManager("abc", "pqr", 987654321, "abc@gmail.com"));

		contact.addToContacts(list);
		ArrayList<ContactManager> contactManager = contact.searchContactByName("Jay");

		// Assert
		for (ContactManager con : contactManager) {
			assertEquals(expectedFirstName, con.getFirstName());
			assertEquals(expectedLastName, con.getLastName());
			assertEquals(expectedPhoneNo, con.getPhoneNo());
			assertEquals(expectedEmailID, con.getEmailId());

		}

	}
}
