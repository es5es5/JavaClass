// 이상한 소설임

package com.lhw.os.main;

import com.lhw.os.human.Human;
import com.lhw.os.human.PowerRanger;
import com.lhw.os.space.Planet;

public class Main {
	public static void main(String[] args) {
		// 이름이 지구인 행성 만들기
		Planet p1 = new Planet("지구");
		
		// 사이즈를 100
		p1.setSize(100);
		
		// 이름이 홍길동인 사람 만들기
		Human h1 = new Human("홍길동");
		
		// 지구에 홍길동을 입주
		p1.add(h1);
		
		// 파워레인저 만들기
		PowerRanger pr1 = new PowerRanger();

		// 홍길동의 전담 영웅은 파워레인저1
		h1.pickMyHero(pr1);
		
		// 홍길동이 도움 요청
		h1.helpMe();
		
		// 지구 보이게
		p1.setVisible(true);
		
		
	}
}
