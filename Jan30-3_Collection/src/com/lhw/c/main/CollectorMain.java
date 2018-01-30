package com.lhw.c.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class CollectorMain {

	public static void main(String[] args) {
		// ������ �ϳ�, �����ʹ� ������
		// [] : ó�� ���� �� ����� ����
		int[] ar = { 10, 23123,4,5,123};
		
		// List �迭 : ���� ������ �迭
			// ArrayList, Vector, ...
		ArrayList al = new ArrayList();
		al.add("����");
		al.add("����");
		al.add("����");
		al.add("����");
		al.add(1234);
		al.add(54.25);
		
		System.out.println(al.get(0));
		System.out.println(al.get(3));
		
		// <xxxx> : generic - Ư�� Ÿ���� ������ ��
		ArrayList<Integer> al2 = new ArrayList<>();
		al2.add(20);
		al2.add(10);
		al2.add(30);
		al2.add(1, 70); // 1��°�� 70 �߰�
		al2.remove(0); // 0��°�� ����
		
		
		for (int i = 0; i < al2.size(); i++) {
			System.out.println(al2.get(i));
		}
		
		System.out.println("------------");
		// Set �迭(����) : ���������� �迭, �ߺ��� ����, ���� ����
			// HashSet, ...
		HashSet<String> hs = new HashSet<>();
		hs.add("������");
		hs.add("������");
		hs.add("����");
		hs.add("��������");
		hs.add("������");
		System.out.println(hs.size());
		
		// ����� �� [] or List�� �ٲ㼭 ���		
		ArrayList<String> al3 = new ArrayList<>(hs);
		for (String s : al3) {
			System.out.println(s);
		}
		System.out.println("------------");
		
		// Set -> []
		String[] ar3 = hs.toArray(new String[hs.size()]);
		
		// Map �迭(Dictionary) : ���� ������, Key-Value��, ����x
		//	HashMap, HashTable, ...
		HashMap<String, Integer> hm = new HashMap<>();
		hm.put("������", 100);
		hm.put("����", 300);
		System.out.println(hm.get("������"));
		
	}

}
