// ������ ���� Ȧ ���� �͸� ������.

package com.lhw.jt.main;

import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		try {
			System.out.print("�� : ");
			int dan = keyboard.nextInt();
			
			for (int i = 1; i <= 9; i++) {
				if (dan*i % 2 == 1) {
					System.out.printf("%d * %d = %d\n", dan, i, dan*i);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			keyboard.close();
		}
	}

}
