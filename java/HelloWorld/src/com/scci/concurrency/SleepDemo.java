package com.scci.concurrency;

public class SleepDemo {
	public synchronized void foo() {
		System.out.println("start" + Thread.currentThread().getName());
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("end" + Thread.currentThread().getName());
	}
	
	public static void main(String[] args) {
		SleepDemo demo = new SleepDemo();
		Thread t1 = new Thread(()->{
			demo.foo();
		});
		t1.start();
		Thread t2 = new Thread(()->{
			demo.foo();
		});
		t2.start();
	}
}
