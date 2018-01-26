package com.lhw.uc.main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main2 {

	// 시간/날짜
	public static void main(String[] args) {
		java.util.Date d = new Date();
		
		System.out.println(d);
		
		System.out.println(d.getYear());
		
		// 년도 : y
		// 월 : M
		// d
//		a
//		h
//		m
//		s
		
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd ss");
		String s = sdf.format(d);
		System.out.println(s);
		
		String s2 = "920919";
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyMMdd");
		Date s3;
		try {
			s3 = sdf2.parse(s2);
			System.out.println(s3);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
	}

}
