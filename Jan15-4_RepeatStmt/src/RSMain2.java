// 답이 짝수인 것만 출력

public class RSMain2 {
	public static void main(String[] args) throws Exception {

//		System.out.println("-----------------");
//
//		for (int dan2 = 2; dan2 <= 9; dan2++) {
//			System.out.println(dan2);
//			for (int j = 1; j <= 9; j++) {
//				if ((dan2 * j) % 2 == 0) {
//					System.out.printf("%d x %d = %d\n", dan2, j, (dan2 * j));
//				}
//			}
//		}
		
		System.out.println("----------------");
		
		for (int dan3 = 1; dan3 <=9; dan3++) {
			for (int i=2; i<=9; i++) {
				System.out.printf("%2d x %d = %2d\t", i, dan3, (dan3*i));
				if (i==9) {
					System.out.println("");
				}
			}
		}
	}
}