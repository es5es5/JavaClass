
public class Product {
	String name;
	int price;
	String maker;

	public void printInfo() {
		System.out.printf("품명 : %s\n", name);
		System.out.printf("가격 : %d\n", price);
		System.out.printf("원산지 : %s\n", maker);
	}

}
