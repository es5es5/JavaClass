
public class Operator2 {

	public static void main(String[] args) {
		int height = 180;
		int age = 30;

		// ���̰� 8�� ������ "�������.", �ȵǸ� "����.".
		String msg = (age > 8) ? "�������" : "����";
		System.out.println(msg);

		int money = ((height >= 200) || (age > 20)) ? 10000 : 5000;

		int discount = (age % 2 == 0) ? 500 : 450;
		System.out.println(money - discount);
		
	}

}
