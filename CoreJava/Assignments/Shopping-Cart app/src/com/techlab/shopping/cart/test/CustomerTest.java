package com.techlab.shopping.cart.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

import com.techlab.shopping.cart.Customer;
import com.techlab.shopping.cart.Product;

class CustomerTest {

	@Test
	void testCustomerConstructor() throws Exception {
		// Arrange
		int expectedCustomerID = 101;
		String expectedCustomerName = "Jay";
		Date expectedPurchaseDate = new Date(120, 11, 23);
		String expectedCustomerAddress = "Mumbai";

		// Act
		Customer customer = new Customer(101, "Jay", "23-12-2020", "Mumbai");	
		
		// Assert
		assertEquals(expectedCustomerID, customer.getID());
		assertEquals(expectedCustomerName, customer.getCustomerName());
		assertEquals(expectedPurchaseDate, customer.getPurchaseDate());
		assertEquals(expectedCustomerAddress, customer.getCustomerAddress());

	}

	@Test
	void testProductConstructor() throws Exception {

		// Arrange
		int expectedProductID = 101;
		String expectedProductName = "Parle";
		double expectedUnitPrice = 25;
		double expectedDiscount = 10;

		// Act
		Product product = new Product(101, "Parle", 25, 10);

		// Assert
		assertEquals(expectedProductID, product.getProductID());
		assertEquals(expectedProductName, product.getProductName());
		assertEquals(expectedUnitPrice, product.getUnitPrice());
		assertEquals(expectedDiscount, product.getDiscount());

	}
	
	@Test
	void testaddIntoCart() throws Exception{
	
		//Arrange
		int expectedCustomerID = 101;
		String expectedCustomerName = "Jay";
		Date expectedPurchaseDate = new Date(120, 11, 23);
		String expectedCustomerAddress = "Mumbai";
		
		int expectedProductID = 101;
		String expectedProductName = "Parle";
		double expectedUnitPrice = 25;
		double expectedDiscount = 10;
		
		//Act
		Customer customer = new Customer(101, "Jay", "23-12-2020", "Mumbai");	
		Product product = new Product(101, "Parle", 25, 10);

		
		//Assert
		
		ArrayList<Product> productlist = new ArrayList<Product>();
		productlist.add(product);
		
		HashMap<Customer, ArrayList<Product>> map = new HashMap<Customer, ArrayList<Product>>();
		map.put(customer, productlist);
		
		customer.addIntoCart(map);
		
		HashMap<Customer, ArrayList<Product>> resultlist =  Customer.deserializeCustomer();
		
		//Assert
		for (Map.Entry<Customer, ArrayList<Product>> entry : resultlist.entrySet()) {

			Customer cust = entry.getKey();
			ArrayList<Product> prod = entry.getValue();
			
			assertEquals(expectedCustomerID, cust.getID());
			assertEquals(expectedCustomerName, cust.getCustomerName());
			assertEquals(expectedPurchaseDate, cust.getPurchaseDate());
			assertEquals(expectedCustomerAddress, cust.getCustomerAddress());

			System.out.println("Your products\n");
			for (Product p : prod) {
				assertEquals(expectedProductID, p.getProductID());
				assertEquals(expectedProductName, p.getProductName());
				assertEquals(expectedUnitPrice, p.getUnitPrice());
				assertEquals(expectedDiscount, p.getDiscount());
			}
		}
		
	}
	
	@Test
	void testsearchFromCart() throws Exception{
		
		//Arrange
		int expectedProductID = 101;
		String expectedProductName = "Parle";
		double expectedUnitPrice = 25;
		double expectedDiscount = 10;
		
		//Act
		Customer customer = new Customer();
		Product product = new Product(101, "Parle", 25, 10);
		
		ArrayList<Product> productlist = new ArrayList<Product>();
		productlist.add(product);
		
		ArrayList<Product> result = customer.searchFromCart(productlist, expectedProductName);
		
		//Assert
		for (Product p : result) {
			assertEquals(expectedProductID, p.getProductID());
			assertEquals(expectedProductName, p.getProductName());
			assertEquals(expectedUnitPrice, p.getUnitPrice());
			assertEquals(expectedDiscount, p.getDiscount());
		}
	}
	
	@Test
	void testdeleteFromCart() throws Exception{
		
		//Arrange
		int expectedProductID = 101;
		String expectedProductName = "Parle";
		double expectedUnitPrice = 25;
		double expectedDiscount = 10;
		
		//Act
		Customer customer = new Customer();
		Product product = new Product(101, "Parle", 25, 10);
		Product product1 = new Product(102, "20-20", 50, 10);
		
		ArrayList<Product> productlist = new ArrayList<Product>();
		productlist.add(product);
		productlist.add(product1);
		
		customer.deleteFromCart(productlist, "20-20");
		
		//Assert
		for (Product p : productlist) {
			assertEquals(expectedProductID, p.getProductID());
			assertEquals(expectedProductName, p.getProductName());
			assertEquals(expectedUnitPrice, p.getUnitPrice());
			assertEquals(expectedDiscount, p.getDiscount());
		}
	}
}
