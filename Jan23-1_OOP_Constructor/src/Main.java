
public class Main {

	public static void main(String[] args) {
		Programmer.onDutyTime();
		
		Programmer p = new Programmer("�̿�", 26);
		
		p.introduce();
		System.out.println(p.work("��"));
		p.onDutyTime();
	}
}
