import java.util.Scanner;

public class Operator {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		int x = 10;

		// 다중 선택할 때 편리
		// 주차 : 1 << 0 = 1
		// 와이파이 : 1 << 1 = 2
		// 흡연실 : 1 << 2 = 4
		// 24시간 : 1 << 3 = 8
		// 13이라는 값을 쓰면 : 주차, 와이파이, 24시간
		x = x << 3;
		System.out.println(x);
	}

}
