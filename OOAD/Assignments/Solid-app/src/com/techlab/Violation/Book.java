package com.techlab.Violation;

import java.util.LinkedList;

public class Book {

	private LinkedList<Book> books;
	private String bookName, author;

	public Book() {
		books = new LinkedList<Book>();
	}
	
	public Book(String bookName, String author) {
		this.bookName = bookName;
		this.author = author;
	}

	public String getBookName() {
		return bookName;
	}

	public String getAuthor() {
		return author;
	}

	// here book class is having 2 responsibility
	// 1 - set data related to book
	// 2 - is to add and search book from inventory
	//this violates the single responsibility principle 
	
	public void addBook(Book book) {
		books.add(book);
	}

	public Book searchBook(String bookName) {
		for (Book b : books) {
			if (b.getBookName().equalsIgnoreCase(bookName)) {
				return b;
			}
		}
		return null;
	}

	@Override
	public String toString() {
		return "Book [bookName=" + bookName + ", author=" + author + "]";
	}

}
