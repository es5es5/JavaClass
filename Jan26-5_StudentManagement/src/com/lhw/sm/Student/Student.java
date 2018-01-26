package com.lhw.sm.Student;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {
	
	private String name;
	private Date birth = new Date();
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public Student(String name, Date birth) {
		super();
		this.name = name;
		this.birth = birth;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirth() {
		return birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	public void info( ) {
		System.out.println(name);
		
		// Date -> String
		System.out.println(new SimpleDateFormat("yyyy/MM/dd").format(birth));
		
		// 생일에서 연도만 추출
		System.out.println(new SimpleDateFormat("yyyy").format(birth));

		
		String birthYear = new SimpleDateFormat("yyyy").format(birth);
		int birthYear2 = Integer.parseInt(birthYear);
		
		String thisYear = new SimpleDateFormat("yyyy").format(new Date());
		int thisYear2 = Integer.parseInt(thisYear);
		
		int age = thisYear2 - birthYear2 + 1;
		System.out.println(age);
		
	}

}
