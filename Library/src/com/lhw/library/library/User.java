package com.lhw.library.library;

import java.util.ArrayList;
import java.util.concurrent.SynchronousQueue;

public class User {
	private String name;
	private String phone;
	private ArrayList<Book> myBook;
	private int seat;
	
	public User() {
		// TODO Auto-generated constructor stub
	}
	
	public User(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
		myBook = new ArrayList<>();
	}

	public ArrayList<Book> getMyBook() {
		return myBook;
	}

	public void addMyBook(Book newBook) {
		this.myBook.add(newBook);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getSeat() {
		return seat;
	}

	public void setSeat(int seat) {
		this.seat = seat;
	}
	
	public void userInfo() {
		System.out.printf("이름 : %s\n", name);
		System.out.printf("전화번호 : %s\n", phone);
		for (int i = 0; i < myBook.size(); i++) {
			System.out.printf("\t", i+1); this.showMyBooks();
		}
		System.out.println("----");
	
	}
	
	public void showMyBooks() {
		for (int i = 0; i < myBook.size(); i++) {
			System.out.printf("%d). %s", i+1, myBook.get(i).getName());
		}
	}
}
