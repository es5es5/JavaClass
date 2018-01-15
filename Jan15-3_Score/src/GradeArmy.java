// 스위치 문의 특별한 사용
// break를 없애서 이용
public class GradeArmy {

	public static void main(String[] args) {
		String grade = "상병";
		
		switch (grade) {
		case "이병":
			System.out.println("눈치");
		case "일병":
			System.out.println("관등성명");
		case "상병":
			System.out.println("훈련");
		case "병장":
			System.out.println("잠");
			break;
		default:
			break;
		}

	}

}
