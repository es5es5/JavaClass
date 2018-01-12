
public class Operator1 {

	public static void main(String[] args) {
		int xx = 10;
		int yy = 20;

		// 논리 연산자
		boolean a = xx > yy;
		System.out.println(a);

		// & 얘는 연산 끝까지 다 함 && 얘는 앞에거 결과 고려해서 뒤에거 연산할지 말지 정함
		// 결합 연산자 : 논리 연산 여러개 묶을 때
		// xx가 5보다 크고, yy가 30보다 작냐
		boolean b = (xx > 5) && (yy < 30);
		System.out.println(b);

		// xx가 5보다 크거나, yy가 30보다 작냐
		boolean c = (xx > 5) || (yy < 30);

		int height = 180;
		int age = 30;

		// 나이가 10이상이고, 키가 200 넘으면 타도됨
		// 확률 낮은 거를 앞 쪽으로 배치하면 연산 횟수를 줄일 수 있음
		boolean ok = (height > 200) && (age >= 10);
		System.out.println(ok);

		// 나이가 10살 이상이거나, 키가 200넘으면 타도됨
		boolean ok2 = (age >= 10) || (height > 200);
		System.out.println(ok2);

		// ^ (XOR) : A ^ B : A나 B나 둘 중에 '하나만' 만족해야 True
		// A, B 둘의 결과가 다를 때 True
		boolean ok3 = (age >= 10) ^ (height > 200);
		System.out.println(ok3);
	}

}
