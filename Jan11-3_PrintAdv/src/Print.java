import java.util.Scanner;

public class Print {

	public static void main(String[] args) {
		// 키보드 입력받을 준비
		Scanner keyboard = new Scanner(System.in);

		System.out.print("이름은 ? : ");
		String name = keyboard.next();

		System.out.print("나이는 ? : ");
		int age = keyboard.nextInt();

		System.out.print("키는 ? : ");
		double heigh = keyboard.nextDouble();

		System.out.print("몸무게는 ? : ");
		double weight = keyboard.nextDouble();
		
		// \n 줄만 바꿈
		// \r 캐리지 리턴 커서 맨 앞
		// 제대로 줄 바꾸기를 원하면 \r\n으로 적어야 함
		// \b 1byte 분량의 글자 지우기
		// (자바는 한 글자가 2byte라서 제대로 동작 안 함)
		
		System.out.printf("----------------\n");
		System.out.printf("이름\t: \"%s\"\n", name);
		System.out.printf("나이\t: \"%03d살\"\n", age);
		System.out.printf("키\t: \"%.1fcm\"\n", heigh);
		System.out.printf("몸무게\t: \"%.1fkg\"\n", weight);
		System.out.printf("----------------\n");
	}
}
