package com.scci.concurrency;

public class SingleThread {
	public static void main(String[] args) {
		int num = SingleThread.getNumber();
		SingleThread.printConsole(Integer.toString(num));
		System.out.println("main is going to exit!!");
	}
	public static int getNumber() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 1;
	}
	public static void printConsole(String param) {
		System.out.println(param);
	}
}
