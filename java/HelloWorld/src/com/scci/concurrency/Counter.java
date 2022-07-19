package com.scci.concurrency;

public class Counter{
	private int temp = 0;
	private int cnt;
	private int max;
	private Object lock = new Object();
	public Counter(int initialCnt, int max){
		this.cnt = initialCnt;
		this.max = max;
	}
	// 한번에 하나의 쓰레드만 접근 가능
	// 동기화
	// monitor를 획득한 쓰레드가 getCnt 함수 내부로 진행 되고
	// 함수를 다 사용하면 monitor를 반환
	public synchronized int getCnt() throws Exception {
		if ( max == cnt ) throw new Exception("exceed");
		return ++cnt;
	}
	public synchronized boolean isDone() {
		if ( max == cnt ) return true;
		else return false;
	}
	
	public void foo() {
		// lock 객체에 락을 건다
		// lock 객체를 사용한 비동기 블럭은 전부 락이 풀리기 전까지 진입 대기
		synchronized(lock) {
			temp = temp + 1;
			System.out.println(temp + " " +Thread.currentThread().getName() + "foo");
		}
	}
	public void zoo() {
		synchronized(lock) {
			temp = temp - 1;
			System.out.println(Thread.currentThread().getName() + "zoo");		
		}
	}
}

class UseCounterThread implements Runnable{
	Counter counter;
	public UseCounterThread(Counter counter) {
		this.counter = counter;
	}
	@Override
	public void run() {
		int cnt;
		while(true) {
			try {
				cnt = counter.getCnt();
			} catch (Exception e) {
				e.printStackTrace();
				break;
			}
			System.out.println(cnt + " " + Thread.currentThread().getName());
		}
	}
}

class CounterDemo{
	public static void main(String[] args) {
		Counter c = new Counter(0, 100);
		// t1, t2 new 상태가 됨.
		Thread t1 = new Thread(new UseCounterThread(c));
		Thread t2 = new Thread(new UseCounterThread(c));
		// Runnable 상태가 됨.
		t1.start();
		t2.start();
	}
}