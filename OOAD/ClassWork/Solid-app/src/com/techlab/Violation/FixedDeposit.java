package com.techlab.Violation;

public class FixedDeposit {
	
	private int accNo;
	private String accName;
	private double rate;
	private double principle;
	private int years;
	FestivalType festival;
	
	public FixedDeposit(int accNo, String accName, double principle, int years, FestivalType festival) {
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

	public FestivalType getFestival() {
		return festival;
	}
	
	public double setRate() {
		if(festival == FestivalType.HOLI)
			return this.rate = 10.0;
		else if (festival == FestivalType.DIWALI)
			return this.rate = 15.0;
		else
			return this.rate = 5.0;
	}
	
	public double calculatSimpleInterest() {
		double totalAmount;
		totalAmount = (principle*rate*years)/100;
		return totalAmount;
	}

	@Override
	public String toString() {
		return "FixedDeposit [accNo=" + accNo + ", \naccName=" + accName + ", \nrate=" + rate + ", \nprinciple="
				+ principle + ", \nyears=" + years + ", \nfestival=" + festival + ", \ncalculatSimpleInterest()=" + calculatSimpleInterest() + "]";
	}
	
	

}
