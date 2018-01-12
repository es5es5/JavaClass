import java.util.Scanner;

public class BM {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.print("이름은 ? : ");
		String name = keyboard.next();

		System.out.print("키는 ? : ");
		double heigh = keyboard.nextDouble();

		System.out.print("몸무게는 ? : ");
		double weight = keyboard.nextDouble();

		double standard = (heigh - 100) * 0.9;
		double biman = (weight / standard) * 100;

		System.out.printf("----------------\n");
		System.out.printf("이름\t: \"%s\"\n", name);
		System.out.printf("키\t: \"%.1fcm\"\n", heigh);
		System.out.printf("몸무게\t: \"%.1fkg\"\n", weight);
		System.out.printf("표준체중\t: \"%.2f\"\n", standard);
		System.out.printf("비만도\t: \"%.2f\"\n", biman);

		if (biman > 120) {
			System.out.println("비만입니다.");
		}
		System.out.printf("----------------\n");

	}

}
