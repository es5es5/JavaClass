package com.lhw.bimancheck.bimanframe;

import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

// ��� : ��� �� �����ް�, �߰� Ȯ��
public class BimandoFrame extends JFrame {
	private JLabel heightLB; // ���� �����ִ� ĭ
	private JTextField heightTF; // ���� ���� �ڽ�

	private JLabel weightLB; // ���� �����ִ� ĭ
	private JTextField weightTF; // ���� ���� �ڽ�

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

		heightLB = new JLabel("Ű : ");
		this.add(heightLB);

		heightTF = new JTextField();
		this.add(heightTF);

		weightLB = new JLabel("������ : ");
		this.add(weightLB);

		weightTF = new JTextField();
		this.add(weightTF);

		resultLB = new JLabel("��� : ");
		this.add(resultLB);

		btn = new JButton("�������");
		this.add(btn);
		
		Doctor d = new Doctor();
		btn.addActionListener(d);
	}

	// ��� ���� Ŭ����(member inner class)
	private class Doctor implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// heightTF�� ������ ��������
			// heightTF�� text �Ӽ� ��������
			String h = heightTF.getText();
			String w = weightTF.getText();
			
			// String -> double
			double hh = Double.parseDouble(h);
			double ww = Double.parseDouble(w);
			
			hh /= 100;
			double bmi = ww/(hh*hh);
			

			if (bmi > 25.0) {
				resultLB.setText("��");
			} else if (bmi > 23.0 && bmi < 24.9) {
				resultLB.setText("����");

			} else if (bmi > 18.5 && bmi < 22.9) {
				resultLB.setText("��ü��");

			}
			
			
			System.out.println(heightTF.getText());
			System.out.println(weightTF.getText());
			
		}

	}
}
