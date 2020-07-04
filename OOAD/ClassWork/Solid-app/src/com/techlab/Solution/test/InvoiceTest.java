package com.techlab.Solution.test;

import com.techlab.Solution.InvoicePrinter;
import com.techlab.Violation.Invoice;

public class InvoiceTest {

	public static void main(String[] args) {

		Invoice invoice = new Invoice(1, "ABC", 100, 10);
		
		InvoicePrinter printer = new InvoicePrinter();
		printer.printToConsole(invoice);
	}
	
}
