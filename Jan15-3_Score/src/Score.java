import java.util.Scanner;

public class Score {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.print("�߰���� : ");
		double mid = keyboard.nextDouble();

		System.out.print("�⸻��� : ");
		double fin = keyboard.nextDouble();

		double avg = (mid + fin) / 2;

		System.out.println("-----------------");
		System.out.printf("��� : %.1f\n", avg);

		if (avg >= 90) {
			System.out.println("��");
		} else if (avg >= 80) {
			System.out.println("��");
		} else if (avg >= 60) {
			System.out.println("��");
		} else if (avg >= 50) {
			System.out.println("��");
		} else if (avg >= 40) {
			System.out.println("��");
		}
	}

}
