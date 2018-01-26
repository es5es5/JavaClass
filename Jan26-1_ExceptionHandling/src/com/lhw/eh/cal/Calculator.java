package com.lhw.eh.cal;

public class Calculator {
	private String name;
	private String maker;

	public Calculator() {
		// TODO Auto-generated constructor stub
	}

	public Calculator(String name, String maker) {
		super();
		this.name = name;
		this.maker = maker;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}

	public void info() {
		System.out.printf("모델명 : %s\n", name);
		System.out.printf("제조사 : %s\n", maker);
	}

	public double sum(double a, double b) {
		return a + b;
	}

	public double sub(double a, double b) {
		return a - b;
	}

	public double mul(double a, double b) {
		return a * b;
	}

	public double div(double a, double b) {
		try {
			double moks = a / b;
			return moks;
		} catch (Exception e) {
			System.out.println("나누기 0 ㄴㄴ\n");
			return -999;
		} finally {
			System.out.println("어쨋든 나누기 했음\n");
		}
	}
	
	// 이 메소드를 실행하다가 ArithmeticException가 발생하면
	// 이 메소드를 호출한 쪽에서 처리
	public int getMoks2(int a, int b) throws ArithmeticException {
		int moks = a/b;
		return moks;
	}

}
