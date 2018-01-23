package Car;

public class Taxi extends Car{
	int fare;
	
	@Override
	public void info() {
		super.info();
		System.out.printf("기본 요금 : %d", fare);
	}
}
