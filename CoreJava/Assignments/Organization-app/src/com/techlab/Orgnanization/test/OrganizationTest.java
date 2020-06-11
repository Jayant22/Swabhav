package com.techlab.Orgnanization.test;

import java.util.ArrayList;

import com.techlab.Orgnanization.*;;

public class OrganizationTest {

	public static void main(String[] args) throws Exception {

		ArrayList<Partner> partner = new ArrayList<Partner>();
		
		Talent Talent1 = new Talent(101, "Jay", 7.54, "AurionPro");
		Talent Talent2 = new Talent(102, "Sai", 8.02, "Nexsales");
		Talent Talent3 = new Talent(103, "Ram", 7.23, "AurionPro");
		Talent Talent4 = new Talent(104, "Tom", 8.44, "Swabhav");
		Talent Talent5 = new Talent(105, "abc", 7.02, "Nexsales");
		
		Partner Partner1 = new Partner(1501, "AurionPro", 1000000.32, 120);
		Partner Partner2 = new Partner(1502, "Nexsales", 1200000.32, 150);
		
		Partner1.addTalent(Talent1);
		Partner1.addTalent(Talent3);
		
		Partner2.addTalent(Talent2);
		Partner2.addTalent(Talent5);
		
		partner.add(Partner1);
		partner.add(Partner2);
		
		Organization organization = new Organization(2011, "Swabhav", "01/07/2019", partner);
		organization.addTalent(Talent4);
		
		printOrganizationDetails(organization);
	
	}

	public static void printOrganizationDetails(Organization organization) {
		System.out.println(organization);
	}
	
}