package Car;

public class Car {
	String name;
	int number;
	public Car() {
		// TODO Auto-generated constructor stub
	}
	
	public Car(String name, int number) {
		super();
		this.name = name;
		this.number = number;
	}



	public void info() {
		System.out.printf("�𵨸� : %s\n", name);
		System.out.printf("�ѹ� : %d\n", number);
	}

}
