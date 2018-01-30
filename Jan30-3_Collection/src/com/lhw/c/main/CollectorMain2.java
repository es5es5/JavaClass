package com.lhw.c.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class CollectorMain2 {

	public static void main(String[] args) {
		ArrayList<String> seoul = new ArrayList<>();
		seoul.add("����");
		seoul.add("ȫ��");
		seoul.add("����");
		seoul.add("���");
		seoul.add("���");
		
		ArrayList<String> chuncheon = new ArrayList<>();
		chuncheon.add("������");
		chuncheon.add("����");
		chuncheon.add("������");
		chuncheon.add("�Ҿ簭");
		
		
		ArrayList<String> incheon = new ArrayList<>();
		incheon.add("����");
		incheon.add("���а����");
		incheon.add("���̵�");
		
		HashMap<String, ArrayList<String>> korea = new HashMap<>();
		korea.put("����", seoul);
		korea.put("��õ", chuncheon);
		korea.put("��õ", incheon);

		// Map ���� Key���� ���� - Set���� ����
		Set<String> loc = korea.keySet();
		ArrayList<String> loc2 = new ArrayList<>(loc);
		for (String string : loc2) {
			System.out.println(string);
		}
		
		System.out.println("--------------");
		Scanner keyboard = new Scanner(System.in);
		System.out.print("��� : ");
		String locName = keyboard.next();
		
		ArrayList<String> loc3 = korea.get(locName);
		for (String string : loc3) {
			System.out.println(string);
		}
	}

}
