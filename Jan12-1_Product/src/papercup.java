import java.util.Scanner;

public class papercup {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.print("상품번호 : ");
		int number = keyboard.nextInt();
		
		System.out.print("품명 : ");
		String name = keyboard.next();
		
		System.out.print("가격 : ");
		int price = keyboard.nextInt();
		
		System.out.print("무게 : ");
		double weight = keyboard.nextDouble();
		
		System.out.print("원산지 : ");
		String from = keyboard.next();
		
		System.out.printf("%05d)----------------\n", number);
		System.out.printf("\t제품명\t: \"%s\"\n", name);
		System.out.printf("\t가격\t: \"%d원\"\n", price);
		System.out.printf("\t무게\t: \"%.1fg\"\n", weight);
		System.out.printf("\tMade in %s", from);
	}
}
