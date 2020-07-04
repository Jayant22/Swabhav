package com.techlab.Product;

import java.util.ArrayList;

public class LineItem {

	private final ArrayList<Product> LineCart = new ArrayList<Product>();

	public ArrayList<Product> getLineCart() {
		return LineCart;
	}
	
	public void addToCart(Product product) {
		LineCart.add(product);
	}

	public void deleteFromCart(String name) {
		
		for (Product lineItem : LineCart) {
			if(lineItem.getName().equals(name)) {
				LineCart.remove(lineItem);
			}
		}
	}
	
	public String searchFromCart(String name) {
		String product = null;
		for (Product lineItem : LineCart) {
			if(lineItem.getName().equals(name)) {
				product = name;
				break;
			}
		}
		return product;
	}
	
	public double TotalCartPrice() {
		double price =0 ;
		for (Product product : LineCart) {
			price += product.getTotalPrice();
		}
		return price;
		
	}
}
