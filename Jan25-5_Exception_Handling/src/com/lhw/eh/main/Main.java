package com.lhw.eh.main;

import java.util.Scanner;

// exception (예외) : 프로그램은 정상
//					실행할 때 발생하는 예외 상황 때문에 정상적인 실행이 안되는 것
// 					개발자 잘 못 아니지만 대비책은 세워놔야
public class Main {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println("x : ");
		int x = keyboard.nextInt();

		System.out.println("y : ");
		int y = keyboard.nextInt();

		// 일단은 try{}속을 실행, 문제 없으면 그냥 지나감
		// 문제가 생기면 catch로 이동

		int sum = x + y;
		int sub = x - y;
		int mul = x * y;
		System.out.println(sum);
		System.out.println(sub);
		System.out.println(mul);

		try {
			int div = x / y;
			System.out.println(div);
		} catch (ArithmeticException ae) {
			System.out.println("나누기 0 하지마");
		}
		
		try {
			int[] ar = {1,2};
			System.out.println("배열의 몇 번 볼래");
			int i = keyboard.nextInt();
			System.out.println(ar[i]);
	} catch (ArrayIndexOutOfBoundsException e) {
		System.out.println("배열에 그런거 없음");
	}
		keyboard.close();

	}

}
