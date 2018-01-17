
public class FMain2 {

	public static void add(int a, int b) {
		int c = a + b;
		System.err.println(c);
	}

	public static void test(int i, double d) {
		i = 500;
		d = 2.2;
		System.out.println(i);
		System.out.println(d);
	}

	public static void test2(int aa, int[] bb) {
		System.out.println(aa);
		aa = 1000;
		System.out.println(aa);
		System.out.println("---------");
		for (int i : bb) {
			System.out.println(i);
		}
		bb[0] = 1000;
		for (int i:bb) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
//		add(1, 2);
//		int i = 20;
//		double d = 1.1;
//		test(i, d);
//		System.out.println(i);
//		System.out.println(d);
		
//		int aa = 20;
//		int[] bb = {10, 20};
//		test2(aa,bb);
//		System.out.println(aa);
//		for (int i : bb) {
//			System.out.println(i);
		
//		}
		int aa[] = {20, 30};
		for (int i : aa) {
			System.out.println(i);
		}
	}
}
