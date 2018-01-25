package com.lhw.bimancheck.bimanframe;

import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

// 상속 : 기능 다 물려받고, 추가 확장
public class BimandoFrame extends JFrame {
	private JLabel heightLB; // 글자 적혀있는 칸
	private JTextField heightTF; // 글자 적는 박스

	private JLabel weightLB; // 글자 적혀있는 칸
	private JTextField weightTF; // 글자 적는 박스

	private JLabel resultLB;
	private JButton btn;

	public BimandoFrame() {
		// TODO Auto-generated constructor stub
	}

	public BimandoFrame(String title) throws HeadlessException {
		super(title);
		JButton j = new JButton("asd");
		GridLayout gl = new GridLayout(3, 2, 50, 10);
		this.setLayout(gl);

		heightLB = new JLabel("키 : ");
		this.add(heightLB);

		heightTF = new JTextField();
		this.add(heightTF);

		weightLB = new JLabel("몸무게 : ");
		this.add(weightLB);

		weightTF = new JTextField();
		this.add(weightTF);

		resultLB = new JLabel("결과 : ");
		this.add(resultLB);

		btn = new JButton("결과보기");
		this.add(btn);
		
		Doctor d = new Doctor();
		btn.addActionListener(d);
	}

	// 멤버 내부 클래스(member inner class)
	private class Doctor implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// heightTF에 적은거 가져오기
			// heightTF의 text 속성 가져오기
			String h = heightTF.getText();
			String w = weightTF.getText();
			
			// String -> double
			double hh = Double.parseDouble(h);
			double ww = Double.parseDouble(w);
			
			hh /= 100;
			double bmi = ww/(hh*hh);
			

			if (bmi > 25.0) {
				resultLB.setText("비만");
			} else if (bmi > 23.0 && bmi < 24.9) {
				resultLB.setText("정상");

			} else if (bmi > 18.5 && bmi < 22.9) {
				resultLB.setText("저체중");

			}
			
			
			System.out.println(heightTF.getText());
			System.out.println(weightTF.getText());
			
		}

	}
}
