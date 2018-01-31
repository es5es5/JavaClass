package com.lhw.library.data;

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
	
	public void info() {
		System.out.printf("제목 : %s");
		System.out.printf("작가 : %s");
		
		if (isRent){
			System.out.println("대여 가능");
		} else {
			System.out.println("대여 불가능");
		}
	}
}
