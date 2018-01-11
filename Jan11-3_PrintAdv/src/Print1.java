
public class Print1 {
	public static void main(String[] args) {

		int a = 10;
		double b = 10.15515;
		String c = "abc";

		// 출력 형식을 잡을 때 사용
		System.out.printf("a의 값은 %4d이요.\n"
				+ "b는 %.2f요.\n"
				+ "c는 %s요.\n", a, b, c);
	}
}
