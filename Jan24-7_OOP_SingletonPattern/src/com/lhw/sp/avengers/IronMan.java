package com.lhw.sp.avengers;

//  singleton pattern
//	객체를 하나만 만들어서 쓰게 하고 싶을 때.

public class IronMan {
	private String name;
	private int age;
	
	// 2. 클래스 내부에서 객체 하나 생성해 둠
	private static final IronMan IRONMAN = new IronMan("토니", 30);
	
	// 1. 생성자를 외부에서 호출 못 하게
	private IronMan() {
		// TODO Auto-generated constructor stub
	}

	private IronMan(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	// 3. 하나 있는 그 객체를 호출할 때 사용할 메소드 (getter)
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
