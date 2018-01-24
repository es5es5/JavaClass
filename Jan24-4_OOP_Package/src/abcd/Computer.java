package abcd;

public class Computer extends Product {
	String cpu;
	int ram;
	int hdd;
	
	public Computer() {
		// TODO Auto-generated constructor stub
	}

	public Computer(String cpu, int ram, int hdd) {
		super();
		this.cpu = cpu;
		this.ram = ram;
		this.hdd = hdd;
	}

	@Override
	public void info() {
		// TODO Auto-generated method stub
		super.info();
	}
}
