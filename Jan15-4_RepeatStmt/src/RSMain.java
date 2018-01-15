import javax.swing.event.TreeWillExpandListener;

public class RSMain {

	public static void main(String[] args) throws Exception {
		for (int i = 0; i < 2; i++) {
			System.out.println("2");
		}

		System.out.println("-----------------");
		
		for (int i = 0; i < 10; i += 2) {
			System.out.println(i);
			Thread.sleep(1000);
		}
		
		System.out.println("-----------------");
		
//		for (int i = 0; true; i++) {
//			System.out.println(i);
//			Thread.sleep(1000);
//		}
		
		for (int e = 9; e >= 0; e -= 3) {
			System.out.printf("4 x %d = %d\n", e, (4*e));
		}
	}

}
