
public class OOPMain {

	public static void main(String[] args) {
		Dog d1 = new Dog();
		d1.name = "금강";
		d1.age = 3;
		d1.weight = 15;
		
		Dog d2 = new Dog();
		d2.name = "한라";
		d1.age = 16;
		d1.age = 20;
		
		Computer boss = new Computer();
		boss.cpu = "G4560";
		boss.gpu = "GTX1050";
		boss.hdd = 0;
		boss.ssd = 250;
		boss.ram = 8;
		
		Computer soldesk = new Computer();
		soldesk.cpu = "Athlon2";
		soldesk.gpu = "Radeon3200";
		soldesk.hdd = 500;
		soldesk.ram = 8;
		
		boss.printInfo();
	}

}
