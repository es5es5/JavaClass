
public class Programmer {
	
	// 멤버 변수 : 속성
	String name;
	int age;
	static boolean nightDuty = true;
	int hab;
	
	// 기본 생성자 : spring등에 사용
	public Programmer() {
		// TODO Auto-generated constructor stub
	}
	
	// 오버로딩된 생성자
	public Programmer(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	// 자기 소개
	public void introduce() {
		System.out.printf("이름 : %s\n", name);
		System.out.printf("나이 : %d\n", age);
		System.out.println("야근여부 : " + nightDuty);
	}
	
	// 일거리 주면 프로그램 만들어 냄
	public String work(String order) {
		return "프로그램";
	}
	
	// 객체가 없어도 사용 가능한 메소드
	public static void onDutyTime() {
		System.out.println("FM");
	}
	
}
