package Car;

public class Taxi extends Car{
	int fare;
	
	@Override
	public void info() {
		super.info();
		System.out.printf("�⺻ ��� : %d", fare);
	}
}
