package com.techlab.college;

import java.util.List;

public class Department {

	private int deptId;
	private String deptName;
	private final List<Student> students;

	public Department(int deptId, String deptName, List<Student> students) {
		this.deptId = deptId;
		this.deptName = deptName;
		this.students = students;
	}

	public List<Student> getStudents() {
		return students;
	}

	public int getDeptId() {
		return deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Department Id:: ").append(this.deptId).append("\n");
		sb.append("Department Name:: ").append(this.deptName).append("\n");
		sb.append("Students of Department Are:: \n").append("\n");
		for (Student student : students) {
			sb.append(student.toString()).append("\n");
		}
		return sb.toString();
	}

}
