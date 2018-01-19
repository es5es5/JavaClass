
public class Referee {
	String[] handTable;
	
	public void showHand(Enemy e, Player p) {
		System.out.println("\n\n\n*---���---*");
		System.out.printf("�� : %s\n", handTable[p.choice()]);
		System.out.printf("�� : %s\n", handTable[e.choice()]);
		System.out.println("*---------*");
	}

	public void showHelp() {
		System.out.println("\n\n-------");

		for (int i = 1; i < handTable.length; i++) {
			System.out.printf("%d. %s\n", i, handTable[i]);
		}
		System.out.println("-------");
		System.out.print("���Ұ� : ");
	}

	public int check(Enemy e, Player p) {
		int result = e.choice() - p.choice();
		if (result == -1 || result == 2) {
			return 1;
		} else if (result == 0) {
			return 2;
		} else {
			return 3;
		}
	}

	public void play(Enemy e, Player p) {
		handTable = new String[] {"", "����", "����", "��"};
		for (int turn = 0; true;) {
			showHelp();
			check(e, p);
			if (check(e, p)==3) {
				turn++;
				System.err.printf("�̱� %d���� ��", turn);
			} else if (check(e, p)==2){
				System.out.println("���");
				turn = 0;
			} else {
				System.out.println("��");
			}
			showHand(e, p);
			
			
		}

	}

}