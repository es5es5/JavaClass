import java.util.Scanner;

public class Bmi {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.print("�̸��� ? : ");
		String name = keyboard.next();

		System.out.print("Ű�� ? : ");
		double heigh = keyboard.nextDouble();
		double bmiheigh = heigh;
		
		if (heigh > 3) {
			bmiheigh = heigh/100;
		}
		
		System.out.print("�����Դ� ? : ");
		double weight = keyboard.nextDouble();

		double standard = (heigh - 100) * 0.9;
		double biman = (weight / standard) * 100;
		double bmi = ((weight) / (bmiheigh * bmiheigh));

		System.out.printf("\n----------------\n");
		System.out.printf("�̸�\t: \"%s\"\n", name);
		System.out.printf("Ű\t: \"%.1fcm\"\n", heigh);
		System.out.printf("������\t: \"%.1fkg\"\n", weight);
		System.out.printf("ǥ��ü��\t: \"%.2f\"\n", standard);
		System.out.printf("�񸸵�\t: \"%.2f\"\n", biman);
		System.out.printf("BMI\t: \"%.2f\"\n", bmi);

		String result = "��ü��";
		

		if (bmi > 25.0) {
			result = "��";
		} else if (bmi > 23.0 && bmi < 24.9) {
			result = "��ü��";
		} else if (bmi > 18.5 && bmi < 22.9) {
			result = "����";
		}
		
		System.out.printf("%s���� %s�Դϴ�.", name, result);
		System.out.printf("\n----------------\n");
		
		keyboard.next();
	}
}
