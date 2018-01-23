package Product;

public class Computer extends Product {
	String cpu;
	int ram;
	int hdd;

	@Override
	public void info() {
		super.info();

		System.out.printf("cpu : %s\n", cpu);
		System.out.printf("ram : %d\n", ram);
		System.out.printf("hdd : %d\n", hdd);
	}
}
