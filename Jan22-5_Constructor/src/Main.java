
public class Main {

	public static void main(String[] args) {
		// Pen p1 = new Pen();
		// p1.name = "���帶ī";
		// p1.price = 1000;
		// p1.info();

		Human h1 = new Human();
		h1.name = "�̿�";
		h1.gender = "Male";

		Dog d1 = new Dog();
		d1.age = 15;
		d1.name = "�Ѷ�";

		d1.printInfo();
		d1.changeAge(16);
		d1.printInfo();

		Cat c1 = new Cat("����", 1);
		c1.print();
		
		Book b1 = new Book("�ڹ�", 10000, "�ֵ���ũ");
		b1.info();
		Book b2 = new Book("JSP", 15000, "�Ѻ�");
		
		Computer pc = new Computer(4560, 8, 250);
		pc.printInfo();
	}

}
