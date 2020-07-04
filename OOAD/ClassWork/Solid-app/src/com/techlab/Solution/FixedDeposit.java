package com.techlab.Solution;

public class FixedDeposit {
	
	private int accNo;
	private String accName;
	private double rate;
	private double principle;
	private int years;
	IFestivalRate festival;
	
	public FixedDeposit(int accNo, String accName, double principle, int years, IFestivalRate festival) {
		this.accNo = accNo;
		this.accName = accName;
		this.principle = principle;
		this.years = years;
		this.festival = festival;
		this.rate = setRate();
	}

	public int getAccNo() {
		return accNo;
	}

	public String getAccName() {
		return accName;
	}

	public double getRate() {
		return rate;
	}

	public double getPrinciple() {
		return principle;
	}

	public int getYears() {
		return years;
	}

	public IFestivalRate getFestival() {
		return festival;
	}
	
	public double setRate() {
		return this.rate = festival.getRate();
	}
	
	public double calculatSimpleInterest() {
		double totalAmount;
		totalAmount = (principle*rate*years)/100;
		return totalAmount;
	}

	@Override
	public String toString() {
		return "FixedDeposit [accNo=" + accNo + ", \naccName=" + accName + ", \nrate=" + rate + ", \nprinciple="
				+ principle + ", \nyears=" + years + ", \nfestival=" + festival.getFestivalName()+ ", \ncalculatSimpleInterest()=" + calculatSimpleInterest() + "]";
	}
	
	

}

