package com.techlab.Shopping;

import java.io.Serializable;
import java.util.ArrayList;

public class LineItem implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ArrayList<Product> LineCart = new ArrayList<Product>();
	private int CartId;
	boolean productFound = false;

	public LineItem(int cartId) {
		super();
		CartId = cartId;
	}

	public ArrayList<Product> getLineCart() {
		return LineCart;
	}

	public void addToCart(Product product, int quantity) {

		for (Product lineItem : LineCart) {
			if (lineItem.getId() == (product.getId())) {
				product.setQuantity(quantity);
				productFound = true;
				break;
			}
		}
		if (!productFound) {
			LineCart.add(product);
			product.setQuantity(quantity);
		}
	}

	public void deleteFromCart(String name) {

		Product Temp = null;
		for (Product lineItem : LineCart) {
			if (lineItem.getName().equals(name)) {
				Temp = lineItem;
				break;
			}
		}
		LineCart.remove(Temp);
	}

	public Product searchFromCart(String name) {
		Product product = null;
		for (Product lineItem : LineCart) {
			if (lineItem.getName().equals(name)) {
				product = lineItem;
				break;
			}
		}
		return product;
	}

	public double TotalCartPrice() {
		double price = 0;
		for (Product product : LineCart) {
			price += product.getTotalPrice();
		}
		return price;
	}

	public int getCartId() {
		return CartId;
	}

	public int getCartSize() {
		return LineCart.size();
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Cart Id:: ").append(this.CartId).append("\n");
		sb.append("Products of Cart Are:: \n").append("\n");
		for (Product lineitem : LineCart) {
			sb.append(lineitem.toString()).append("\n");
		}
		sb.append("Total Price of Cart Is:: \n").append(this.TotalCartPrice()).append("\n");
		return sb.toString();
	}
}
