package com.lhw.eh.main;

import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("i : ");
		int i = keyboard.nextInt();
		
		Human h = new Human();
		System.out.println(h.divide(10, i));
	}

}
