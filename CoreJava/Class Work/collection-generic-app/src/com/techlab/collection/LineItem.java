package com.techlab.collection;

public class LineItem {

	private int id;
	private double unitPrice;
	private int quantity;
	private String name;
	private double totalPrice = 1;

	public LineItem(int id, double unitPrice, int quantity, String name) {
		super();
		this.id = id;
		this.unitPrice = unitPrice;
		this.quantity = quantity;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public int getQuantity() {
		return quantity;
	}

	public String getName() {
		return name;
	}

	public double getTotalPrice() {
		return totalPrice;
	}
	
	public void  calculateTotal() {
		totalPrice = unitPrice * quantity ;
	}
}
