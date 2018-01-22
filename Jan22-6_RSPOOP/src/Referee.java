
public class Referee {
	static String[] handTable;
	
	public Referee() {
		handTable = new String[] {"", "가위", "바위", "보"};
	}
	
	public void showHelp() {
		System.out.println("\n\n-------");

		for (int i = 1; i < handTable.length; i++) {
			System.out.printf("%d. %s\n", i, handTable[i]);
		}
		System.out.println("뭐 : ");
	}

}
