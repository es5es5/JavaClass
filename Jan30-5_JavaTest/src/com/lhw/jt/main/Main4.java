package com.lhw.jt.main;

import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Computer c1 = new Computer();
		try {
			System.out.print("ǰ�� : ");
			c1.setName(keyboard.next());
			System.out.print("���� : ");
			c1.setPrice(keyboard.nextInt());
			System.out.print("CPU : ");
			c1.setCpu(keyboard.next());
			System.out.print("RAM : ");
			c1.setRam(keyboard.nextInt());
			System.out.print("HDD : ");
			c1.setHdd(keyboard.nextInt());
			System.out.print("SSD : ");
			c1.setSsd(keyboard.nextInt());
			
			c1.info();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			keyboard.close();
		}
	}

}
