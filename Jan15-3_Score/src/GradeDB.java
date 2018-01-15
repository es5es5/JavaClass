
public class GradeDB {

	public static void main(String[] args) {
		String role = "DBA";
		
		switch (role) {
		case "DBA":
			System.out.println("전원관리");
			System.out.println("백업/복구");
		case "DBP":
			System.out.println("데이터관리");
		case "DBU":
			System.out.println("사용");
			break;
		default:
			break;
		}

	}

}
