package com.lhw.jt.main;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		try {
			System.out.print("x : ");
			int x = keyboard.nextInt();
			System.out.print("y : ");
			int y = keyboard.nextInt();

			int big = (x > y) ? x : y;

			System.out.println("둘 중에 더 큰 수 : " + big);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			keyboard.close();
		}
	}

}
