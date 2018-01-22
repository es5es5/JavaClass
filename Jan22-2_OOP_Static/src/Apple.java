
public class Apple {
	String name;
	int price;
	
	static final String PRODUCER = "애플";

	public void Info() {
		System.out.printf("품명 : %s\n", name);
		System.out.printf("가격 : %d원\n", price);
		System.out.printf("생산자 : %s\n", PRODUCER);
	}
}
