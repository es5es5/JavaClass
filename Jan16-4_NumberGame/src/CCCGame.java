import java.util.Random;
import java.util.Scanner;

public class CCCGame {

	public static void main(String[] args) throws Exception{
		Scanner keyboard = new Scanner(System.in);
		Random r = new Random();
		int com = 0;
		int me = 0;
		String[] table = { "", "����", "������", "����", "�Ʒ���", "������" };
		int miss = 0;

		while (true) {
			com = r.nextInt(5) + 1;

			System.out.println("\n\n---������ ������----");
			for (int i = 1; i < table.length; i++) {
				System.out.printf("%d. %s\n", i, table[i]);
			}
			System.out.println("------------------");

			System.out.println("�� : ");
			me = keyboard.nextInt();

			System.out.println("\n\n\n*---���---*");
			System.out.printf("�� : %s\n", table[me]);
			System.out.printf("�� : %s\n", table[com]);
			System.out.println("*---------*");

			if (me == com) {
				System.out.printf("�ɸ� %d���� ���ϱ���� ����\n", miss);
				break;
			} else {
				miss++;
				System.out.printf("%d���� ����\n", miss);
			}
			System.out.println("");
		}

	}

}
