import java.util.Scanner;

public class BM {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.print("�̸��� ? : ");
		String name = keyboard.next();

		System.out.print("Ű�� ? : ");
		double heigh = keyboard.nextDouble();

		System.out.print("�����Դ� ? : ");
		double weight = keyboard.nextDouble();

		double standard = (heigh - 100) * 0.9;
		double biman = (weight / standard) * 100;

		System.out.printf("----------------\n");
		System.out.printf("�̸�\t: \"%s\"\n", name);
		System.out.printf("Ű\t: \"%.1fcm\"\n", heigh);
		System.out.printf("������\t: \"%.1fkg\"\n", weight);
		System.out.printf("ǥ��ü��\t: \"%.2f\"\n", standard);
		System.out.printf("�񸸵�\t: \"%.2f\"\n", biman);

		if (biman > 120) {
			System.out.println("���Դϴ�.");
		}
		System.out.printf("----------------\n");

	}

}
