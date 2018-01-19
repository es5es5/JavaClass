import java.util.Random;

public class Enemy {
	Random hand;

	public int choice() {
		hand = new Random();

		return hand.nextInt(3) + 1;
	}
}
