
public class Calculator {
	// 표현할 속성이 없어서 멤버 변수 없음 -> 멤버 변수 없으면 객체 만들 필요 없음.

	// 멤버 변수 없어서 메소드에 static 붙이면 객체 안 안만들고도 쓸 수 있는 메소드가 됨.
	
	public static double sum(double a, double b) {
		return a + b;
	}

	public static double sub(double a, double b) {
		return a - b;
	}
}
