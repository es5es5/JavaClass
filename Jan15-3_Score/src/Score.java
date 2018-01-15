import java.util.Scanner;

public class Score {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.print("중간고사 : ");
		double mid = keyboard.nextDouble();

		System.out.print("기말고사 : ");
		double fin = keyboard.nextDouble();

		double avg = (mid + fin) / 2;

		System.out.println("-----------------");
		System.out.printf("평균 : %.1f\n", avg);

		if (avg >= 90) {
			System.out.println("수");
		} else if (avg >= 80) {
			System.out.println("우");
		} else if (avg >= 60) {
			System.out.println("미");
		} else if (avg >= 50) {
			System.out.println("양");
		} else if (avg >= 40) {
			System.out.println("가");
		}
	}

}
