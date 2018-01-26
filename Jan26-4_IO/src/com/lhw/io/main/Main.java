package com.lhw.io.main;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		// 장치 -> 프로그램으로 입력
		// InputStream : 장치에서 빨아내는 빨대 (1byte)
		// InputStreamReader : 2byte
		// BufferedReader : 한 줄씩

		// OutputStream : 장치에서 집어내는 빨대 (1byte)
		// OutputStreamWriter : 2byte
		// BufferedWriter : 한 줄씩

		// 특수목적용
		// PrintWriter : BufferedWriter개조, 사용하기 편함
		// PrintStream : BufferedWriter개조, 사용하기 편함
		// FileWriter, ...

		BufferedWriter bw = null; // main 문 안에서 bw 변수를 사용하기 위해 try 밖에다 선언 (초기화는 기본)
		try {

			// 경로가 잘 못 되거나 권한 문제 등의 에러가 있을 수 있으니 try catch 이용
			FileWriter fw = new FileWriter("C:\\Users\\soldesk\\Desktop\\test.txt");

//			System.out.println(10 / 0); // 얘가 있으면 catch로 가버리는거 유의

			bw = new BufferedWriter(fw);
			String str = "ㅋㅋㅋㅋㅋ";
			bw.write(str);
			bw.flush(); // 빨대 용량만큼 데이터를 안채워도 강제로 불기
		} catch (Exception e) {
			System.out.println("나누기 0 하지마");
		} finally {
			try {
				bw.close();
			} catch (IOException e) {
				System.out.println("bw가 없어");
			}
		}
	}
}
