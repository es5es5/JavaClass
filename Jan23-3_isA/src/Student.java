// @xxx : ���� �ڹ� ����x, �ڹ� �������� �ذ��ؾ� �� ���� �ڵ����� �ذ�
// @Override : �ٷ� �ؿ� �ִ� �޼ҵ尡 �������̵� �� �޼ҵ����� ����

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
		super.info(); // Human�� �ִ� info()�� ȣ��
		System.out.println(korScore); // �߰����� ���� Ȯ��
	}
	
	public void yaja() {
		System.out.println("����");
	}
	
}
