package Gejang;

public class Gejang {
	String name;
	int price;
	double weight;
	static Producer producer = new Producer("김수미", 60);
	
	public Gejang() {
		// TODO Auto-generated constructor stub
	}

	public Gejang(String name, int price, double weight) {
		super();
		this.name = name;
		this.price = price;
		this.weight = weight;
	}
	
	public void info() {
		System.out.printf("이름 : %s\n", name);
		System.out.printf("가격 : %d\n", price);
		System.out.printf("무게 : %f\n", weight);
	}
}
