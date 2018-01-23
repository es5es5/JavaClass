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
		System.out.printf("¸ðµ¨¸í : %s\n", name);
		System.out.printf("³Ñ¹ö : %d\n", number);
	}

}
