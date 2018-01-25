package com.lhw.fp.main;

import com.lhw.fp.car.Car;
import com.lhw.fp.car.CarFactory;
import com.lhw.fp.school.LeeSeMi;
import com.lhw.fp.school.Student;

public class Main {

	public static void main(String[] args) {
		CarFactory cf = new CarFactory();
		Car c1 = cf.makeACar("��");
		c1.info();
		
		Car c2 = cf.makeACar("��");
		c2.info();
		Car b1 = cf.makeACar("��");
		b1.info();
		
	}
}
