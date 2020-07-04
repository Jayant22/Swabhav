package com.techlab.Violation.test;

import com.techlab.Violation.Book;

public class BookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book b = new Book();
		Book b1 = new Book("xyz", "sam");
		Book b2 = new Book("abc", "ben");
		Book b3 = new Book("pqr", "tom");
		
		b.addBook(b1);
		b.addBook(b2);
		b.addBook(b3);
		
		System.out.println(b.searchBook("abc"));
		
	}

}
