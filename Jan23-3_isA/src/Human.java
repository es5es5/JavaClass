
public class Human {
	String name;
	int age;

	public Human() {
		// TODO Auto-generated constructor stub
	}

	public Human(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public void info() {
		System.out.printf("�̸� : %s\n", name);
		System.out.printf("���� : %d\n", age);
	}
}
