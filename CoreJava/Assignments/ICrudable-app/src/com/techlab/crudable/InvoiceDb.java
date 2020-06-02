package com.techlab.crudable;

public class InvoiceDb implements ICrudable{

	@Override
	public void create() {

		System.out.println("InvoiceDb is Created");
	}

	@Override
	public void read() {

		System.out.println("InvoiceDb is Fetched");
	}

	@Override
	public void update() {

		System.out.println("InvoiceDb is Updated");
	}

	@Override
	public void delete() {

		System.out.println("InvoiceDb is Deleted");
	}
}
