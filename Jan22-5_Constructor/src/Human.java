
public class Human {
	String name;
	String gender;
	
	public Human() {
		System.out.println("응애");
	}
	
	public void changename(String name) {
		// 자바는 멤버변수, 지역변수 이름이 같다고 에러가 아님
		// 가까운걸 우선
		System.out.println(name); // 고로 얜 지역변수
		System.out.println(this.name); // 얜 멤버변수
		
		}

}
