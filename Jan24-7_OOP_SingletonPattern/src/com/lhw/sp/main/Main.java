package com.lhw.sp.main;

import com.lhw.sp.avengers.IronMan;

public class Main {

	public static void main(String[] args) {
		
		// ���� ���� ���̾����.
		IronMan i1 = IronMan.getIronman();
		IronMan i2 = IronMan.getIronman();
		
		i1.info();
		System.out.println(i1);
		
		i2.info();
		System.out.println(i2);
		
		
	}

}
