
public class Main {


	public static void main(String[] args) {
		Enemy e = new Enemy();
		Player p = new Player();
		Referee r = new Referee();
	
		r.play(e, p);
	}
}
