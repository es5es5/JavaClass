import java.util.Random;
import java.util.Scanner;

public class NGMain {

	public static void main(String[] args) {
		// 랜덤 뽑을 준비
		Random r = new Random();

		int ans = r.nextInt(10000); // 0 ~ 9999 중에 랜덤

		Scanner keyboard = new Scanner(System.in);

		int myAns = 0;
		int turn = 0;

		// 정답 나올 때까지 반복
		while (true) {
			turn++;

			System.out.printf("%d번째 시도 : ", turn);
			myAns = keyboard.nextInt();

			if (myAns == ans) {
				System.out.printf("%d턴 만에 정답", turn);
				break;
			} else if (ans > myAns) {
				System.out.println("업");
			} else {
				System.out.println("다운");
			}
		}
	}
}
