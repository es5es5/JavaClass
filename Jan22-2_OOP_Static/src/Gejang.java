
// �޸�
// .java(�ҽ�) -> .class(����) -> �����ϸ�
// 1. ����� ���� �� �ҽ��� stack�� �� �Ǹ�
// 2. static ��� �������� static�� �� �Ǹ�
// 3. main���� ���� ����
public class Gejang {
	String name;
	int weight;
	int price;
	
	// ���� �Ӽ��� �޸� ���� ���� ���ؼ� static
	static String producer = "�����";
	
	static final String PRODUCER2 = "�����";
	
	public void Info() {
		System.out.printf("ǰ�� : %s\n", name);
		System.out.printf("���� : %d��\n", price);
		System.out.printf("���� : %dkg\n", weight);
		System.out.printf("������ : %s\n", producer);
	}
}