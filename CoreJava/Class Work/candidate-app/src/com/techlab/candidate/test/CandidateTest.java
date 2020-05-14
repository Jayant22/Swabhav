package com.techlab.candidate.test;

import com.techlab.candidate.Candidate;

public class CandidateTest {
	
	public static void main(String[] args) {
		
		Candidate c = new Candidate(1,"ABC",23,"A");
		/*
		c.setId(1);
		c.setName("ABC");
		c.setAge(23);
		c.setCreditPoint("1010");
		*/
		Candidate c1 = new Candidate(2,"XYZ",25,"B");
		/*
		c1.setId(2);
		c1.setName("XYZ");
		c1.setAge(25);
		c1.setCreditPoint("1011");
		*/
		c.Candidates(c);
		
		c.whoIsElder(c1);
		
		c.whoIsBetter(c1);
	}

	public void printInfo(Candidate c) {
		
		System.out.println("Id ::" + c.getId());
		System.out.println("Name ::" + c.getName());
		System.out.println("Age ::" + c.getAge());
		System.out.println("CreditPoint ::" + c.getCreditPoint());
		
	}
}
