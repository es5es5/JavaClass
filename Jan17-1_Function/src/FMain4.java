
public class FMain4 {

	public static String say(int age) {
		if (age >= 30) {
			return "안녕하십니까";
		} else if (age >= 20) {
			return "안녕하세요";
		} else if (age >= 10) {
			return "dd";
		}
		return "";

	}

	public static void main(String[] args) {
		System.out.println(say(29));
	}
}
