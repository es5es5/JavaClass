import java.util.Scanner;

public class Money {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.print("�Ž����� : ");
		int input = keyboard.nextInt();
		
		System.out.println("\n----------------");

		if (input >= 50000) {
			int c50000 = input / 50000;
			System.out.printf("5������ : %d��\n", c50000);
			input %= 50000;
		}
		if (input >= 10000) {
			int c10000 = input / 10000;
			System.out.printf("1������ : %d��\n", c10000);
			input %= 10000;
		}
		if (input >= 5000) {
			int c5000 = input / 5000;
			System.out.printf("5õ���� : %d��\n", c5000);
			input %= 5000;
		}
		if (input >= 1000) {
			int c1000 = input / 1000;
			System.out.printf("1õ���� : %d��\n", c1000);
			input %= 1000;
		}
		if (input >= 500) {
			int c500 = input / 500;
			System.out.printf("5��� : %d��\n", c500);
			input %= 500;
		}
		if (input >= 100) {
			int c100 = input / 100;
			System.out.printf("1��� : %d��\n", c100);
			input %= 100;
		}
		if (input >= 50) {
			int c50 = input / 50;
			System.out.printf("5�ʿ� : %d��\n", c50);
			input %= 50;
		}
		if (input >= 10) {
			int c10 = input / 10;
			System.out.printf("1�ʿ� : %d��\n", c10);
			input %= 10;
		}
		if (input >= 5) {
			int c5 = input / 5;
			System.out.printf("5�� : %d��\n", c5);
			input %= 5;
		}
		if (input >= 1) {
			int c1 = input / 1;
			System.out.printf("1�� : %d��\n", c1);
			input %= 1;
		}

	}

}
