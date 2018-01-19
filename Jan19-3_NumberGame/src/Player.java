import java.util.Scanner;

public class Player {
	
	Scanner brain;

	public int say() {
		brain = new Scanner(System.in);
		return brain.nextInt();
	}
}
