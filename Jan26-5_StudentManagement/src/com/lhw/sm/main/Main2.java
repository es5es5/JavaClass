package com.lhw.sm.main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.lhw.sm.Student.Student;

public class Main2 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("이름 : ");
		String name = keyboard.next();
		
		System.out.print("생일(YYYYMMDD) : ");
		String birthday = keyboard.next();
		// String -> Date
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		try {
			Date bd = sdf.parse(birthday);
			
			Student s = new Student(name, bd);
			s.info();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
