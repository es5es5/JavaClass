
public class RSMain3 {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("��");
			}
			System.out.println();
		}
		System.out.println("---------------");

		for (int i = 5; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("��");
			}
			System.out.println();
		}
		System.out.println("---------------");

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				if (j % 2 == 1) {
					System.out.print("��");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("---------------");

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				if (j == i) {
					System.out.print("��");
				} else {
					System.out.print("  ");
				}

			}
			System.out.println();
		}
		System.out.println("---------------");

		// ��
		// ������
		// ����������
		// ��������������
		// ������������������

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= ((i * 2) - 1); j++) {
				if (j % 2 == 1) {
					System.out.print("z");
				} else {
					System.out.print("g");
				}
			}
			System.out.println();
		}
		System.out.println("---------------");
	}
}
