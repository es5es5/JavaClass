package com.lhw.e.main;

import com.lhw.e.human.Human;
import com.lhw.e.pen.Pen;

public class Main {

	public static void main(String[] args) {
		
		Human h = new Human();
		h.setAge(-10);
		System.out.println(h.getAge());
		
		Pen p = new Pen("¸ð³ª¹Ì", 1000);
	}

}
