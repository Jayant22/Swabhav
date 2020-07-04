package com.techlab.Shopping.TestCases;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Date;

import org.junit.jupiter.api.Test;

import com.techlab.Shopping.LineItem;
import com.techlab.Shopping.Order;
import com.techlab.Shopping.Product;

class OrderTest {

	@SuppressWarnings("deprecation")
	@Test
	void testOrderConstructor() throws Exception {
		//Arrange
		int expectedProductID = 4;
		String expectedProductName = "Parle";
		double expectedUnitPrice = 5;
		double expectedQuantity = 20;
		double expectedtotalPrice = 100;
		
		int expectedCartId = 1;
		
		String expectedorderId = "1" ;
		Date expectedorderDate = new Date(120, 11, 23);
		
		//Act
		System.out.println("In Order Constructor::");
		LineItem lineitem = new LineItem(1);
		lineitem.addToCart(new Product(4, 5, "Parle"), 20);
		
		Order order = new Order("1", "23-12-2020", lineitem);
		
		ArrayList<Product> productlist = lineitem.getLineCart();
		//Assert
		
		assertEquals(expectedorderId, order.getOrderId());
		assertEquals(expectedorderDate, order.getOrderDate());
		
		assertEquals(expectedCartId, lineitem.getCartId());
		
		for (Product product : productlist) {
			assertEquals(expectedProductID, product.getId());
			assertEquals(expectedProductName, product.getName());
			assertEquals(expectedUnitPrice, product.getUnitPrice());
			assertEquals(expectedQuantity, product.getQuantity());
			assertEquals(expectedtotalPrice, product.getTotalPrice());
		}
	}
	

}
