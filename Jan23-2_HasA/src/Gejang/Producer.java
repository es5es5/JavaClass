package Gejang;

public class Producer {
	String name;
	int age;
	
	public Producer() {
		// TODO Auto-generated constructor stub
	}

	public Producer(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public void info() {
		System.out.printf("�̸� : %s\n", name);
		System.out.printf("���� : %d\n", age);
	}
}
