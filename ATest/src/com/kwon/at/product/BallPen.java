package com.kwon.at.product;

public class BallPen extends Product {
	private String color;

	public BallPen() {
		// TODO Auto-generated constructor stub
	}

	public BallPen(String name, int price, String color) {
		super(name, price);
		this.color = color;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		super.print();
		System.out.println("»ö±ò : " + color);
	}
}
