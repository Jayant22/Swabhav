package com.techlab.college;

public class Student extends Person {

	private String branch;
	
	public Student(String id, String address, String dateOfBirth, String branch) throws Exception {
		super(id, address, dateOfBirth);
		this.branch = branch;
	}
	
	public String getBranch() {
		return branch;
	}

}
