package Product;

class Laptop extends Computer{
	double weight;
	int battery;
	
	@Override
	public void info() {
		super.info();
		
		System.out.printf("���� : %f", weight);
		System.out.printf("���͸� : %d", battery);
	}
}
