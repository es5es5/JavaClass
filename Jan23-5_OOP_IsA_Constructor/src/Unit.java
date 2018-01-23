
public class Unit {
	String name;
	int hp;
	int Damage;
	int Armor;

	public Unit() {
		System.out.println("기본 유닛 생성자");
	}

	public Unit(int hp, int damage, int armor) {
//		this(); // 이 클래스 기본 생성자 부른거
//		super(); // 상위 클래스 기본 생성자 부른거 default
		this.hp = hp;
		Damage = damage;
		Armor = armor;
	}

	public void info() {
		System.out.printf("이름 : %s\n", name);
		System.out.printf("체력 : %d\n", hp);
		System.out.printf("공격력 : %d\n", Damage);
		System.out.printf("방어력 : %d\n", Armor);
	}

}
