
public class RCMain {

	public static int factorial(int i) {
		return (i == 1) ? 1 : i * factorial(i - 1);
	}

	public static int fibo(int i) {
		return (i == 1 || i == 2) ? 1 : fibo(i - 1) + fibo(i - 2);
	}
	public static int cc(int i) {
		return (i <= 3) ? i : cc(i - 1) * cc(i - 2) * cc(i - 3);
	}
	

	public static void main(String[] args) {
		System.out.println(factorial(10));
		System.out.println(fibo(3));
		System.out.println(cc(0));
	}

}
