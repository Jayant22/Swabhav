package com.techlab.college;

import java.text.SimpleDateFormat;
import java.util.*;

public class Student {

	private int studId;
	private String studName;
	private Date dateOfBirth;
	private String address;

	public Student(int studId, String studName, String dateOfBirth, String address) throws Exception {
		super();
		this.studId = studId;
		this.studName = studName;
		this.dateOfBirth = setDateOfBirth(dateOfBirth);
		this.address = address;
	}

	public int getStudId() {
		return studId;
	}

	public String getStudName() {
		return studName;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public String getAddress() {
		return address;
	}

	public Date setDateOfBirth(String dateOfBirth) throws Exception {
		SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyyy");
		Date date = s.parse(dateOfBirth);
		return date;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Student Id:: ").append(this.studId).append("\n");
		sb.append("Student Name:: ").append(this.studName).append("\n");
		sb.append("Student DOB:: ").append(this.dateOfBirth).append("\n");
		sb.append("Student Address:: ").append(this.address);
		return sb.toString();
	}

}
