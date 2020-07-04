package com.techlab.Shopping;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Order implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String orderId;
	private String orderDate;
	private LineItem lineitem;

	public Order(String orderId, String orderDate, LineItem lineitem) throws Exception {
		super();
		this.orderId = orderId;
		this.orderDate = setDate(orderDate);
		this.lineitem = lineitem;
	}

	private String setDate(String orderDate) throws Exception {
		SimpleDateFormat s = new SimpleDateFormat("dd-MM-yyyy");
		Date d = s.parse(orderDate);
		String date = s.format(d);
		
		return date;		
	}

	public String getOrderId() {
		return orderId;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public LineItem getLineitem() {
		return lineitem;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Order Id:: ").append(this.orderId).append("\n");
		sb.append("Order Date:: ").append(this.orderDate).append("\n");
		sb.append("LineItem Is:: \n").append("\n");
		sb.append(lineitem.toString()).append("\n");
		return sb.toString();
	}

}
