package com.techlab.contact;

import java.io.Serializable;

public class Contact implements Serializable {

	private static final long serialVersionUID = 1L;
	private String firstName;
	private String lastName;
	private long phoneNo;
	private String emailId;
		
	public Contact(String firstName, String lastName, long phoneNo, String emailId) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNo = phoneNo;
		this.emailId = emailId;
	}

	public Contact() {
	}

	public void setFirstName(String newName) {
		this.firstName = newName;
	}
	
	public String getFirstName() {
		return firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public long getPhoneNo() {
		return phoneNo;
	}


	public String getEmailId() {
		return emailId;
	}

}
