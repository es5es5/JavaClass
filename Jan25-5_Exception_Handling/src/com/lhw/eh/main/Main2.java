package com.lhw.eh.main;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		int[] ar = {123,15};
		Scanner keyboard = new Scanner(System.in);
		System.out.println("i : ");
		int i = keyboard.nextInt();
		
		
		try {
			System.err.println(10 / i);
			System.err.println(ar[i]);
			
		} catch (ArithmeticException ae) {
			System.out.println("������ 0 �ȵ�");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("�迭�� �׷��� ����");
		}
		
		keyboard.close();
	}

}
