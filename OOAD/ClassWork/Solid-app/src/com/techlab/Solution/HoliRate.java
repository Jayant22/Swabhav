package com.techlab.Solution;

public class HoliRate implements IFestivalRate{

	public String festivalName = "Holi";
	
	@Override
	public double getRate() {
		double rate = 10.0;
		return rate;
	}
	
	public String getFestivalName() {
		return festivalName;
	}

}
