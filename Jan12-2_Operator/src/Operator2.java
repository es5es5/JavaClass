
public class Operator2 {

	public static void main(String[] args) {
		int height = 180;
		int age = 30;

		// 나이가 8살 넘으면 "어서오세요.", 안되면 "나가.".
		String msg = (age > 8) ? "어서오세요" : "나가";
		System.out.println(msg);

		int money = ((height >= 200) || (age > 20)) ? 10000 : 5000;

		int discount = (age % 2 == 0) ? 500 : 450;
		System.out.println(money - discount);
		
	}

}
