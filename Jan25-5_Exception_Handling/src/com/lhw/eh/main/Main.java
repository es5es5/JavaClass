package com.lhw.eh.main;

import java.util.Scanner;

// exception (����) : ���α׷��� ����
//					������ �� �߻��ϴ� ���� ��Ȳ ������ �������� ������ �ȵǴ� ��
// 					������ �� �� �ƴ����� ���å�� ��������
public class Main {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println("x : ");
		int x = keyboard.nextInt();

		System.out.println("y : ");
		int y = keyboard.nextInt();

		// �ϴ��� try{}���� ����, ���� ������ �׳� ������
		// ������ ����� catch�� �̵�

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
			System.out.println("������ 0 ������");
		}
		
		try {
			int[] ar = {1,2};
			System.out.println("�迭�� �� �� ����");
			int i = keyboard.nextInt();
			System.out.println(ar[i]);
	} catch (ArrayIndexOutOfBoundsException e) {
		System.out.println("�迭�� �׷��� ����");
	}
		keyboard.close();

	}

}
