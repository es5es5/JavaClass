import java.util.Scanner;

public class Variable1 {
	public static void main(String[] args) {
		
		// 키보드 입력 받을 준비
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("나이 : ");
		
		// 키보드로 적은 숫자가 age에 저장
		// 사람 나이를 저장할 변수
		int age = keyboard.nextInt();
		System.out.println("나이는 " + age +"살");
	}
}
