package com.kwon.p.menu;

public class Soju extends Alcohol {
	private double alcohol;

	public Soju() {
		// TODO Auto-generated constructor stub
	}

	public Soju(String name, int price, double alcohol) {
		super(name, price);
		this.alcohol = alcohol;
	}

	public double getAlcohol() {
		return alcohol;
	}

	public void setAlcohol(double alcohol) {
		this.alcohol = alcohol;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		super.print();
		System.out.println(alcohol);
	}

	public void printName() {
		// private도 상속은 됨
		// 접근은 getXXX(), setXXX()로
		System.out.println(getName());
	}

}
