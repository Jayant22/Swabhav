package com.techlab.crudable;

public class AddressDb implements ICrudable {

	@Override
	public void create() {

		System.out.println("AddressDb is Created");
	}

	@Override
	public void read() {

		System.out.println("AddressDb is Fetched");
	}

	@Override
	public void update() {

		System.out.println("AddressDb is Updated");
	}

	@Override
	public void delete() {

		System.out.println("AddressDb is Deleted");
	}
}
