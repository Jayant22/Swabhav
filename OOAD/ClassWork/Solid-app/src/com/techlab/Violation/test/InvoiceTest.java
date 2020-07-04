package com.techlab.Violation.test;

import com.techlab.Violation.Invoice;

public class InvoiceTest {

	public static void main(String[] args) {
		
		Invoice invoice = new Invoice(1,"ABC",100,10);
		invoice.printToConsole(invoice);
	}
}
