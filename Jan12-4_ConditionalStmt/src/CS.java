
public class CS {

	public static void main(String[] args) {
		int age = 10;

		// 나이가 70이상이면 "아이구 어르신" 출력
		if (age >= 70) {
			System.out.println("어이구 어르신");
		}

		// 나이가 홀수이고, 10살 미만이면 ㅋㅋㅋ 출력
		if ((age % 2 == 1) && (age < 10)) {
			System.out.println("ㅋㅋㅋㅋ");
		}

		// 나이가 30살 미만이고, 나이가 2살 미만이면 ㅎㅎㅎ 출력
		if ((age < 30) && (age < 2)) {
			System.out.println("ㅎㅎㅎㅎ");
		}
		
		System.out.println("어서오세요");
	}

}
