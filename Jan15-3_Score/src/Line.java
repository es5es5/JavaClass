
public class Line {

	public static void main(String[] args) {
		String line = "경부선";
		
		switch (line) {
		case "경부선":
			System.out.println("타는 곳 1번으로 가세요.");
//			break;
		case "경원선":
			System.out.println("타는 곳 2번으로 가세요.");
			break;
		case "호남선":
			System.out.println("타는 곳 3번으로 가세요.");
			break;

		default:
			break;
		}
	}

}
