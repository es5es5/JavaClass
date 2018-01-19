
public class Referee {
	
	public boolean check(int ans, int playerAns, int turn) {
		if (ans == playerAns) {
			System.out.printf("%d번만에 정답", turn);
			return true;
		} else if (ans > playerAns) {
			System.out.println("업");
		} else {
			System.out.println("다운");
		}
		return false;
	}

	public void play(Enemy e, Player p) {
		int ans = e.say();
		int playerAns = 0;
		System.out.println(ans);
		boolean isOver = false;

		for (int turn=1; true; turn++) {
			System.err.print("뭐 : ");
			playerAns = p.say();
			isOver = check(ans, playerAns, turn);
			
			if (isOver) {
				break;
			}
		}

	}

}
