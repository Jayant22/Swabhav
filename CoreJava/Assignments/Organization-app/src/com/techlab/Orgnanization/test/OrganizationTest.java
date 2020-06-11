package com.techlab.Orgnanization.test;

import java.util.ArrayList;

import com.techlab.Orgnanization.*;;

public class OrganizationTest {

	public static void main(String[] args) throws Exception {

		ArrayList<Partner> partner = new ArrayList<Partner>();
		
		Talent t1 = new Talent(101, "sam", 7.54, "Nexsales");
		Talent t2 = new Talent(102, "ben", 8.02, "AurionPro");
		Talent t3 = new Talent(103, "ram", 7.23, "Nexsales");
		Talent t4 = new Talent(104, "tom", 8.44, "Swabhav");
		Talent t5 = new Talent(105, "jon", 7.02, "AurionPro");
		
		Partner p1 = new Partner(1501, "AurionPro", 1000000.32, 120);
		Partner p2 = new Partner(1502, "Nexsales", 1200000.32, 150);
		
		p1.addTalent(t2);
		p1.addTalent(t5);
		
		p2.addTalent(t1);
		p2.addTalent(t3);
		
		partner.add(p1);
		partner.add(p2);
		
		Organization o = new Organization(2011, "Swabhav", "01/07/2019", partner);
		o.addTalent(t4);
		
		printOrganizationDetails(o);
	
	}

	public static void printOrganizationDetails(Organization o) {
		System.out.println(o);
	}
	
}