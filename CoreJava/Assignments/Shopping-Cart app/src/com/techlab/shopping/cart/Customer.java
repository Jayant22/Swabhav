package com.techlab.shopping.cart;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.*;

public class Customer implements Serializable {

	private static final long serialVersionUID = 1L;
	private int customerId;
	private String customerName, customerAddress;
	private Date purchaseDate;
	private final static String FILENAME = "src/resource/ShoppingCart.txt";
	
	
	public Customer() {
		super();
	}

	public Customer(int customerId, String customerName, String purchaseDate, String customerAddress ) throws Exception {
		
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerAddress = customerAddress;
		this.purchaseDate = setDate(purchaseDate);
	}
	
	private Date setDate(String purchaseDate) throws Exception {

		SimpleDateFormat s = new SimpleDateFormat("dd-MM-yyyy");
		Date date = s.parse(purchaseDate);
		return date;
	}

	public void addIntoCart(HashMap<Customer, ArrayList<Product>> map) throws Exception {

		FileOutputStream file = new FileOutputStream(FILENAME);
		ObjectOutputStream out = new ObjectOutputStream(file);

		out.writeObject(map);

		out.flush();
		out.close();
	}

	public ArrayList<Product> searchFromCart(ArrayList<Product> product, String productName) throws Exception {

		ArrayList<Product> p = new ArrayList<Product>();

		for (int i = 0; i < product.size(); i++) {
			if (product.get(i).getProductName().equals(productName)) {
				p.add(product.get(i));
			}
		}
		return p;
	}

	public void deleteFromCart(ArrayList<Product> product, String productName) throws Exception {


		for (int i = 0; i < product.size(); i++) {
			if (product.get(i).getProductName().equals(productName)) {
				product.remove(i);
			}
		}
		
	}

	public static HashMap<Customer, ArrayList<Product>> deserializeCustomer() throws Exception {

		FileInputStream file = new FileInputStream(FILENAME);
		ObjectInputStream in = new ObjectInputStream(file);

		@SuppressWarnings("unchecked")
		HashMap<Customer, ArrayList<Product>> Map = (HashMap<Customer, ArrayList<Product>>) in.readObject();

		in.close();
		return Map;
	}

	public double totalCartCost(ArrayList<Product> product) {
		double total = 0;
		
		for(Product p: product) {
			total = total + p.getUnitPrice() - (p.getDiscount() * p.getUnitPrice());
		}
		
		return total;		
	}
	public int getID() {
		return customerId;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	
	public Date getPurchaseDate() {
		return purchaseDate;
	}
	
	public String getCustomerAddress() {
		return customerAddress;
	}
	
	

}
