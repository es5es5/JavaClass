
public class Cal {
	String name;
	String maker;
	int price;
	
	public void Info() {
		System.out.printf("�𵨸� : %s\n������ : %s\n���� : %d\n", name, maker, price);
	}
	
	public double sum(double a, double b) {
		return a+b;
	}
	public double sub(double a, double b) {
		return a-b;
	}
	public double mul(double a, double b) {
		return a*b;
	}
	public double div(double a, double b) {
		return a/b;
	}

}
