package com.kwon.at.product;

public abstract class Product {
	private String name;
	private int price;

	public Product() {
		// TODO Auto-generated constructor stub
	}
	public Product(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	public void print() {
		System.out.println("품명 : " + name);
		System.out.println("가격 : " + price);
	}
}
