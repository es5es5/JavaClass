import java.util.Random;

// 0~100사이의 짝수 값만 랜덤하게 뽑히는 박스
public class Box extends Random {
	@Override
	public int nextInt(int bound) {
		System.out.println("랜덤한거 뽑는다.");
		int t = super.nextInt(bound);
		if (t % 2 == 1) {
			return nextInt(bound);
		}
		return t;
	}
}
