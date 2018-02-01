package com.lhw.library.library;

import java.util.ArrayList;

public class Room {
	private ArrayList<Boolean> seat;
	
	public void seatInfo() {
		for (int i = 0; i < seat.size(); i++) {
			System.out.printf("%d��). ");
			if (seat.get(i)) {
				System.out.println("����");
			} else {
				System.out.println("�Ұ���");
			}
		}
	}		
	
	public void seatIn(User u, int num) {
		if (!seat.get(num)) {
			u.setSeat(num);
			seat.set(num, false);
		} else {
			System.out.printf("%d�� �ڸ��� ��� �Ұ����Դϴ�.\n", num);
		}
	}
	
	public void seatOut(User u) {
		seat.set(u.getSeat(), true);
	}

}
