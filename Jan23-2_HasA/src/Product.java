
public class Product {
	String name;
	int price;
	Company maker;

	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	public Product(String name, int price, Company maker) {
		super();
		this.name = name;
		this.price = price;
		this.maker = maker;
	}

	public void info() {
		System.out.printf("상품이름 : %s\n", name);
		System.out.printf("가격 : %d\n", price);
		if (maker != null) {
			maker.info();
		}
	}
}
