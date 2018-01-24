package com.lhw.am.jugong102;

import com.lhw.am.jugong101.Jugong101;

public class ExJugong101 extends Jugong101{

	public void say() {
		Jugong101 friend = new Jugong101();
		System.out.println(friend.name);
		System.out.println(friend.password);
		System.out.println(friend.recycle);
		System.out.println(friend.money);
	}

}
