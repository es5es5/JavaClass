package com.lhw.uc.main;

public class Main3 {

	public static void main(String[] args) {
		
		// �⺻���� ��ü���� ���� �� ����ϴ� Ŭ����
		// Wrapper Class
		int a = 10; // Stack
		Integer aa = new Integer(10); // Heap
		int aaa = aa.intValue(); // Wrapper -> �⺻��
		
		double b = 0.1;
		Double bb = new Double(b); // �⺻�� -> Wrapper
		
		// autoboxing, autounboxing
		Integer cc = 1;
		int ccc = cc;
		
		
		// �⺻�� -> String
		int d = 123;
		String dd = d + ""; // String.format()
		String ddd = String.format("����������%d", d);
		
		// String -> �⺻��, �ܰ踦 ���ļ�
		String e = "3.141592";
		Double ee = Double.parseDouble(e);
		double eee = ee.doubleValue();

		// String -> �⺻��, �ֽ���
		String f = "23";
		int ff = Integer.parseInt(f);
		
	}

}
