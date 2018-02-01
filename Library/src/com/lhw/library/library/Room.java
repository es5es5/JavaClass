package com.lhw.library.library;

import java.util.ArrayList;

public class Room {
	private ArrayList<Boolean> seat;
	
	public void seatInfo() {
		for (int i = 0; i < seat.size(); i++) {
			System.out.printf("%d번). ");
			if (seat.get(i)) {
				System.out.println("가능");
			} else {
				System.out.println("불가능");
			}
		}
	}		
	
	public void seatIn(User u, int num) {
		if (!seat.get(num)) {
			u.setSeat(num);
			seat.set(num, false);
		} else {
			System.out.printf("%d번 자리는 사용 불가능입니다.\n", num);
		}
	}
	
	public void seatOut(User u) {
		seat.set(u.getSeat(), true);
	}

}
