package com.scci.concurrency;

public class ThreadInterrupt implements Runnable {
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(1000); // waiting, 1초 후에 깨어남
			} catch (InterruptedException e) {
				e.printStackTrace();
				break;
			}
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		System.out.println("main started");
		Thread t = new Thread(new ThreadInterrupt());
		t.start(); // Runnable 상태
		try {
			Thread.sleep(2000); // 자기 자신(main thread, 2초 동안 waiting 상태
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t.interrupt();
		System.out.println("main ends");
	}
}
