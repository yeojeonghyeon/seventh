package com.scci.concurrent;

public class Consumer implements Runnable {
    private final DataQueue dataQueue;
    private volatile boolean runFlag;

    public Consumer(DataQueue dataQueue) {
        this.dataQueue = dataQueue;
        runFlag = true;
    }

    @Override
    public void run() {
        consume();
    }

    public void consume() {
        while (runFlag) {
            Message message;
            if (dataQueue.isEmpty()) {
                try {
                    dataQueue.waitOnEmpty();
                } catch (InterruptedException e) {
                    break;
                }
            }
            if (!runFlag) {
                break;
            }
            message = dataQueue.remove();
            dataQueue.notifyAllForFull();
            Consumer.useMessage(message);
        }
    }
    
    public static void useMessage(Message message) {
    	System.out.println(message.getInfo());
    }
}