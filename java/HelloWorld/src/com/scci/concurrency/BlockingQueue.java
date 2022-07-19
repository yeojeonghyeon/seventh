package com.scci.concurrency;

import java.util.LinkedList;
import java.util.Queue;

public class BlockingQueue<T>{
	private Queue<T> queue = new LinkedList<T>();
	private int capacity;

	public BlockingQueue(int capacity) {
		this.capacity = capacity;
	}

	public synchronized void put(T element) throws InterruptedException {
		while(queue.size() == capacity) {
			wait();
		}
		queue.add(element);
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

class ConsumerQueue implements Runnable{
	BlockingQueue<String> queue;
	public ConsumerQueue(BlockingQueue<String> queue) {
		this.queue = queue;
	}
	@Override
	public void run() {
		while(true) {
			try {
				System.out.println("take : " + queue.take());
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}

class ProducerQueue implements Runnable {
	BlockingQueue<String> queue;
	public ProducerQueue(BlockingQueue<String> queue) {
		this.queue = queue;
	}
	@Override
	public void run() {
		while(true) {
			try {
				String time = Long.toString(System.currentTimeMillis());
				queue.put(time);
				System.out.println("put : " + time);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}