package com.scci.concurrency;


class Test {
	public static void main(String[] args) {
		(new RunnableDemo("T1")).start();
		(new RunnableDemo("T2")).start();
	}
}

class RunnableDemo implements Runnable {
	// Thread 클래스 변수
	private Thread t;
	private String threadName;
	RunnableDemo(String name) {
		threadName = name;
	}
	public void run() {
		try {
			for (int i = 4; i > 0; i--) {
				System.out.println("Thread: " + threadName + ", " + i);
				// Let the thread sleep for a while.
				Thread.sleep(50);
			}
		} catch (InterruptedException e) {
			System.out.println("Thread " + threadName + " interrupted.");
		}
	}

	public void start() {
		if (t == null) {
			t = new Thread(this, threadName);
			t.start();
		}
	}
}
