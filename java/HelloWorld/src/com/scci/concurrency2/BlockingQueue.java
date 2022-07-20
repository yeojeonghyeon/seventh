package com.scci.concurrency2;

import java.util.LinkedList;
import java.util.Queue;

public class BlockingQueue<T> {
	Queue<T> queue = new LinkedList<T>();
	int capacity;
	public BlockingQueue(int capacity) {
		this.capacity = capacity;
	}
	public synchronized void put(T item) throws InterruptedException {
		while(queue.size() == capacity) {
			// Producer thread >>> wait set로 보내 버림, monitor 반납
			wait();
		}
		queue.add(item);
		// wait set(wait 함수를 통해서 wait set에서 기다리는 thread)의 thread를 깨워줌
		notify();
	}
	public synchronized T take() throws InterruptedException {
		while(queue.isEmpty()) {
			wait();
		}
		T item = queue.remove();
		notify();
		return item;
	}
}

class QueueDemo{
	public static void main(String[] args) {
		BlockingQueue<String> queue = new BlockingQueue<String>(10);
		// Consumer 클래스와 Producer 클래스를 사용하여 t1, t2 쓰레드를 생성해서 Runnable 상태로 만들어라
		
		Thread t1 = new Thread(new Consumer(queue));
		Thread t2 = new Thread(new Producer(queue));
		t1.start();
		t2.start();
	}
}
