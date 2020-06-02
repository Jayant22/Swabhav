package com.techlab.college;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Person {

	private String id, address;
	private Date dateOfBirth;

	public Person(String id, String address, String dateOfBirth) throws Exception {
		this.id = id;
		this.address = address;
		this.dateOfBirth = setDate(dateOfBirth);
	}

	private Date setDate(String date) throws Exception {

		SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
		Date d = sd.parse(date);

		return d;
	}

	public String getId() {
		return id;
	}

	public String getAddress() {
		return address;
	}

	public Date getDate() {
		return dateOfBirth;
	}

}
