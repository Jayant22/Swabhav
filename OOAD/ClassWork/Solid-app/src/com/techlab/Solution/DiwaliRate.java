package com.techlab.Solution;

public class DiwaliRate implements IFestivalRate{

	public String festivalName = "Diwali";
	
	@Override
	public double getRate() {
		double rate = 15.0;
		return rate;
	}
	
	public String getFestivalName() {
		return festivalName;
	}

}
