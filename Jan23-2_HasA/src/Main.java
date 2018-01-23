
public class Main {

	public static void main(String[] args) {
		Human h1 = new Human("이웅", 26, "남");
		Dog d1 = new Dog("한라", 15, "진도");
	
		h1.pet = d1;
		
		System.out.println(h1.pet.type);
		
		Human h2 = new Human("아빠", 50, "남");
		Dog d2 = new Dog("금강", 3, "발발");
		
		h2.pet = d2;
		
		h2.pet.info();
		
		Human h3 = new Human("엄마", 46, "여");
		h3.pet = new Dog("뺀질", 2, "발발");
		
		h3.pet.info();
		
		Human h4 = new Human("슬기", 22, "여", new Dog("한라", 1, "진도"));
		h4.pet.info();
		
		Company c1 = new Company("삼성", 1990, "서울");
		Product p1 = new Product("dd폰", 1000, c1);
		
		p1.info();
	}

}
