package com.techlab.Solution.test;

import com.techlab.Solution.*;

public class BookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Inventory i = new Inventory();
		Book b1 = new Book("xyz", "sam");
		Book b2 = new Book("abc", "ben");
		Book b3 = new Book("pqr", "tom");

		i.addBook(b1);
		i.addBook(b2);
		i.addBook(b3);

		System.out.println(i.searchBook("abc"));
	}

}
