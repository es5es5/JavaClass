import java.util.Scanner;

public class Operator {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		int x = 10;

		// ���� ������ �� ��
		// ���� : 1 << 0 = 1
		// �������� : 1 << 1 = 2
		// ���� : 1 << 2 = 4
		// 24�ð� : 1 << 3 = 8
		// 13�̶�� ���� ���� : ����, ��������, 24�ð�
		x = x << 3;
		System.out.println(x);
	}

}
