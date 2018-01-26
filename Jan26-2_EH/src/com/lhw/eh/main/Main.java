package com.lhw.eh.main;

import com.lhw.eh.cal.Calculator;

public class Main {

	public static void main(String[] args) {
		Calculator c = new Calculator();
		try {
			System.out.println(c.getMoks2(10, 0));
		} catch (Exception e) {
			System.out.println("0 쓰지 마세요");
		}
	}

}
