package com.lhw.fp.school;

public class LeeSeMi {
	private int lastNo;
	// 싱글턴
	private static final LeeSeMi LSM = new LeeSeMi();	

	private LeeSeMi() {
		
	}
			
	public static LeeSeMi getLsm() {
		return LSM;
	}
	// 여기까지 싱글턴


	public Student register(String name) {
		lastNo++;
		return new Student(name, lastNo);
	}
}
