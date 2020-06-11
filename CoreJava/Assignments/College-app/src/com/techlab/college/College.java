package com.techlab.college;

import java.util.List;

public class College {
	private int collegeID;
	private String collegeName;
	private final List<Department> departments;

	public College(int collegeID, String collegeName, List<Department> departments) {
		super();
		this.collegeID = collegeID;
		this.collegeName = collegeName;
		this.departments = departments;
	}

	public List<Department> getDepartments() {
		return departments;
	}

	public int getCollegeID() {
		return collegeID;
	}

	public String getCollegeName() {
		return collegeName;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("College Id:: ").append(this.collegeID).append("\n");
		sb.append("College Name:: ").append(this.collegeName).append("\n");
		sb.append("Departments Are::\n").append("\n");
		for (Department department : departments) {
			sb.append(department.toString()).append("\n");
		}
		return sb.toString();
	}

}
