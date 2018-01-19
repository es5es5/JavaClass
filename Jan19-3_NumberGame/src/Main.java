
public class Main {

	public static void main(String[] args) {
		Referee r = new Referee();
		Player p = new Player();
		Enemy e = new Enemy();
		
		r.play(e, p);
	}

}
