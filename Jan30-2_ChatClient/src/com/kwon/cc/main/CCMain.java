package com.kwon.cc.main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class CCMain {
	public static void main(String[] args) {
		Socket s = null;
		Scanner keyboard = null;
		try {
			s = new Socket("172.16.1.100", 7897); // 접속될 때 까지 대기
			System.out.println("접속됨");
			
			keyboard = new Scanner(System.in);
			
			InputStream is = s.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			
			OutputStream os = s.getOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(os);
			BufferedWriter bw = new BufferedWriter(osw);
			
			JFrame f = new JFrame();
			f.setSize(300, 300);
			JTextArea ta = new JTextArea();
			ta.setEditable(false);
			f.add(ta);
			f.setVisible(true);
			
			new Thread() {
				public void run() {
					while (true) {
						try {
							ta.append(br.readLine()+"\r\n");
							//System.out.println( br.readLine()  );// 상대방이 보낼때까지 대기
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				};
			}.start();
			
			String txt = null;
			while (true) {
				System.out.print("내용 : ");
				txt = keyboard.next(); // 키보드 입력할때까지 대기
				bw.write("정균쨩] " + txt + "\r\n");
				bw.flush();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				keyboard.close();
				s.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
