import java.util.Random;

public class Enemy {
	Random hand;
	ComBrain brain;
	

	public int choice() {
		return brain.think();
	}
}
