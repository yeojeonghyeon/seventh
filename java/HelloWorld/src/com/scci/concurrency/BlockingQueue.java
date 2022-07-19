package com.scci.concurrency;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.stream.Stream;

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
	Stream<Integer> s;
	public ProducerQueue(BlockingQueue<String> queue) {
		this.queue = queue;
		s = Stream.iterate(0,n -> n + 1);
	}
	@Override
	public void run() {
		Iterator<Integer> iter = s.iterator();
		while(true) {
			try {
				String seq = Integer.toString(iter.next());
				queue.put(seq);
				System.out.println("put : " + seq);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}

class BlockQueueDemo{
	public static void main(String[] args) {
		BlockingQueue<String> queue = new BlockingQueue<>(10);
		Thread con = new Thread(new ConsumerQueue(queue));
		Thread pro = new Thread(new ProducerQueue(queue));
		
		con.start();
		pro.start();
	}
}