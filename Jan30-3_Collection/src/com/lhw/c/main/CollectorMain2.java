package com.lhw.c.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class CollectorMain2 {

	public static void main(String[] args) {
		ArrayList<String> seoul = new ArrayList<>();
		seoul.add("종각");
		seoul.add("홍대");
		seoul.add("강변");
		seoul.add("용산");
		seoul.add("잠실");
		
		ArrayList<String> chuncheon = new ArrayList<>();
		chuncheon.add("강원대");
		chuncheon.add("강촌");
		chuncheon.add("구봉산");
		chuncheon.add("소양강");
		
		
		ArrayList<String> incheon = new ArrayList<>();
		incheon.add("계산고");
		incheon.add("문학경기장");
		incheon.add("월미도");
		
		HashMap<String, ArrayList<String>> korea = new HashMap<>();
		korea.put("서울", seoul);
		korea.put("춘천", chuncheon);
		korea.put("인천", incheon);

		// Map 에서 Key값만 추출 - Set으로 나옴
		Set<String> loc = korea.keySet();
		ArrayList<String> loc2 = new ArrayList<>(loc);
		for (String string : loc2) {
			System.out.println(string);
		}
		
		System.out.println("--------------");
		Scanner keyboard = new Scanner(System.in);
		System.out.print("어디 : ");
		String locName = keyboard.next();
		
		ArrayList<String> loc3 = korea.get(locName);
		for (String string : loc3) {
			System.out.println(string);
		}
	}

}
