package com.techlab.Solution;

public class Book {

	private String bookName, author;

	public Book(String bookName, String author) {
		super();
		this.bookName = bookName;
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [bookName=" + bookName + ", author=" + author + "]";
	}

	public String getBookName() {
		return bookName;
	}

	public String getAuthor() {
		return author;
	}

}
