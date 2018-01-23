
public class Main {

	public static void main(String[] args) {
		Programmer.onDutyTime();
		
		Programmer p = new Programmer("ÀÌ¿ץ", 26);
		
		p.introduce();
		System.out.println(p.work("ÀÏ"));
		p.onDutyTime();
	}
}
