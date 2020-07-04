package com.techlab.Shopping.test;

import java.io.Serializable;
import java.util.*;

import com.techlab.Shopping.*;

public class ShoppingCartTest implements Serializable {

	private static final long serialVersionUID = 1L;

	public static void main(String[] args) throws Exception {

		/*
		 * String OrderId = "1"; String ProdName = "Apple"; int id, double unitPrice,
		 * int quantity, String name
		 */

		ArrayList<Customer> customerlist = new ArrayList<Customer>();

		SerializableCustomer Serialize = new SerializableCustomer();

		Product product1 = new Product(1, 50, "Apple");
		Product product2 = new Product(2, 5, "Banana");
		Product product3 = new Product(3, 25, "ToothPaste");
		Product product4 = new Product(4, 5, "Parle");

		LineItem lineitem1 = new LineItem(1);
		lineitem1.addToCart(product1, 3);
		lineitem1.addToCart(product2, 4);

		LineItem lineitem2 = new LineItem(2);
		lineitem2.addToCart(product3, 5);
		lineitem2.addToCart(product4, 4);

		Order order1 = new Order("1", "12-2-2020", lineitem1);
		Order order2 = new Order("2", "13-3-2020", lineitem2);

		Customer customer = new Customer(1, "Jayant", "Solapur");
		customer.addOrder(order1);
		customer.addOrder(order2);

		Customer customer1 = new Customer(2, "Jay", "Solapur");

		/*
		 * customerlist.add(customer); customerlist.add(customer1);
		 * 
		 * Serialize.serializeCustomer(customerlist);
		 */

		/*
		 * customerlist = Serialize.deserializeCustomer();
		 * 
		 * customerlist.add(new Customer(3, "XYZ", "Mumbai"));
		 * 
		 * Serialize.serializeCustomer(customerlist);
		 */

		customerlist = Serialize.deserializeCustomer();

		for (Customer cust : customerlist) {
			System.out.println(cust);
		}

	}
}
