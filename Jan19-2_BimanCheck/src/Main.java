public class Main {

	public static void main(String[] args) {
		Doctor d = new Doctor();
		Guest g = new Guest();
		Nurse n = new Nurse();
		Paper p = new Paper();
		
		n.start(g);
	}

}
