// �̻��� �Ҽ���

package com.lhw.os.main;

import com.lhw.os.human.Human;
import com.lhw.os.human.PowerRanger;
import com.lhw.os.space.Planet;

public class Main {
	public static void main(String[] args) {
		// �̸��� ������ �༺ �����
		Planet p1 = new Planet("����");
		
		// ����� 100
		p1.setSize(100);
		
		// �̸��� ȫ�浿�� ��� �����
		Human h1 = new Human("ȫ�浿");
		
		// ������ ȫ�浿�� ����
		p1.add(h1);
		
		// �Ŀ������� �����
		PowerRanger pr1 = new PowerRanger();

		// ȫ�浿�� ���� ������ �Ŀ�������1
		h1.pickMyHero(pr1);
		
		// ȫ�浿�� ���� ��û
		h1.helpMe();
		
		// ���� ���̰�
		p1.setVisible(true);
		
		
	}
}
