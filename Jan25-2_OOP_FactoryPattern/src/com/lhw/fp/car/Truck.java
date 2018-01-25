package com.lhw.fp.car;

public class Truck extends Car{
	// 1. 다른 패키지에서 객체 생성 못 하게
	Truck() {
		// TODO Auto-generated constructor stub
	}

	Truck(int no) {
		super(no);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void info() {
		// TODO Auto-generated method stub
		super.info();
		System.out.println("트럭");
	}

}
