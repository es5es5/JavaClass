package com.lhw.fp.school;

public class LeeSeMi {
	private int lastNo;
	// �̱���
	private static final LeeSeMi LSM = new LeeSeMi();	

	private LeeSeMi() {
		
	}
			
	public static LeeSeMi getLsm() {
		return LSM;
	}
	// ������� �̱���


	public Student register(String name) {
		lastNo++;
		return new Student(name, lastNo);
	}
}
