import java.util.Scanner;

public class Atest {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println("x : ");
		int x = keyboard.nextInt();

		System.out.println("y : ");
		int y = keyboard.nextInt();

		int sum = x + y;
		int sub = x - y;
		int mul = x * y;
		double div = x / y;

		System.out.println("---------------");
		System.out.printf("%d + %d = %d\n", x, y, sum);
		System.out.printf("%d - %d = %d\n", x, y, sub);
		System.out.printf("%d * %d = %d\n", x, y, mul);
		System.out.printf("%d / %d = %.2f\n", x, y, div);

		if (sum % 2 == 0) {
			System.out.printf("합이 짝수 입니다.\n");
		}
	}

}
