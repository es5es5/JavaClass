package com.lhw.eh.main;

public class Human {
	
	public int divide(int a, int b) {
		try {
			int c = a/ b;
			return c;
		} catch (Exception e) {
			System.out.println("나누기 0 안돼");
			return 0;
		} finally {
			System.out.println("수고");
		}
	}

}
