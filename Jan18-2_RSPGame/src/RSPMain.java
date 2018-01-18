import java.util.Random;
import java.util.Scanner;

public class RSPMain {

	public static void doRSP() throws Exception{

		Scanner keyboard = new Scanner(System.in);

		Random r = new Random();

		int com = 4;
		int me = 4;
		int wins = 0;
		int result = 4;
		String[] handTable = { "", "����", "����", "��" };

		while (true) {
			System.out.println("\n\n-------");

			for (int i = 1; i < handTable.length; i++) {
				System.out.printf("%d. %s\n", i, handTable[i]);
			}
			System.out.println("-------");
			System.out.print("���Ұ� : ");
			com = r.nextInt(3) + 1; // 1 ���� 2���� 3��
			me = keyboard.nextInt();
			result = me - com;

			System.out.println("\n\n\n*---���---*");
			System.out.printf("�� : %s\n", handTable[me]);
			System.out.printf("�� : %s\n", handTable[com]);
			System.out.println("*---------*");

			if (result == 0) {
				System.out.println("���º�");
				wins = 0;
			} else if (result == -1 || result == 2) {
				System.out.printf("�й� %d���±��� ����.\n", wins);
				Thread.sleep(5000);
				break;
			} else {
				wins++;
				System.out.printf("%s���� ��..", wins);
			}

		}
	}
	
	public static void main(String[] args) throws Exception {
		doRSP();
	}
}
