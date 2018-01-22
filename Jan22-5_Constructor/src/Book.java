
public class Book {
	String title;
	int price;
	String choolpansa;

	public Book(String title, int price, String choolpansa) {
		super();
		this.title = title;
		this.price = price;
		this.choolpansa = choolpansa;
	}
	public void info() {
		System.out.println(title + price + choolpansa);
	}
}
