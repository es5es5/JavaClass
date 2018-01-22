
// 메모리
// .java(소스) -> .class(기계어) -> 실행하면
// 1. 기계어로 번역 된 소스가 stack에 다 실림
// 2. static 멤버 변수들이 static에 다 실림
// 3. main에서 진행 시작
public class Gejang {
	String name;
	int weight;
	int price;
	
	// 공통 속성을 메모리 적게 쓰기 위해서 static
	static String producer = "김수미";
	
	static final String PRODUCER2 = "김수미";
	
	public void Info() {
		System.out.printf("품명 : %s\n", name);
		System.out.printf("가격 : %d원\n", price);
		System.out.printf("무게 : %dkg\n", weight);
		System.out.printf("생산자 : %s\n", producer);
	}
}