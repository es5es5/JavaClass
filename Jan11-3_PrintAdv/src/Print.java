import java.util.Scanner;

public class Print {

	public static void main(String[] args) {
		// Ű���� �Է¹��� �غ�
		Scanner keyboard = new Scanner(System.in);

		System.out.print("�̸��� ? : ");
		String name = keyboard.next();

		System.out.print("���̴� ? : ");
		int age = keyboard.nextInt();

		System.out.print("Ű�� ? : ");
		double heigh = keyboard.nextDouble();

		System.out.print("�����Դ� ? : ");
		double weight = keyboard.nextDouble();
		
		// \n �ٸ� �ٲ�
		// \r ĳ���� ���� Ŀ�� �� ��
		// ����� �� �ٲٱ⸦ ���ϸ� \r\n���� ����� ��
		// \b 1byte �з��� ���� �����
		// (�ڹٴ� �� ���ڰ� 2byte�� ����� ���� �� ��)
		
		System.out.printf("----------------\n");
		System.out.printf("�̸�\t: \"%s\"\n", name);
		System.out.printf("����\t: \"%03d��\"\n", age);
		System.out.printf("Ű\t: \"%.1fcm\"\n", heigh);
		System.out.printf("������\t: \"%.1fkg\"\n", weight);
		System.out.printf("----------------\n");
	}
}
