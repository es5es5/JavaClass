package com.lhw.c.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class CollectorMain3 {

	public static void main(String[] args) {
		ArrayList<String> drink = new ArrayList<>();
		drink.add("����");
		drink.add("����");
		drink.add("����");
		drink.add("���ɸ�");
		drink.add("����");
		
		ArrayList<String> anju = new ArrayList<>();
		anju.add("�����쵿");
		anju.add("������");
		anju.add("��â");
		anju.add("����");
		
		
		ArrayList<String> dish = new ArrayList<>();
		dish.add("��������");
		dish.add("�ߺ�����");
		dish.add("ġŲ");
		
		HashMap<String, ArrayList<String>> food = new HashMap<>();
		food.put("�ַ�", drink);
		food.put("���ַ�", anju);
		food.put("�Ļ��", dish);

		// Map ���� Key���� ���� - Set���� ����
		Set<String> foodSet = food.keySet();
		ArrayList<String> foodArraylist = new ArrayList<>(foodSet);
		for (String string : foodArraylist) {
			System.out.println(string);
		}
		
		System.out.println("--------------");
		Scanner keyboard = new Scanner(System.in);
		System.out.print("���� : ");
		String choice = keyboard.next();
		
		ArrayList<String> foodArraylist2 = food.get(choice);
		for (String string : foodArraylist2) {
			System.out.println(string);
		}
	}

}
