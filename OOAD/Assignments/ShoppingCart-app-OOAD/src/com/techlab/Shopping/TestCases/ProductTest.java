package com.techlab.Shopping.TestCases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.techlab.Shopping.Product;

class ProductTest {

	@Test
	void testProductConstructor() throws Exception {

		// Arrange
		int expectedProductID = 4;
		String expectedProductName = "Parle";
		double expectedUnitPrice = 5;

		// Act
		System.out.println("In Contructor of Product Class");
		Product product = new Product(4, 5, "Parle");

		// Assert
		assertEquals(expectedProductID, product.getId());
		assertEquals(expectedProductName, product.getName());
		assertEquals(expectedUnitPrice, product.getUnitPrice());

	}

}
