// @xxx : 정식 자바 문법x, 자바 문법으로 해결해야 될 것을 자동으로 해결
// @Override : 바로 밑에 있는 메소드가 오버라이딩 된 메소드임을 보장

public class Student extends Human{
	
	int korScore;
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Student(int korScore) {
		super();
		this.korScore = korScore;
	}


	@Override
	public void info() {
		super.info(); // Human에 있는 info()를 호출
		System.out.println(korScore); // 추가적인 내용 확장
	}
	
	public void yaja() {
		System.out.println("야자");
	}
	
}
