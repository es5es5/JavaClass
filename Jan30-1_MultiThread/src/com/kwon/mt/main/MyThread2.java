package com.kwon.mt.main;

public class MyThread2 implements Runnable{

	@Override
	public void run() {
		
		for (int i = 0; i < 7; i++) {
			System.out.println("¤Ñ¤Ñ");
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
