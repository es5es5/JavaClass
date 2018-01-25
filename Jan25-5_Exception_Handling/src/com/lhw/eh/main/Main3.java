package com.lhw.eh.main;

import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		int[] ar = {123,15};
		Scanner keyboard = new Scanner(System.in);
		System.out.println("i : ");
		int i = keyboard.nextInt();
		
		
		try {
			System.err.println(10 / i);
			System.err.println(ar[i]);
			
		} catch (Exception e) {
			System.out.println("뭔가 문제 발생");
			e.printStackTrace(); // 개발자용  : 무슨 문제인지 출력
		} finally {
			System.out.println("문제가 발생 여부와는 상관없이 무조건 출력");
		}
		
		keyboard.close();

	}

}
