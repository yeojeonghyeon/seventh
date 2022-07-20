package com.scci.concurrency2;

public class Consumer implements Runnable{
	BlockingQueue<String> queue;
	public Consumer(BlockingQueue<String> queue) {
		this.queue = queue;
	}
	@Override
	public void run() {
		String item;
		while(true) {
			try {
				item = queue.take();
				System.out.println("Consumer take : " + item);
			} catch (InterruptedException e) {
//				e.printStackTrace();
				break;
			}
		}
	}
}