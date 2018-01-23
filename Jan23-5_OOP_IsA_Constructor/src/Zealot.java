
public class Zealot extends Unit {
	int shield;

	public Zealot() {
		// TODO Auto-generated constructor stub
	}
	

	public Zealot(int hp, int damage, int armor, int shield) {
		super(hp, damage, armor); // 얘 없으면 상위 클래스의 기본 생성자를 갖고 옴
		this.shield = shield; 
	}


	@Override
	public void info() {
		// TODO Auto-generated method stub
		super.info();
		System.out.printf("쉴드 : %d\n", shield);
	}

}
