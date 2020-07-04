package com.techlab.Shopping;

import java.io.Serializable;
import java.util.*;

public class Customer implements Serializable {

	private static final long serialVersionUID = 1L;
	private int customerId;
	private String customerName, customerAddress;
	private ArrayList<Order> orders;
	private int OrderCount;

	public Customer() {
		super();
	}

	public Customer(int customerId, String customerName, String customerAddress) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerAddress = customerAddress;
		orders = new ArrayList<Order>();
	}

	public void addOrder(Order order) {
		if (order.getLineitem().getCartSize() == 0) {
			orders.add(null);
		} else {
			orders.add(order);
		}
	}

	public int getID() {
		return customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public List<Order> getOrders() {
		return orders;
	}

	public int getOrderCount() {
		return OrderCount + orders.size();
	}

	public void CancelOrder(String orderId) {

		for (Order order : orders) {
			if (orderId.equals(order.getOrderId())) {
				orders.remove(order);
			}
		}
	}

	public double getTotalBill() {
		LineItem lineitem;
		double totalBill = 0;
		for (Order order : orders) {
			lineitem = order.getLineitem();
			totalBill += lineitem.TotalCartPrice();
		}
		return totalBill;
	}

	@Override

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Customer Id:: ").append(this.customerId).append("\n");
		sb.append("Customer Name:: ").append(this.customerName).append("\n");
		sb.append("Customer Address:: ").append(this.customerAddress).append("\n");

		if (!orders.isEmpty()) {
			sb.append("Order Count:: ").append(this.getOrderCount()).append("\n");
			sb.append("Orders Are::\n").append("\n");
			for (Order order : orders) {
				if (order != null) {
					sb.append(order.toString()).append("\n");
				} else {
					sb.append("Order cannot be placed...\n").append("\n");
				}
			}
			sb.append("Total Bill Of Customer:: ").append(this.getTotalBill()).append("\n");
		} else
			sb.append("Order Not Placed...\n").append("\n");
		return sb.toString();
	}
}
