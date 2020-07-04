package com.techlab.Violation;

public class Invoice {
	
	private int No;
	private String Name;
	private double amount;
	private double discountpercentage;
	final private float GST = (float) 18.0;
	
	public Invoice(int no, String name, double amount, double discountpercentage) {
		super();
		No = no;
		Name = name;
		this.amount = amount;
		this.discountpercentage = discountpercentage;
	}

	public int getNo() {
		return No;
	}

	public String getName() {
		return Name;
	}

	public double getAmount() {
		return amount;
	}

	public double getDiscountpercentage() {
		return discountpercentage;
	}
	
	public double calculateDiscount() {
		double discount;
		discount = this.amount*(discountpercentage/100);
		return discount;
	}
	
	public float calculateGST() {
		float GST;
		GST= (float) (this.amount * (this.GST/100));
		return GST;
	}

	public double calculateTotalCost() {
		
		double amount;
		amount = this.amount + calculateGST() - calculateDiscount();
		return amount;
		
	}
	
	public void printToConsole(Invoice invoice) {
		System.out.println(invoice);
	}

	@Override
	public String toString() {
		return "Invoice [No=" + No + ", \nName=" + Name + ", \namount=" + amount + ", \ndiscountpercentage="
				+ discountpercentage + ", \nGST=" + GST + ", \ncalculateDiscount()=" + calculateDiscount() 
				+ ", \ncalculateGST()=" + calculateGST() + ", \ncalculateTotalCost()=" + calculateTotalCost() + "]";
	}
	
	
}
