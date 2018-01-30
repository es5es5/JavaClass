package com.lhw.c.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class CollectorMain3 {

	public static void main(String[] args) {
		ArrayList<String> drink = new ArrayList<>();
		drink.add("소주");
		drink.add("맥주");
		drink.add("양주");
		drink.add("막걸리");
		drink.add("와인");
		
		ArrayList<String> anju = new ArrayList<>();
		anju.add("볶음우동");
		anju.add("껍데기");
		anju.add("막창");
		anju.add("족발");
		
		
		ArrayList<String> dish = new ArrayList<>();
		dish.add("제육볶음");
		dish.add("닭볶음탕");
		dish.add("치킨");
		
		HashMap<String, ArrayList<String>> food = new HashMap<>();
		food.put("주류", drink);
		food.put("안주류", anju);
		food.put("식사류", dish);

		// Map 에서 Key값만 추출 - Set으로 나옴
		Set<String> foodSet = food.keySet();
		ArrayList<String> foodArraylist = new ArrayList<>(foodSet);
		for (String string : foodArraylist) {
			System.out.println(string);
		}
		
		System.out.println("--------------");
		Scanner keyboard = new Scanner(System.in);
		System.out.print("선택 : ");
		String choice = keyboard.next();
		
		ArrayList<String> foodArraylist2 = food.get(choice);
		for (String string : foodArraylist2) {
			System.out.println(string);
		}
	}

}
