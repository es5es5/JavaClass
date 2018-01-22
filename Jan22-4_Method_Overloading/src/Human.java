
public class Human {
	public static void sum(double a, double b) {
		System.out.printf("%f", a+b);
	}
	
	public static void sum(double a, double b, double c) {
		System.out.printf("%f", a+b+c);
	}
	
	public static void sum(String a, String b) {
		System.out.printf("%s%s", a, b);
	}
	
	// 숫자 몇 개를 넣던지 다 곱하는 메소드
	public static void mul(int... a) {
		int gob = 1;
		for (int i = 0; i < a.length; i++) {
			gob *= a[i];
		}
		System.out.println(gob);
	}
	
	public static void doublePrint(double... a) {
		for (int i =0; i<a.length; i++) {
			System.out.println(a[i]);
		}
	}
	
	
}
