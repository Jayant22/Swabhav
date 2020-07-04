package com.techlab.Shopping;

import java.io.Serializable;

public class Product implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private double unitPrice;
	private int quantity;
	private String name;
	private double totalPrice = 1;

	public Product(int id, double unitPrice, String name) {
		
		this.id = id;
		this.unitPrice = unitPrice;
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

	public String getName() {
		return name;
	}

	public double getTotalPrice() {
		return totalPrice;
	}
	
	public double  calculateTotal() {
		return totalPrice = unitPrice * quantity;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
		calculateTotal();
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Product Id:: ").append(this.id).append("\n");
		sb.append("Product Name:: ").append(this.name).append("\n");
		sb.append("Product Quantity:: ").append(this.quantity).append("\n");
		sb.append("Product UnitPrice:: ").append(this.unitPrice).append("\n");
		sb.append("Product TotalPrice:: ").append(this.totalPrice);
		return sb.toString();
	}
}