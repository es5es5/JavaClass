import java.util.Random;
import java.util.Scanner;

public class CCCGame {

	public static void main(String[] args) throws Exception{
		Scanner keyboard = new Scanner(System.in);
		Random r = new Random();
		int com = 0;
		int me = 0;
		String[] table = { "", "왼쪽", "오른쪽", "위쪽", "아래쪽", "가만히" };
		int miss = 0;

		while (true) {
			com = r.nextInt(5) + 1;

			System.out.println("\n\n---방향을 고르세요----");
			for (int i = 1; i < table.length; i++) {
				System.out.printf("%d. %s\n", i, table[i]);
			}
			System.out.println("------------------");

			System.out.println("뭐 : ");
			me = keyboard.nextInt();

			System.out.println("\n\n\n*---결과---*");
			System.out.printf("나 : %s\n", table[me]);
			System.out.printf("컴 : %s\n", table[com]);
			System.out.println("*---------*");

			if (me == com) {
				System.out.printf("걸림 %d연속 피하기까지 성공\n", miss);
				break;
			} else {
				miss++;
				System.out.printf("%d연속 피함\n", miss);
			}
			System.out.println("");
		}

	}

}
