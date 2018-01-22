
public class Main {

	public static void main(String[] args) {
		// Pen p1 = new Pen();
		// p1.name = "보드마카";
		// p1.price = 1000;
		// p1.info();

		Human h1 = new Human();
		h1.name = "이웅";
		h1.gender = "Male";

		Dog d1 = new Dog();
		d1.age = 15;
		d1.name = "한라";

		d1.printInfo();
		d1.changeAge(16);
		d1.printInfo();

		Cat c1 = new Cat("나비", 1);
		c1.print();
		
		Book b1 = new Book("자바", 10000, "솔데스크");
		b1.info();
		Book b2 = new Book("JSP", 15000, "한빛");
		
		Computer pc = new Computer(4560, 8, 250);
		pc.printInfo();
	}

}
