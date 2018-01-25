package com.lhw.os.main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// 파워레인저 is a 영웅
// 후레시맨 is a ActionListener
public class Flashman implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("롤링발칸");
	}
}
