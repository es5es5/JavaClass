package com.lhw.am.jugong101;
// 접근 제한자
//	멤버의 접근 범위를 설정
// 	public		: 아무데서나 접근 가능
// 	protected	: 같은 패키지 or 다른 패키지라면 하위 클래스에서 접근 가능 <-- 개소리고 안 쓴거랑 걍 똑같음. Java에서의 버그
//	안 쓴거(default, friendly)	: 같은 패키지에서만 접근 가능
// 	private : 클래스 내부에서만 접근 가능

public class Jugong101 {
	public String name;
	protected int password;
	int recycle;
	private int money;
	
	public Jugong101() {
		// TODO Auto-generated constructor stub
	}
	
	public Jugong101(String name, int password, int recycle, int money) {
		super();
		this.name = name;
		this.password = password;
		this.recycle = recycle;
		this.money = money;
	}

	public void info() {
		System.out.printf("이름 : %s", name);
		System.out.printf("비번 : %d", password);
		System.out.printf("분리수거일 : %d", recycle);
		System.out.printf("재산 : %d", money);
	}

}
