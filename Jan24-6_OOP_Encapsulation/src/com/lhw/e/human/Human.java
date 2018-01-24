package com.lhw.e.human;
// 캡슐화(Encapsulation)
// 	멤버 변수 앞에 private => 외부에서 접근 차단
//	안전한 통로를 만들어서 그 통로를 통해서만 멤버 변수를 건들 수 있게
public class Human {
	private String name;
	private int age;
	
	public Human() {
		// TODO Auto-generated constructor stub
	}

	public Human(String name, int age) {
		super();
		this.name = name;
		this.age = age;
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
		if (age < 0) {
			age *= -1;
		}
		this.age = age;
	}
	
	public void info() {
		System.out.println(name);
		System.out.println(age);
	}
	
}
