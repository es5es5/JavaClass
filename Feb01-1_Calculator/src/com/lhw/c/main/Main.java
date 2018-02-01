package com.lhw.c.main;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		int a = 12;
		int b = 1423;
		int[] c = { 123, 123, 124, 4, 15, 125, 12 };
		ArrayList<Integer> d = new ArrayList<>();
		d.add(1412);
		d.add(23552);
		
		int e = 124;
		int f = 2135;
		
		for (int i = 0; i < c.length; i++) {
			e = c[i];
			Cal ccc = new Cal();
			System.out.println(ccc.add(214214, e));
		}
	}

}
