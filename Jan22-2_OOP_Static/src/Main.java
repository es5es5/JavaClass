
public class Main {

	public static void main(String[] args) {
		Gejang g1 = new Gejang();
		Gejang g2 = new Gejang();

		g1.name = "�� Ư�� ������";
		g1.price = 59900;
		g1.weight = 10;
		g1.Info();

//		g2.name = "�������";
//		g2.price = 39900;
//		g2.weight = 10;
//		g2.Info();
		
		// ��ü�� ��� static�� ��� ���� Ŭ����.static �ϸ� ��� ������ ������
		System.out.println(Gejang.producer);
		
		Apple ix = new Apple();
		Apple im = new Apple();
		Apple ip = new Apple();
		
		ix.name = "������x";
		ix.price = 1000000;
		ix.Info();
	}
}
