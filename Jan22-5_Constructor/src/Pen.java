
public class Pen {
	String name;
	int price;
	static String made = "중국산";

	// 기본 생성자
	// 	직접 만들어 놓지 않으면 자동으로 만들어줌
	public Pen() {
		System.out.println("새로운 상품이 등록됨");
	}
	
	public void info() {
		System.out.printf("%s\n", name);
		System.out.printf("%d\n", price);
		System.out.printf("%s\n", made);
		
	}

}
