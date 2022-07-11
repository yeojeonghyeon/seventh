package com.scci.concurrent;

public class Demo {
	public static void main(String[] args) {
		DataQueue dataQueue = new DataQueue(20);
		
		Producer producer = new Producer(dataQueue);
		Thread producerThread = new Thread(producer);
		
		Consumer consumer = new Consumer(dataQueue);
		Thread consumerThread = new Thread(consumer);
		
		producerThread.start();
		consumerThread.start();
	}
}
