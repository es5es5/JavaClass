package com.lhw.uc.main;

import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		// ���ڿ� ��ü
		String s = new String("��� �߿�");
		// s�� �ι�° ���� ���
		System.out.println(s.charAt(1));
		// s�� ù��° ���� ���
		System.out.println(s.charAt(0));
		// s�� ��ü ���� ��
		System.out.println(s.length());
		// s���� '��'��� ���ڰ� �� ��°�� �ֳ�
		System.out.println(s.indexOf("��"));
		// s�� '��'�ڷ� �����ϴ��� ����
		System.out.println(s.startsWith("��"));
		// s�� '��'�ڷ� �������� ����
		System.out.println(s.endsWith("��"));
		// s���� "��"�� "��"�� �ٲ㼭 ���
		System.out.println(s.replace("��", "��"));
		// s���� 2��° ���ں��� 4��° ���ڱ����� ���
		System.out.println(s.substring(1, 4));
		
		String s2 = "����,����,��";
		// ���ڿ� �и�
		String[] s3 = s2.split(",");
		
		for (String string : s3) {
			System.out.println(string);
		}
		
		StringTokenizer st = new StringTokenizer(s2, ",");
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());
		
		int age = 10;
		String name = "ȫ�浿";
		String s6 = String.format("�̸� : %s, ����: %d",  name,age);
		
		System.out.println(s6);
	}

}
