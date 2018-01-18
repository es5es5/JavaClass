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
		String[] handTable = { "", "가위", "바위", "보" };

		while (true) {
			System.out.println("\n\n-------");

			for (int i = 1; i < handTable.length; i++) {
				System.out.printf("%d. %s\n", i, handTable[i]);
			}
			System.out.println("-------");
			System.out.print("뭐할거 : ");
			com = r.nextInt(3) + 1; // 1 가위 2바위 3보
			me = keyboard.nextInt();
			result = me - com;

			System.out.println("\n\n\n*---결과---*");
			System.out.printf("나 : %s\n", handTable[me]);
			System.out.printf("컴 : %s\n", handTable[com]);
			System.out.println("*---------*");

			if (result == 0) {
				System.out.println("무승부");
				wins = 0;
			} else if (result == -1 || result == 2) {
				System.out.printf("패배 %d연승까지 했음.\n", wins);
				Thread.sleep(5000);
				break;
			} else {
				wins++;
				System.out.printf("%s연승 중..", wins);
			}

		}
	}
	
	public static void main(String[] args) throws Exception {
		doRSP();
	}
}
