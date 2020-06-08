package com.techlab.collection.test;

import java.util.ArrayList;

import com.techlab.collection.LineItem;

public class LineItemTest {

	public static void main(String[] args) {
		
		ArrayList<LineItem> cart = new ArrayList<LineItem>();

		cart.add(new LineItem(101, 10, 30, "Apple")); // 300
		cart.add(new LineItem(105, 5, 15, "Banana"));// 75
		cart.add(new LineItem(199, 2, 85, "ToothPaste"));// 170
		
		for (LineItem lineItem : cart) {
			lineItem.calculateTotal();
		}
		
		printInfo(cart);
	}

	private static void printInfo(ArrayList<LineItem> cart) {
		
		for (LineItem lineItem : cart) {
			System.out.println("Id::"+lineItem.getId());
			System.out.println("Name::"+lineItem.getName());
			System.out.println("Quantity::"+lineItem.getQuantity() );
			System.out.println("UnitPrice::"+lineItem.getUnitPrice());
			System.out.println("TotalPrice::"+lineItem.getTotalPrice());
		}		
	}
}
