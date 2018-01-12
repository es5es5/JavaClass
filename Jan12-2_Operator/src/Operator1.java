
public class Operator1 {

	public static void main(String[] args) {
		int xx = 10;
		int yy = 20;

		// �� ������
		boolean a = xx > yy;
		System.out.println(a);

		// & ��� ���� ������ �� �� && ��� �տ��� ��� ����ؼ� �ڿ��� �������� ���� ����
		// ���� ������ : �� ���� ������ ���� ��
		// xx�� 5���� ũ��, yy�� 30���� �۳�
		boolean b = (xx > 5) && (yy < 30);
		System.out.println(b);

		// xx�� 5���� ũ�ų�, yy�� 30���� �۳�
		boolean c = (xx > 5) || (yy < 30);

		int height = 180;
		int age = 30;

		// ���̰� 10�̻��̰�, Ű�� 200 ������ Ÿ����
		// Ȯ�� ���� �Ÿ� �� ������ ��ġ�ϸ� ���� Ƚ���� ���� �� ����
		boolean ok = (height > 200) && (age >= 10);
		System.out.println(ok);

		// ���̰� 10�� �̻��̰ų�, Ű�� 200������ Ÿ����
		boolean ok2 = (age >= 10) || (height > 200);
		System.out.println(ok2);

		// ^ (XOR) : A ^ B : A�� B�� �� �߿� '�ϳ���' �����ؾ� True
		// A, B ���� ����� �ٸ� �� True
		boolean ok3 = (age >= 10) ^ (height > 200);
		System.out.println(ok3);
	}

}
