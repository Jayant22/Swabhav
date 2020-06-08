package com.techlab.shopping.cart;

import java.io.Serializable;

public class Product implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private int productId;
	private String productName;
	private double unitPrice, discount;
	
	public Product(int productId, String productName, double unitPrice, double discount) {
		this.productId = productId;
		this.productName = productName;
		this.unitPrice = unitPrice;
		this.discount = discount;
	}
	
	public int getProductID() {
		return productId;
	}
	
	public String getProductName() {
		return productName;
	}
	
	public double getUnitPrice() {
		return unitPrice;
	}
	
	public double getDiscount() {
		return discount;
	}

}
