package com.scci.concurrency3;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class RunnableDemo {
	public static void main(String[] args) {
		// ExecutorService를 사용해서 풀을 만들고
		// Callable 인터페이스를 구현한 실행 코드
		// 코드 : 1 ~ 100까지 합을 구하고 그 값을 반환
		// Future 클래스를 사용해서 콘솔에 반환값을 출력 하시오
		ExecutorService executor = Executors.newScheduledThreadPool(5);
		// ctrl + shift + o
		Callable<Integer> callable = new Callable<Integer>() {
			@Override
			public Integer call() {
				return 100*(100+1)/2;
			}
		};
		Future<Integer> future1 = executor.submit(callable);
		Future<Integer> future2 = executor.submit(new SumAs(1000));
		try {
			// main thread 대기 상태, callable 코드가 실행 완료 되서 반환 할 때 까지 
			System.out.println(future1.get());
			// main thread 대기 상태, callable 코드가 실행 완료 되서 반환 할 때 까지 
			System.out.println(future2.get());
		} catch (InterruptedException | ExecutionException e) {
			System.out.println(e.getMessage());
		}
	}
}
class SumAs implements Callable<Integer> {
	int endNum;
	public SumAs(int endNum) {
		this.endNum = endNum;
	}
	@Override
	public Integer call() {
		return endNum*(endNum+1)/2;
	}
}
