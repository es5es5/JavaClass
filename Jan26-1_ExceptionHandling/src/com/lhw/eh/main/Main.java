package com.lhw.eh.main;

import com.lhw.eh.cal.Calculator;

public class Main {

	public static void main(String[] args) {

		Calculator c = new Calculator("c1234", "ī�ÿ�");
		c.info();
	
		try {
			System.out.println(c.getMoks2(3, 2));
		} catch (Exception e) {
			System.out.println("������ 0 ������");
		}
	}

}
