import java.util.Scanner;

public class papercup {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.print("��ǰ��ȣ : ");
		int number = keyboard.nextInt();
		
		System.out.print("ǰ�� : ");
		String name = keyboard.next();
		
		System.out.print("���� : ");
		int price = keyboard.nextInt();
		
		System.out.print("���� : ");
		double weight = keyboard.nextDouble();
		
		System.out.print("������ : ");
		String from = keyboard.next();
		
		System.out.printf("%05d)----------------\n", number);
		System.out.printf("\t��ǰ��\t: \"%s\"\n", name);
		System.out.printf("\t����\t: \"%d��\"\n", price);
		System.out.printf("\t����\t: \"%.1fg\"\n", weight);
		System.out.printf("\tMade in %s", from);
	}
}
