
public class FMain4 {

	public static String say(int age) {
		if (age >= 30) {
			return "�ȳ��Ͻʴϱ�";
		} else if (age >= 20) {
			return "�ȳ��ϼ���";
		} else if (age >= 10) {
			return "dd";
		}
		return "";

	}

	public static void main(String[] args) {
		System.out.println(say(29));
	}
}
