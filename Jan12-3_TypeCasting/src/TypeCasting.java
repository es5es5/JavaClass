
public class TypeCasting {

	public static void main(String[] args) {
		// Çü º¯È¯
		char c = 65;

		double d = 10 / (double) 4;

		int aa = 10;
		
		long bb = aa; // int -> long
		int cc = (int) bb; // long -> int

		double dd = cc; // int -> double
		int ee = (int) dd; // double -> ee
		
		String ff = "" + ee;
		String gg = "" + dd;
	}
}
