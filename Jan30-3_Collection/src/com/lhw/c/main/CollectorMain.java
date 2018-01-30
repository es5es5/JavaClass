package com.lhw.c.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class CollectorMain {

	public static void main(String[] args) {
		// 변수는 하나, 데이터는 여러개
		// [] : 처음 만들 때 사이즈가 고정
		int[] ar = { 10, 23123,4,5,123};
		
		// List 계열 : 가변 사이즈 배열
			// ArrayList, Vector, ...
		ArrayList al = new ArrayList();
		al.add("ㅋㅋ");
		al.add("ㅎㅎ");
		al.add("ㅇㅇ");
		al.add("ㅈㅈ");
		al.add(1234);
		al.add(54.25);
		
		System.out.println(al.get(0));
		System.out.println(al.get(3));
		
		// <xxxx> : generic - 특정 타입을 지정할 때
		ArrayList<Integer> al2 = new ArrayList<>();
		al2.add(20);
		al2.add(10);
		al2.add(30);
		al2.add(1, 70); // 1번째에 70 추가
		al2.remove(0); // 0번째꺼 삭제
		
		
		for (int i = 0; i < al2.size(); i++) {
			System.out.println(al2.get(i));
		}
		
		System.out.println("------------");
		// Set 계열(집합) : 가변사이즈 배열, 중복을 없앰, 순서 랜덤
			// HashSet, ...
		HashSet<String> hs = new HashSet<>();
		hs.add("ㅋㅋㅋ");
		hs.add("ㅋㅋㅋ");
		hs.add("ㅎㅎ");
		hs.add("ㅋㅇㅇㅋ");
		hs.add("ㅋㄷㄷ");
		System.out.println(hs.size());
		
		// 사용할 때 [] or List로 바꿔서 사용		
		ArrayList<String> al3 = new ArrayList<>(hs);
		for (String s : al3) {
			System.out.println(s);
		}
		System.out.println("------------");
		
		// Set -> []
		String[] ar3 = hs.toArray(new String[hs.size()]);
		
		// Map 계열(Dictionary) : 가변 사이즈, Key-Value쌍, 순서x
		//	HashMap, HashTable, ...
		HashMap<String, Integer> hm = new HashMap<>();
		hm.put("종이컵", 100);
		hm.put("볼펜", 300);
		System.out.println(hm.get("종이컵"));
		
	}

}
