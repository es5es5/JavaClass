package com.lhw.socketc.main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class CMain {

	public static void main(String[] args) {

		Socket s = null;
		Scanner keyboard = null;
		
		try {
			s = new Socket("172.16.1.4", 7777);
			System.out.println("서버에 접속 됨");
			
			keyboard = new Scanner(System.in);

			// 받는 빨대
			InputStream is = s.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);

			// 받는 빨대 키우는 중
			OutputStream os = s.getOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(os);
			BufferedWriter bw = new BufferedWriter(osw);
			
			System.out.println("상대방이 생각 중");
			String str = br.readLine();
			int enemyHand = Integer.parseInt(str);
			
			System.out.println("1. 가위");
			System.out.println("2. 바위");
			System.out.println("3. 보");
			System.out.println("-----------");
			System.out.println("뭐  : ");
			int myHand = keyboard.nextInt();
			
			bw.write(myHand + "\r\n");
			bw.flush();
			
			String[] hand = {"","가위","바위","보"};
			System.out.printf("나 : %s\n",hand[myHand]);
			System.out.printf("너 : %s\n",hand[enemyHand]);
			
			
			int result = enemyHand - myHand;
			if (result == -1 || result == 2) {
				System.out.println("패");
			} else if (result == 0) {
				System.out.println("비김");
			} else {
				System.out.println("이김");
			}
			

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			keyboard.close();
			try {
				s.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
