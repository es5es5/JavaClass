
public class Pen {
	String name;
	int price;
	static String made = "�߱���";

	// �⺻ ������
	// 	���� ����� ���� ������ �ڵ����� �������
	public Pen() {
		System.out.println("���ο� ��ǰ�� ��ϵ�");
	}
	
	public void info() {
		System.out.printf("%s\n", name);
		System.out.printf("%d\n", price);
		System.out.printf("%s\n", made);
		
	}

}
