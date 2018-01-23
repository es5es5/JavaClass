package Product;

public class Main {

	public static void main(String[] args) {
		Computer c1 = new Computer();
		Laptop lt1 = new Laptop();
		
		c1.name = "BOSSMOSTER";
		c1.cpu = "G4560";
		c1.price = 700000;
		c1.hdd = 250;
		c1.ram = 8;
		c1.info();
		
		lt1.weight = 2.7;

	}

}
