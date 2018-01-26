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
			System.out.println("������ ���� ��");
			
			keyboard = new Scanner(System.in);

			// �޴� ����
			InputStream is = s.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);

			// �޴� ���� Ű��� ��
			OutputStream os = s.getOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(os);
			BufferedWriter bw = new BufferedWriter(osw);
			
			System.out.println("������ ���� ��");
			String str = br.readLine();
			int enemyHand = Integer.parseInt(str);
			
			System.out.println("1. ����");
			System.out.println("2. ����");
			System.out.println("3. ��");
			System.out.println("-----------");
			System.out.println("��  : ");
			int myHand = keyboard.nextInt();
			
			bw.write(myHand + "\r\n");
			bw.flush();
			
			String[] hand = {"","����","����","��"};
			System.out.printf("�� : %s\n",hand[myHand]);
			System.out.printf("�� : %s\n",hand[enemyHand]);
			
			
			int result = enemyHand - myHand;
			if (result == -1 || result == 2) {
				System.out.println("��");
			} else if (result == 0) {
				System.out.println("���");
			} else {
				System.out.println("�̱�");
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
