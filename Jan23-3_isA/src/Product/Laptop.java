package Product;

class Laptop extends Computer{
	double weight;
	int battery;
	
	@Override
	public void info() {
		super.info();
		
		System.out.printf("무게 : %f", weight);
		System.out.printf("배터리 : %d", battery);
	}
}
