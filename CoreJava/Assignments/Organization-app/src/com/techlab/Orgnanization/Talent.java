package com.techlab.Orgnanization;

public class Talent {

	private int talentID;
	private String talentName, partner;
	private double cgpa;

	public Talent(int talentID, String talentName, double cgpa, String partner) {
		this.talentID = talentID;
		this.talentName = talentName;
		this.cgpa = cgpa;
		this.partner = partner;
	}

	public int getTalentID() {
		return talentID;
	}

	public String getTalentName() {
		return talentName;
	}

	public double getCGPA() {
		return cgpa;
	}

	public String getPartner() {
		return partner;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Talent Id:: ").append(this.talentID).append("\n");
		sb.append("Talent Name:: ").append(this.talentName).append("\n");
		sb.append("Talent DOB:: ").append(this.partner).append("\n");
		sb.append("Talent Address:: ").append(this.cgpa);
		sb.append("\n");
		return sb.toString();
	}

}
