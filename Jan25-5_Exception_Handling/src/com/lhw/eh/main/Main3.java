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
			System.out.println("���� ���� �߻�");
			e.printStackTrace(); // �����ڿ�  : ���� �������� ���
		} finally {
			System.out.println("������ �߻� ���οʹ� ������� ������ ���");
		}
		
		keyboard.close();

	}

}
