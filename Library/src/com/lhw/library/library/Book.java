package com.lhw.library.library;

public class Book {
	private String name;
	private String writer;
	private boolean isRent;
	
	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book(String name, String writer, boolean isRent) {
		super();
		this.name = name;
		this.writer = writer;
		this.isRent = isRent;
	}
	
	public Book(String name, String writer) {
		super();
		this.name = name;
		this.writer = writer;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public boolean isRent() {
		return isRent;
	}

	public void setRent(boolean isRent) {
		this.isRent = isRent;
	}
	
	public void bookInfo() {
		System.out.printf("å ���� : %s\n", name);
		System.out.printf("�۰� : %s\n", writer);
		System.out.print("�뿩 :");
		if (isRent) {
			System.out.println("����\n");
		} else {
			System.out.println("�Ұ���\n");
		}
	}
	
	public void rentBook(Book b) {
		b.setRent(false);
	}
	
	public void returnBook(Book b) {
		b.setRent(true);
	}
	
}
