package com.lhw.am.jugong101;
// ���� ������
//	����� ���� ������ ����
// 	public		: �ƹ������� ���� ����
// 	protected	: ���� ��Ű�� or �ٸ� ��Ű����� ���� Ŭ�������� ���� ���� <-- ���Ҹ��� �� ���Ŷ� �� �Ȱ���. Java������ ����
//	�� ����(default, friendly)	: ���� ��Ű�������� ���� ����
// 	private : Ŭ���� ���ο����� ���� ����

public class Jugong101 {
	public String name;
	protected int password;
	int recycle;
	private int money;
	
	public Jugong101() {
		// TODO Auto-generated constructor stub
	}
	
	public Jugong101(String name, int password, int recycle, int money) {
		super();
		this.name = name;
		this.password = password;
		this.recycle = recycle;
		this.money = money;
	}

	public void info() {
		System.out.printf("�̸� : %s", name);
		System.out.printf("��� : %d", password);
		System.out.printf("�и������� : %d", recycle);
		System.out.printf("��� : %d", money);
	}

}
