package com.techlab.Product;

public class Product {

	private int id;
	private double unitPrice;
	private int quantity;
	private String name;
	private double totalPrice = 1;

	public Product(int id, double unitPrice, int quantity, String name) {
		
		this.id = id;
		this.unitPrice = unitPrice;
		this.quantity = quantity;
		this.name = name;
		this.totalPrice = calculateTotal();
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

	public Object getName() {
		return name;
	}

	public double getTotalPrice() {
		return totalPrice;
	}
	
	public double  calculateTotal() {
		return totalPrice = unitPrice * quantity;
	}
}
