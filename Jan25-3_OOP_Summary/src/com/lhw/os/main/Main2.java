package com.lhw.os.main;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JTextField;


public class Main2 {

	public static void main(String[] args) {
		
		// Ÿ��Ʋ�� ������ JFrame �����
//		Planet p1 = new Planet("����");
		JFrame jf1 = new JFrame("����");
		jf1.setSize(300, 400);
		
		JButton jb1 = new JButton("ȫ�浿");
		jf1.add(jb1);
		
		Flashman f = new Flashman();
		
		jb1.addActionListener(f);
		
		
		jf1.setVisible(true);
		
		
	}
}
