import java.util.Random;

public class Enemy {
	Random brain;
	
	public int say() {
		brain = new Random();
		
		return brain.nextInt(10000);
	}
}
