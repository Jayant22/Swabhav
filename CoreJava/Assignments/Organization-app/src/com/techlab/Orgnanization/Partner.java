package com.techlab.Orgnanization;

import java.util.ArrayList;

public class Partner {

	private int partnerID, empStrength;
	private String partnerName;
	private double companyTurnOver;
	private ArrayList<Talent> talents = new ArrayList<Talent>();

	public Partner(int partnerID, String partnerName, double companyTurnOver, int empStrength) {

		this.partnerID = partnerID;
		this.partnerName = partnerName;
		this.companyTurnOver = companyTurnOver;
		this.empStrength = empStrength;
	}

	public int getPartnerID() {
		return partnerID;
	}

	public String getPartnerName() {
		return partnerName;
	}

	public double getCompayTurnOver() {
		return companyTurnOver;
	}

	public int getEmployeeStrength() {
		return empStrength;
	}

	public void addTalent(Talent t) {
		if (t.getPartner().equals(this.partnerName)) {
			this.talents.add(t);
		}
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Partner Id:: ").append(this.partnerID).append("\n");
		sb.append("Partner Name:: ").append(this.partnerName).append("\n");
		sb.append("Partner Employee Strength:: ").append(this.empStrength).append("\n");
		sb.append("Partner Company TurnOver:: ").append(this.companyTurnOver).append("\n");
		sb.append("\nTalents of Partner Are:: \n").append("\n");
		for (Talent talent : talents) {
			sb.append(talent.toString()).append("\n");
		}
		return sb.toString();
	}


}
