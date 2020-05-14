package com.techlab.candidate;

import com.techlab.candidate.test.CandidateTest;

public class Candidate {

	private int id;
	private String name;
	private int age;
	private String creditPoint;

	CandidateTest print = new CandidateTest();
	private Candidate c;

	public Candidate(int id, String name, int age, String creditPoint) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.creditPoint = creditPoint;

	}

	public void Candidates(Candidate c) {
		this.c = c;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getCreditPoint() {
		return creditPoint;
	}/*
		 * public void setId(int id) { this.id = id; } public void setName(String name)
		 * { this.name = name; } public void setAge(int age) { this.age = age; } public
		 * void setCreditPoint(String creditPoint) { this.creditPoint = creditPoint; }
		 * 
		 * public void setter(Candidate c) { this.c1 = c; }
		 */

	public void whoIsElder(Candidate c1) {

		if (c.age < c1.age) {
			print.printInfo(c);
		} else
			print.printInfo(c1);
	}

	public void whoIsBetter(Candidate c1) {

		if (c.creditPoint.compareTo(c1.creditPoint) == 1 ) {
			print.printInfo(c);
		} else
			print.printInfo(c1);
	}

}
