package com.lhw.eh.main;

import com.lhw.eh.cal.Calculator;

public class Main {

	public static void main(String[] args) {

		Calculator c = new Calculator("c1234", "카시오");
		c.info();
	
		try {
			System.out.println(c.getMoks2(3, 2));
		} catch (Exception e) {
			System.out.println("나누기 0 하지마");
		}
	}

}
