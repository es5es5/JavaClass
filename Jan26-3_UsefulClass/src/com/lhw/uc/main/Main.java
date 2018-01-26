package com.lhw.uc.main;

import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		// 문자열 객체
		String s = new String("어우 추워");
		// s의 두번째 글자 출력
		System.out.println(s.charAt(1));
		// s의 첫번째 글자 출력
		System.out.println(s.charAt(0));
		// s의 전체 글자 수
		System.out.println(s.length());
		// s에서 '추'라는 글자가 몇 번째에 있나
		System.out.println(s.indexOf("추"));
		// s가 '어'자로 시작하는지 여부
		System.out.println(s.startsWith("어"));
		// s가 '야'자로 끝나는지 여부
		System.out.println(s.endsWith("야"));
		// s에서 "추"를 "더"로 바꿔서 출력
		System.out.println(s.replace("추", "더"));
		// s에서 2번째 글자부터 4번째 글자까지만 출력
		System.out.println(s.substring(1, 4));
		
		String s2 = "감자,고구마,무";
		// 문자열 분리
		String[] s3 = s2.split(",");
		
		for (String string : s3) {
			System.out.println(string);
		}
		
		StringTokenizer st = new StringTokenizer(s2, ",");
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());
		
		int age = 10;
		String name = "홍길동";
		String s6 = String.format("이름 : %s, 나이: %d",  name,age);
		
		System.out.println(s6);
	}

}
