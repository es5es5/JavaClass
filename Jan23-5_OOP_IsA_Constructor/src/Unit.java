
public class Unit {
	String name;
	int hp;
	int Damage;
	int Armor;

	public Unit() {
		System.out.println("�⺻ ���� ������");
	}

	public Unit(int hp, int damage, int armor) {
//		this(); // �� Ŭ���� �⺻ ������ �θ���
//		super(); // ���� Ŭ���� �⺻ ������ �θ��� default
		this.hp = hp;
		Damage = damage;
		Armor = armor;
	}

	public void info() {
		System.out.printf("�̸� : %s\n", name);
		System.out.printf("ü�� : %d\n", hp);
		System.out.printf("���ݷ� : %d\n", Damage);
		System.out.printf("���� : %d\n", Armor);
	}

}
