
public class CS {

	public static void main(String[] args) {
		int age = 10;

		// ���̰� 70�̻��̸� "���̱� ���" ���
		if (age >= 70) {
			System.out.println("���̱� ���");
		}

		// ���̰� Ȧ���̰�, 10�� �̸��̸� ������ ���
		if ((age % 2 == 1) && (age < 10)) {
			System.out.println("��������");
		}

		// ���̰� 30�� �̸��̰�, ���̰� 2�� �̸��̸� ������ ���
		if ((age < 30) && (age < 2)) {
			System.out.println("��������");
		}
		
		System.out.println("�������");
	}

}
