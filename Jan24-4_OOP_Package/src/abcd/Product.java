package abcd;

public abstract class Product {
	String name;
	int price;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Product(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}


	public void info() {
		System.out.printf("�̸� : %s", name);
		System.out.printf("���� : %d", price);
	}

}
