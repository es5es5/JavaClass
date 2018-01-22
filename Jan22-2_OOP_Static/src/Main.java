
public class Main {

	public static void main(String[] args) {
		Gejang g1 = new Gejang();
		Gejang g2 = new Gejang();

		g1.name = "설 특선 양념게장";
		g1.price = 59900;
		g1.weight = 10;
		g1.Info();

//		g2.name = "간장게장";
//		g2.price = 39900;
//		g2.weight = 10;
//		g2.Info();
		
		// 객체가 없어도 static은 사용 가능 클래스.static 일명 모든 게장의 생산자
		System.out.println(Gejang.producer);
		
		Apple ix = new Apple();
		Apple im = new Apple();
		Apple ip = new Apple();
		
		ix.name = "아이폰x";
		ix.price = 1000000;
		ix.Info();
	}
}
