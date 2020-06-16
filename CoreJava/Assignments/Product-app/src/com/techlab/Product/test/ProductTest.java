package com.techlab.Product.test;

import java.util.ArrayList;

import com.techlab.Product.LineItem;
import com.techlab.Product.Product;

public class ProductTest {

	public static void main(String[] args) {

		Product product1 = new Product(1, 50, 3, "Apple");
		Product product2 = new Product(2, 5, 15, "Banana");
		Product product3 = new Product(3, 25, 5, "ToothPaste");
		Product product4 = new Product(4, 5, 20, "Parle");

		LineItem lineitem1 = new LineItem();
		lineitem1.addToCart(product1);
		lineitem1.addToCart(product2);

		LineItem lineitem2 = new LineItem();
		lineitem2.addToCart(product3);
		lineitem2.addToCart(product4);

		System.out.println("List Before Operation:: ");
		System.out.println("\nLineItem List 1:: ");
		printInfo(lineitem1);
		System.out.println("TotalPrice of Cart:: " + lineitem1.TotalCartPrice());
		System.out.println("\nLineItem List 2:: ");
		printInfo(lineitem2);
		System.out.println("TotalPrice of Cart:: " + lineitem2.TotalCartPrice());

		System.out.println("\nList After Delete Operation:: ");
		lineitem1.deleteFromCart("Apple");
		lineitem2.deleteFromCart("ToothPaste");

		System.out.println("\nLineItem List 1:: ");
		printInfo(lineitem1);
		System.out.println("TotalPrice of Cart:: " + lineitem1.TotalCartPrice());
		System.out.println("\nLineItem List 2:: ");
		printInfo(lineitem2);
		System.out.println("TotalPrice of Cart:: " + lineitem2.TotalCartPrice());

		System.out.println("\nList After Search Operation:: ");
		System.out.println(lineitem1.searchFromCart("Apple"));
		System.out.println(lineitem2.searchFromCart("Parle"));
	}

	private static void printInfo(LineItem LineItem) {

		ArrayList<Product> LineCart = LineItem.getLineCart();

		for (Product lineItem : LineCart) {
			System.out.println("Id::" + lineItem.getId());
			System.out.println("Name::" + lineItem.getName());
			System.out.println("Quantity::" + lineItem.getQuantity());
			System.out.println("UnitPrice::" + lineItem.getUnitPrice());
			System.out.println("TotalPrice::" + lineItem.getTotalPrice());
		}
	}
}
