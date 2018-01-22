import java.util.Scanner;

public class Player {
	Scanner hand;
	
	public int choice() {
		hand = new Scanner(System.in);
		return hand.nextInt();
	}
}
