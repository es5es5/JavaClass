
public class Dog {
	String name;
	int age;
	String type;
	
	public Dog() {
		// TODO Auto-generated constructor stub
	}
	
	public Dog(String name, int age, String type) {
		super();
		this.name = name;
		this.age = age;
		this.type = type;
	}

	public void info() {
		System.out.printf("이름 : %s\n", name);
		System.out.printf("나이 : %d\n", age);
		System.out.printf("종 : %s\n", type);
		
	}
	
}
