package com.kwon.at.product;

public class Book extends Product {
	private String author;

	public Book() {
		// TODO Auto-generated constructor stub
	}
	public Book(String name, int price, String author) {
		super(name, price);
		this.author = author;
	}

	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public void print() {
		super.print();
		System.out.println("ÀúÀÚ : " + author);
	}

}
