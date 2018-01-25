package com.lhw.fp.car;

public abstract class Car {
	private int no;
	
	public Car() {
		// TODO Auto-generated constructor stub
	}

	public Car(int no) {
		super();
		this.no = no;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public void info() {
		System.out.println(no);
	}

}
