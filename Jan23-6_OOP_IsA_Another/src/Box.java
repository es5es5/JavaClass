import java.util.Random;

// 0~100������ ¦�� ���� �����ϰ� ������ �ڽ�
public class Box extends Random {
	@Override
	public int nextInt(int bound) {
		System.out.println("�����Ѱ� �̴´�.");
		int t = super.nextInt(bound);
		if (t % 2 == 1) {
			return nextInt(bound);
		}
		return t;
	}
}
