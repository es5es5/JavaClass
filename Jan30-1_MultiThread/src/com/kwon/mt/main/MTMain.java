// JVM이 thread를 하나 만들어서 main으로 보냄
//		JVM이 만들어준 thread : main thread
//		개발자가 만든 thread : sub thread
// thread : 자바코드를 실행하는 주체
package com.kwon.mt.main;

public class MTMain {
	public static void main(String[] args) {
		
		MyThread mt = new MyThread();
		// mt.run();
		mt.start(); // 새로운 thread만들어서 run()으로 보냄
		
		Thread t = new Thread(new MyThread2());
		t.start();
		
		// t2의 정체 : Thread의 하위클래스로 만든 객체, 클래스명은 모름
		Thread t2 = new Thread() {
			@Override
			public void run() {
				super.run();
				for (int i = 0; i < 7; i++) {
					System.out.println("ㅇㅇ");
					try {
						Thread.sleep(300); 
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		t2.start();
		////////////////
		new Thread() {
			public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.println("-_-");
					try {
						Thread.sleep(500); // 0.5초 멈춤
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			};
		}.start();
		
		
		
		
		/////
		for (int i = 0; i < 5; i++) {
			System.out.println("ㅋ");
			try {
				Thread.sleep(500); // 0.5초 멈춤
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}





