package com.techlab.college.test;

import com.techlab.college.*;

public class CollegeTest {

	public static void main(String[] args) throws Exception {

		Person p = new Person("CSE201", "28/3B, local centeral area", "2019-10-11");
		Student s = new Student("CSE301", "30/10A, local western area", "2010-05-22", "Computer");
		Professor pf = new Professor("CSE401", "55/16C, local eastern area", "2005-07-02", 1203.41);

		printPersonInfo(p);
		printStudentInfo(s);
		printProfessorInfo(pf);

	}

	public static void printPersonInfo(Person p) {

		System.out.println("Id: " + p.getId());
		System.out.println("Address: " + p.getAddress());
		System.out.println("Date Of Birth: " + p.getDate());
	}

	public static void printStudentInfo(Student s) {

		System.out.println();
		printPersonInfo(s);
		System.out.println("Branch: " + s.getBranch());
		System.out.println();

	}

	public static void printProfessorInfo(Professor pf) {

		printPersonInfo(pf);
		System.out.println("Salary: " + pf.getSalary());
		pf.calculateSalary(150);
		System.out.println("New Salary: " + pf.getSalary());
		System.out.println();

	}
}
