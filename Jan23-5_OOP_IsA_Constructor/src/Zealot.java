
public class Zealot extends Unit {
	int shield;

	public Zealot() {
		// TODO Auto-generated constructor stub
	}
	

	public Zealot(int hp, int damage, int armor, int shield) {
		super(hp, damage, armor); // �� ������ ���� Ŭ������ �⺻ �����ڸ� ���� ��
		this.shield = shield; 
	}


	@Override
	public void info() {
		// TODO Auto-generated method stub
		super.info();
		System.out.printf("���� : %d\n", shield);
	}

}
