
public class Main {

	public static void main(String[] args) {
		Cal c = new Cal();
		c.maker = "casio";
		c.name = "c-1211";
		c.price = 10000;
		
		c.Info();
		System.out.println(c.sum(1, 2));
		System.out.println(c.sub(1, 2));
		System.out.println(c.mul(1, 2));
		System.out.println(c.div(1.5, 2));

	}

}
