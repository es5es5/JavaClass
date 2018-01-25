package com.kwon.p.main;

import com.kwon.p.human.Human;
import com.kwon.p.menu.Alcohol;
import com.kwon.p.menu.Beer;
import com.kwon.p.menu.Chicken;
import com.kwon.p.menu.Menu;
import com.kwon.p.menu.MenuPan;
import com.kwon.p.menu.Soju;

// 다형성(polymorphism)
//		상위클래스형의 변수에 하위클래스형의 객체를 넣을 수 있음
public class PMain {
	public static void main(String[] args) {
		
		
		Menu m = new Soju("처음처럼", 2000, 10);
		Alcohol a = new Soju("참", 3000, 30);
		System.out.println("------");
		Human h = new Human();
		Beer b = new Beer("카스", 3000);
		h.eat(b);
		Chicken c = new Chicken("후라이드",10000);
		h.eat(c);
		System.out.println("===");
		MenuPan mp = new MenuPan();
		mp.show();
		System.out.println("--------------");
		
		// 메뉴타입의 변수 mm에 실제로 넣은건 소주 객체
		// 메뉴타입 변수를 써서 그 객체를 읽으면
		// 소주클래스에서 추가된 기능은 사용하지 못함
		Menu mm = new Soju("처음처럼", 3000, 10);
		System.out.println(mm);
		System.out.println( mm.getName()  );
		System.out.println( mm.getPrice() );
		//System.out.println( mm.getAlcohol() );
		
		// 소주클래스에서 추가된 기능을 사용하려면
		// 소주타입으로 형변환 해서 사용해야
		Soju ss = (Soju) mm;
		System.out.println(ss);
		System.out.println(ss.getName());
		System.out.println(ss.getPrice());
		System.out.println(ss.getAlcohol());
		
	}
}



















