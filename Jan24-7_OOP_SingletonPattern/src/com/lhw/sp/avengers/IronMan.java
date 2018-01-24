package com.lhw.sp.avengers;

//  singleton pattern
//	��ü�� �ϳ��� ���� ���� �ϰ� ���� ��.

public class IronMan {
	private String name;
	private int age;
	
	// 2. Ŭ���� ���ο��� ��ü �ϳ� ������ ��
	private static final IronMan IRONMAN = new IronMan("���", 30);
	
	// 1. �����ڸ� �ܺο��� ȣ�� �� �ϰ�
	private IronMan() {
		// TODO Auto-generated constructor stub
	}

	private IronMan(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	// 3. �ϳ� �ִ� �� ��ü�� ȣ���� �� ����� �޼ҵ� (getter)
	public static IronMan getIronman() {
		return IRONMAN;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void info() {
		System.out.println(name);
		System.out.println(age);
	}

}
