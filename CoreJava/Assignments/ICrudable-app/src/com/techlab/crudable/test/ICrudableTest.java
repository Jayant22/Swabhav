package com.techlab.crudable.test;

import com.techlab.crudable.AddressDb;
import com.techlab.crudable.CustomerDb;
import com.techlab.crudable.ICrudable;
import com.techlab.crudable.InvoiceDb;

public class ICrudableTest {

	public static void main(String[] args) {

		ICrudable a = (ICrudable) new AddressDb();
		ICrudable c = (ICrudable) new CustomerDb();
		ICrudable i = (ICrudable) new InvoiceDb();

		printInfo(a);
		printInfo(c);
		printInfo(i);
	}

	public static void printInfo(ICrudable I) {

		I.create();
		I.read();
		I.update();
		I.delete();
	}

}
