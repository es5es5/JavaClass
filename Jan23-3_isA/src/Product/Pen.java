package Product;

public class Pen extends Product{
	String color;
	
	@Override
	public void info() {
		super.info();
		System.out.printf("���� : %s\n", color);
	}
}
