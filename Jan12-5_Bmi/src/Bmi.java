import java.util.Scanner;

public class Bmi {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.print("이름은 ? : ");
		String name = keyboard.next();

		System.out.print("키는 ? : ");
		double heigh = keyboard.nextDouble();
		double bmiheigh = heigh;
		
		if (heigh > 3) {
			bmiheigh = heigh/100;
		}
		
		System.out.print("몸무게는 ? : ");
		double weight = keyboard.nextDouble();

		double standard = (heigh - 100) * 0.9;
		double biman = (weight / standard) * 100;
		double bmi = ((weight) / (bmiheigh * bmiheigh));

		System.out.printf("\n----------------\n");
		System.out.printf("이름\t: \"%s\"\n", name);
		System.out.printf("키\t: \"%.1fcm\"\n", heigh);
		System.out.printf("몸무게\t: \"%.1fkg\"\n", weight);
		System.out.printf("표준체중\t: \"%.2f\"\n", standard);
		System.out.printf("비만도\t: \"%.2f\"\n", biman);
		System.out.printf("BMI\t: \"%.2f\"\n", bmi);

		String result = "저체중";
		

		if (bmi > 25.0) {
			result = "비만";
		} else if (bmi > 23.0 && bmi < 24.9) {
			result = "과체중";
		} else if (bmi > 18.5 && bmi < 22.9) {
			result = "정상";
		}
		
		System.out.printf("%s님은 %s입니다.", name, result);
		System.out.printf("\n----------------\n");
		
		keyboard.next();
	}
}
