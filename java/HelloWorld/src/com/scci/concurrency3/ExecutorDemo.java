package com.scci.concurrency3;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.scci.concurrency2.BlockingQueue;
import com.scci.concurrency2.Consumer;
import com.scci.concurrency2.Producer;

public class ExecutorDemo {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// Runnable, Callable interface 구현한 레퍼런스를 할당
		ExecutorService executor = Executors.newFixedThreadPool(10);
		// Runnable return x
		// 추상 함수가 하나만 정의된 인터페이스 = @FunctionalInterface
		executor.execute(new Runnable(){
			@Override
			public void run() {
				System.out.println("anonymouse inner class "+ Thread.currentThread().getName());
			}
		});
		executor.execute(()->{
			System.out.println("lambda "+ Thread.currentThread().getName());
		});
		
		Runnable runnable = ()->System.out.println("lambda reference"+ Thread.currentThread().getName());
		executor.execute(runnable);
		// Callable return o
		// interface Callable<V>, V call() throws Exception
		// return 1
		Future<Integer> future1 = executor.submit(new Callable<Integer>() {
			@Override
			public Integer call() {
				System.out.println("Callable anonymouse"+ Thread.currentThread().getName());
				return 1;
			}
		});
		Future<Integer> future2 = executor.submit(()->{
			System.out.println("Callable lambda"+ Thread.currentThread().getName());
			return 2;
		});
		
		if ( future1.isDone() ) {
			System.out.println(1);
			int result1 = future1.get();
			System.out.println(result1); // unboxing, Integer > primitimive int 바뀌는 것
		}
		// 실행이 멈춰 있는다, 대기 상태 get 함수가 값을 반환 할 때 까지,,
		int result = future1.get();
		System.out.println(result);
		
		result = future2.get();
		System.out.println(result);
		
		BlockingQueue<String> queue = new BlockingQueue<>(10);
		Consumer consumer = new Consumer(queue);
		Producer producer = new Producer(queue);
		executor.execute(consumer);
		executor.execute(producer);
		
		// main thread를 2초간 대기
		Thread.sleep(2000);
		
		executor.shutdownNow();
	}
}
