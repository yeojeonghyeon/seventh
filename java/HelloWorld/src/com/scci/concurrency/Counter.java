package com.scci.concurrency;

public class Counter{
	int cnt;
	int max;
	public Counter(int initialCnt, int max){
		this.cnt = initialCnt;
		this.max = max;
	}
	// 한번에 하나의 쓰레드만 접근 가능
	// 동기화
	// monitor를 획득한 쓰레드가 getCnt 함수 내부로 진행 되고
	// 함수를 다 사용하면 monitor를 반환
	public synchronized int getCnt() {
		return ++cnt;
	}
	public synchronized boolean isDone() {
		if ( max == cnt ) return true;
		else return false;
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
		while(!counter.isDone()) {
			cnt = counter.getCnt();
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