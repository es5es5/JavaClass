package Gejang;

public class Gejang {
	String name;
	int price;
	double weight;
	static Producer producer = new Producer("�����", 60);
	
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
		System.out.printf("�̸� : %s\n", name);
		System.out.printf("���� : %d\n", price);
		System.out.printf("���� : %f\n", weight);
	}
}
