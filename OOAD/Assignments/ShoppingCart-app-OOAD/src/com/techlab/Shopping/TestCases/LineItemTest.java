package com.techlab.Shopping.TestCases;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import com.techlab.Shopping.LineItem;
import com.techlab.Shopping.Product;

class LineItemTest {

	@Test
	void testLineItemContructor() {
		// Arrange
		int expectedCartId = 3;

		// Act
		System.out.println("In LIneItem Constructor::");
		LineItem lineitem = new LineItem(3);

		// Assert
		assertEquals(expectedCartId, lineitem.getCartId());
	}

	@Test
	void testAddToCart() {
		// Arrange
		int expectedProductID = 4;
		String expectedProductName = "Parle";
		double expectedUnitPrice = 5;
		double expectedQuantity = 20;
		double expectedtotalPrice = 100;

		// Act
		System.out.println("In LineItem Add to Cart::");
		LineItem lineitem = new LineItem(1);
		lineitem.addToCart(new Product(4, 5, "Parle"),20);

		ArrayList<Product> productlist = lineitem.getLineCart();
		// Assert
		for (Product product : productlist) {
			assertEquals(expectedProductID, product.getId());
			assertEquals(expectedProductName, product.getName());
			assertEquals(expectedUnitPrice, product.getUnitPrice());
			assertEquals(expectedQuantity, product.getQuantity());
			assertEquals(expectedtotalPrice, product.getTotalPrice());
		}
	}

	@Test
	void testdeleteFromCart() throws Exception {

		// Arrange
		int expectedProductID = 4;
		String expectedProductName = "Parle";
		double expectedUnitPrice = 5;
		double expectedQuantity = 20;
		double expectedtotalPrice = 100;

		// Act
		System.out.println("In LineItem Delete From Cart::");
		LineItem lineitem = new LineItem(1);
		lineitem.addToCart(new Product(1, 50, "Apple"), 3);
		lineitem.addToCart(new Product(4, 5, "Parle"), 20);

		lineitem.deleteFromCart("Apple");

		ArrayList<Product> productlist = lineitem.getLineCart();

		// Assert
		for (Product product : productlist) {
			assertEquals(expectedProductID, product.getId());
			assertEquals(expectedProductName, product.getName());
			assertEquals(expectedUnitPrice, product.getUnitPrice());
			assertEquals(expectedQuantity, product.getQuantity());
			assertEquals(expectedtotalPrice, product.getTotalPrice());
		}
	}

	@Test
	void testsearchFromCart() throws Exception {

		// Arrange
		int expectedProductID = 4;
		String expectedProductName = "Parle";
		double expectedUnitPrice = 5;
		double expectedQuantity = 20;
		double expectedtotalPrice = 100;

		// Act
		System.out.println("In LineItem Search From Cart::");
		LineItem lineitem = new LineItem(1);
		lineitem.addToCart(new Product(1, 50, "Apple"), 3);
		lineitem.addToCart(new Product(4, 5, "Parle"), 20);

		Product product = lineitem.searchFromCart("Parle");

		// Assert
		assertEquals(expectedProductID, product.getId());
		assertEquals(expectedProductName, product.getName());
		assertEquals(expectedUnitPrice, product.getUnitPrice());
		assertEquals(expectedQuantity, product.getQuantity());
		assertEquals(expectedtotalPrice, product.getTotalPrice());
	}

	void testTotalCartPrice() throws Exception {

		// Arrange
		double expectedtotalPrice = 100;

		// Act
		System.out.println("In LineItem Total Cart Price::");
		LineItem lineitem = new LineItem(1);
		lineitem.addToCart(new Product(4, 5, "Parle"), 20);

		// Assert
		assertEquals(expectedtotalPrice, lineitem.TotalCartPrice());
	}
}
