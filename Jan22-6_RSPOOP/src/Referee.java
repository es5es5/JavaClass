
public class Referee {
	static String[] handTable;
	
	public Referee() {
		handTable = new String[] {"", "����", "����", "��"};
	}
	
	public void showHelp() {
		System.out.println("\n\n-------");

		for (int i = 1; i < handTable.length; i++) {
			System.out.printf("%d. %s\n", i, handTable[i]);
		}
		System.out.println("�� : ");
	}

}
