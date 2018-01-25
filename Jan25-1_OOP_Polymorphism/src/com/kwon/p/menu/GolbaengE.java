package com.kwon.p.menu;

public class GolbaengE extends Anju {
	private String spicyGrade;

	public GolbaengE() {
		// TODO Auto-generated constructor stub
	}

	public GolbaengE(String name, int price, String spicyGrade) {
		super(name, price);
		this.spicyGrade = spicyGrade;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		super.print();
		System.out.println(spicyGrade);
	}
}
