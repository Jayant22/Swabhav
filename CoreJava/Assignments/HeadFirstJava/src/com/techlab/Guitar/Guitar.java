package com.techlab.Guitar;

public class Guitar {

	private String serialNumber;
	private double price;
	private GuitarSpecs spec;
	
	public Guitar(String serialNumber, double price, GuitarSpecs spec) {
		this.serialNumber = serialNumber;
		this.price = price;
		this.spec = spec;
	}
	
	public GuitarSpecs getSpec() {
		return spec;
	}
	
	public String getSerialNumber() {
		return serialNumber;
	}
	
	public double getPrice() {
		return price;
	}
}
