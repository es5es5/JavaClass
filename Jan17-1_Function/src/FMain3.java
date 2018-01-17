
public class FMain3 {

	public static void test3(int[] cc) {
		for (int i:cc) {
			System.out.println(i);
		}
		
		cc = new int[] {1,2,3};
		for (int i : cc) {
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		int[] cc = {100, 200};
		test3(cc);
		System.out.println("----------------");
		for(int i : cc) {
			System.out.println(i);
		}
	}

}
