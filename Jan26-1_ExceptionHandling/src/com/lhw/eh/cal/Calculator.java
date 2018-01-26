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
		System.out.printf("�𵨸� : %s\n", name);
		System.out.printf("������ : %s\n", maker);
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
			System.out.println("������ 0 ����\n");
			return -999;
		} finally {
			System.out.println("��¶�� ������ ����\n");
		}
	}
	
	// �� �޼ҵ带 �����ϴٰ� ArithmeticException�� �߻��ϸ�
	// �� �޼ҵ带 ȣ���� �ʿ��� ó��
	public int getMoks2(int a, int b) throws ArithmeticException {
		int moks = a/b;
		return moks;
	}

}
