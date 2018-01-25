package com.lhw.os.main;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JTextField;


public class Main2 {

	public static void main(String[] args) {
		
		// 타이틀이 지구인 JFrame 만들기
//		Planet p1 = new Planet("지구");
		JFrame jf1 = new JFrame("지구");
		jf1.setSize(300, 400);
		
		JButton jb1 = new JButton("홍길동");
		jf1.add(jb1);
		
		Flashman f = new Flashman();
		
		jb1.addActionListener(f);
		
		
		jf1.setVisible(true);
		
		
	}
}
