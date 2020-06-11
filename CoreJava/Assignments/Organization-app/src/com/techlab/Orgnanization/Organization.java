package com.techlab.Orgnanization;

import java.text.SimpleDateFormat;
import java.util.*;

public class Organization {

	private int orgID;
	private String orgname;
	private Date registrationDate;
	private ArrayList<Talent> talents = new ArrayList<Talent>();
	private ArrayList<Partner> partners;

	public Organization(int orgID, String name, String registrationDate, ArrayList<Partner> partner) throws Exception {

		this.orgID = orgID;
		this.orgname = name;
		this.registrationDate = setDate(registrationDate);
		this.partners = partner;
	}

	private Date setDate(String registrationDate) throws Exception {
		SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyyy");
		Date date = s.parse(registrationDate);

		return date;
	}

	public int getOrganizationID() {
		return orgID;
	}

	public String getOrganizationName() {
		return orgname;
	}

	public Date getRegistrationDate() {
		return registrationDate;
	}

	public void addTalent(Talent talent) {
		this.talents.add(talent);
	}

	public int getPartnerCount() {
		return partners.size();
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Organization Id:: ").append(this.orgID).append("\n");
		sb.append("Organization Name:: ").append(this.orgname).append("\n");
		sb.append("Organization Date:: ").append(this.registrationDate).append("\n");

		sb.append("\nTalents of Organization Are::").append("\n");
		for (Talent talent : talents) {
			if (talent.getPartner().equals(orgname))
				sb.append(talent.toString()).append("\n");
		}

		sb.append("\nPartners of Organization Are::\n").append("\n");
		for (Partner partner : partners) {
			sb.append(partner.toString()).append("\n");
		}
		return sb.toString();
	}
}
