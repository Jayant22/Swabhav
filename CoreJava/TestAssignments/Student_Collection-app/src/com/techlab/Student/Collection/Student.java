package com.techlab.Student.Collection;

public class Student {
	
	private String Name;
	private int Roll_no;
	
	public Student(String name, int roll_no) {
		super();
		Name = name;
		Roll_no = roll_no;
	}

	public String getName() {
		return Name;
	}

	public int getRoll_no() {
		return Roll_no;
	}

	public void setName(String name) {
		Name = name;
	}

	public void setRoll_no(int roll_no) {
		Roll_no = roll_no;
	}
	
	
}
