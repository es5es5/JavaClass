package com.lhw.uc.main;

public class Main3 {

	public static void main(String[] args) {
		
		// 기본형의 객체형을 만들 때 사용하는 클래스
		// Wrapper Class
		int a = 10; // Stack
		Integer aa = new Integer(10); // Heap
		int aaa = aa.intValue(); // Wrapper -> 기본형
		
		double b = 0.1;
		Double bb = new Double(b); // 기본형 -> Wrapper
		
		// autoboxing, autounboxing
		Integer cc = 1;
		int ccc = cc;
		
		
		// 기본형 -> String
		int d = 123;
		String dd = d + ""; // String.format()
		String ddd = String.format("ㅋㅋㅋㅋㅋ%d", d);
		
		// String -> 기본형, 단계를 거쳐서
		String e = "3.141592";
		Double ee = Double.parseDouble(e);
		double eee = ee.doubleValue();

		// String -> 기본형, 최신판
		String f = "23";
		int ff = Integer.parseInt(f);
		
	}

}
