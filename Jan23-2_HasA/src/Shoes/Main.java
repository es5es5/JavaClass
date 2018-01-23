package Shoes;

public class Main {

	public static void main(String[] args) {
		Human hong = new Human("홍길동", 20, 
				new Shoes("에어조던12", 260, 
						new Company("나이키", 
								new City("서울", 
										new Human("박원순", 60, 
												new Shoes("버팔로캐쥬얼", 265, 
														new Company("랜드로바", null)))))));
	System.out.println(hong.name);
	System.out.println(hong.shoes.size);
	System.out.println(hong.shoes.maker.name);
	System.out.println(hong.shoes.maker.Location.name);
	System.out.println(hong.shoes.maker.Location.mayor.name);
	System.out.println(hong.shoes.maker.Location.mayor.shoes.name);
	System.out.println(hong.shoes.maker.Location.mayor.shoes.maker.name);
	}
	
}
