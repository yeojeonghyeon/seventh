package com.scci.concurrency2;

import java.util.Iterator;
import java.util.stream.Stream;

public class Producer implements Runnable{
	BlockingQueue<String> queue;
	Stream<Integer> stream;
	public Producer(BlockingQueue<String> queue) {
		this.queue = queue;
		stream = Stream.iterate(0, n -> n + 1);
	}
	@Override
	public void run() {
		Iterator<Integer> iter = stream.iterator();
		while(true) {
			try {
				String item = iter.next().toString();
				System.out.println("Producer put : " + item);
				queue.put(item);
			} catch (InterruptedException e) {
				e.printStackTrace();
				break;
			}
		}
	}
}