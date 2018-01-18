import java.util.Arrays;
import java.util.Random;

public class LottoMain {
	public static int same(int num, int[] ar) {
		for (int i = 0; i < ar.length; i++) {
			if (num == ar[i]) {
				return 1;
			}
		}
		return 2;
	}

	public static int pick(int i, int[] lotto) {
		Random r = new Random();
		int temp = (r.nextInt(45) + 1);
		for (int j = 0; j < i; j++) {
			if (temp == lotto[j]) {
				return pick(i, lotto);
			}
		}
		return temp;
	}

	public static void main(String[] args) {
		int[] lotto = new int[6];
		for (int i= 0; i<6;i++) {
			lotto[i] = pick(i, lotto);
		}
		Arrays.sort(lotto);
		for (int j : lotto) {
			System.out.println(j);
		}
	}
}
