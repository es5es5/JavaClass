package com.lhw.io.main;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		// ��ġ -> ���α׷����� �Է�
		// InputStream : ��ġ���� ���Ƴ��� ���� (1byte)
		// InputStreamReader : 2byte
		// BufferedReader : �� �پ�

		// OutputStream : ��ġ���� ����� ���� (1byte)
		// OutputStreamWriter : 2byte
		// BufferedWriter : �� �پ�

		// Ư��������
		// PrintWriter : BufferedWriter����, ����ϱ� ����
		// PrintStream : BufferedWriter����, ����ϱ� ����
		// FileWriter, ...

		BufferedWriter bw = null; // main �� �ȿ��� bw ������ ����ϱ� ���� try �ۿ��� ���� (�ʱ�ȭ�� �⺻)
		try {

			// ��ΰ� �� �� �ǰų� ���� ���� ���� ������ ���� �� ������ try catch �̿�
			FileWriter fw = new FileWriter("C:\\Users\\soldesk\\Desktop\\test.txt");

//			System.out.println(10 / 0); // �갡 ������ catch�� �������°� ����

			bw = new BufferedWriter(fw);
			String str = "����������";
			bw.write(str);
			bw.flush(); // ���� �뷮��ŭ �����͸� ��ä���� ������ �ұ�
		} catch (Exception e) {
			System.out.println("������ 0 ������");
		} finally {
			try {
				bw.close();
			} catch (IOException e) {
				System.out.println("bw�� ����");
			}
		}
	}
}
