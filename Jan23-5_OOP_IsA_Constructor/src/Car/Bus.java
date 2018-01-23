package Car;

public class Bus extends Car{
	String route;
	
	public Bus() {
		// TODO Auto-generated constructor stub
	}
	
	public Bus(String name, int number, String route) {
		super(name, number);
		this.route = route;
	}

	@Override
	public void info() {
		super.info();
		System.out.printf("노선 번호 : %s", route);
	}
}
