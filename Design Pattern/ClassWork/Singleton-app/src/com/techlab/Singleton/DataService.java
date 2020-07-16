package com.techlab.Singleton;

public class DataService {

	private static DataService bucket = new DataService();

	private DataService() {
	}
	
	public static DataService getInstance() {
		if (bucket == null) {
			// if instance is null, initialize
			bucket = new DataService();
		}
		return bucket;
	}

	public void processData() {
		System.out.println("s:" + bucket.hashCode() + "\n");
	}
}
