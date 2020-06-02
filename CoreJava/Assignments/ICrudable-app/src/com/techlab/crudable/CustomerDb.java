package com.techlab.crudable;

public class CustomerDb implements ICrudable {

	@Override
	public void create() {

		System.out.println("CustomerDb is Created");
	}

	@Override
	public void read() {

		System.out.println("CustomerDb is Fetched");
	}

	@Override
	public void update() {

		System.out.println("CustomerDb is Updated");
	}

	@Override
	public void delete() {

		System.out.println("CustomerDb is Deleted");
	}
}
