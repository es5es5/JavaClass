package com.kwon.mt.main;

public class Human {
	private String brain;

	// synchronized메소드 : 
	//		어떤 synchronized메소드가 실행되는 중에는
	//		다른 synchronized메소드가 실행되지 않음
	public synchronized void sayNickname() {
		for (int i = 0; i < 5; i++) {
			brain = "바보";
			try {
				Thread.sleep(300);
				System.out.printf("별명 : %s\n", brain);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public synchronized void sayHobby() {
		for (int i = 0; i < 5; i++) {
			brain = "낚시";
			try {
				Thread.sleep(700);
				System.out.printf("취미 : %s\n", brain);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void introduce() {
		new Thread() {
			public void run() {
				sayHobby();
			};
		}.start();
	
		sayNickname();
	}

}













