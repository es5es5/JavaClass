import java.util.Random;
import java.util.Scanner;

public class NGMain {

	public static void main(String[] args) {
		// ���� ���� �غ�
		Random r = new Random();

		int ans = r.nextInt(10000); // 0 ~ 9999 �߿� ����

		Scanner keyboard = new Scanner(System.in);

		int myAns = 0;
		int turn = 0;

		// ���� ���� ������ �ݺ�
		while (true) {
			turn++;

			System.out.printf("%d��° �õ� : ", turn);
			myAns = keyboard.nextInt();

			if (myAns == ans) {
				System.out.printf("%d�� ���� ����", turn);
				break;
			} else if (ans > myAns) {
				System.out.println("��");
			} else {
				System.out.println("�ٿ�");
			}
		}
	}
}
