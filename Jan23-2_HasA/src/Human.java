// final 멤버 변수 : 상수화(수정 못 하게)
// final 메소드 : 오버라이딩 못 하게
// final 클래스 : 상속 못 받게
public class Human {
	String name;
	int age;
	String gender;
	Dog pet;

	public Human() {
		// TODO Auto-generated constructor stub
	}

	public Human(String name, int age, String gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	public Human(String name, int age, String gender, Dog pet) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.pet = pet;
	}

	public void info() {

	}

}
