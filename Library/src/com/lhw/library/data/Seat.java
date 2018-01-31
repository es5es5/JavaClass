package com.lhw.library.data;

public class Seat {
	private static boolean seat[] = { true, true, true, true, true };
	
	public Seat() {
		// TODO Auto-generated constructor stub
	}

	public Seat(boolean[] seat) {
		super();
		this.seat = seat;
	}

	public boolean[] getSeat() {
		return seat;
	}

	public void setSeat(boolean[] seat) {
		this.seat = seat;
	}

	public void seatInfo() {
		for (int i = 0; i < seat.length; i++) {
			System.out.printf("%d). ", i+1);
			if (seat[i]) {
				System.out.println("입장 가능");
			} else {
				System.out.println("입장 불가능");
			}
		}
	}
}
