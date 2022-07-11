package com.scci.concurrent;

public class Producer implements Runnable {
    private final DataQueue dataQueue;
    private volatile boolean runFlag;

    public Producer(DataQueue dataQueue) {
        this.dataQueue = dataQueue;
        runFlag = true;
    }
    
	@Override
	public void run() {
		produce();
	}
	public static Message generateMessage() {
		return new Message();
	}
	public void produce() {
	    while (runFlag) {
	        Message message = generateMessage();
	        while (dataQueue.isFull()) {
	            try {
	                dataQueue.waitOnFull();
	            } catch (InterruptedException e) {
	                break;
	            }
	        }
	        if (!runFlag) {
	            break;
	        }
	        dataQueue.add(message);
	        dataQueue.notifyAllForEmpty();
	    }
	}
	public void stop() {
	    runFlag = false;
	    dataQueue.notifyAllForFull();
	}
}
