package com.scci.concurrency;

public class TwoThread {
	public static void main(String[] args) {

		// Thread 클래스를 상속 받는 방법
		// Runnable 인터페이스를 구현하는 방법
		Thread t = new Thread(new UserThread(100));
		// Runnable 상태 => JVM Running 상태로 변경
		t.start();
		
		HelloThread ht1 = new HelloThread();
		HelloThread ht2 = new HelloThread();
		ht1.start();
		ht2.start();
		
		for(int i=0; i<100; i++) {
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i + " " + Thread.currentThread().getName());
		}
	}
}

class UserThread implements Runnable {
	int max;
	// 생성자를 생성 했기 때문에, 기본 생성자를 자동으로 만들어 주지 않는다.
	UserThread(int max){
		this.max = max;
	}
	@Override
	public void run() {
		for(int i=0; i<max; i++) {
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i + " " + Thread.currentThread().getName());
		}
	}
}

class HelloThread extends Thread {
	@Override
	public void run() {
		for(int i=0; i<100; i++) {
			System.out.println(i + " " + Thread.currentThread().getName());
		}
	}
}
