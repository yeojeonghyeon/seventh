package com.scci.training;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class RunnableDemo {
	// Callable<V> 인터페이스를 구현한 SumAs 클래스 정의 및 사용 
	// V call() 함수 : 1 ~ 100까지 합을 구하고 그 값을 반환
	// ExecutorService를 사용해서 풀을 만들고
	// Future 클래스를 사용해서 콘솔에 반환값을 출력 하시오
	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(10);
		Future<Integer> future = executor.submit(new SumAs(100));
		executor.submit(new GeometricSequence(2, 1, 5));
		Future<List<Integer>> seqFuture = executor.submit(new GeometricSequenceArray(2, 1, 5));
		try {
			System.out.println(future.get());
			List<Integer> lst = seqFuture.get();
			lst.forEach(System.out::println);
		} catch (InterruptedException | ExecutionException e) {
			System.out.println(e.getMessage());
		}
		executor.shutdown();
	}
}

class SumAs implements Callable<Integer> {
	int endNum = 0;
	public SumAs(int endNum) {
		this.endNum = endNum;
	}
	@Override
	public Integer call() {
		return endNum*(endNum+1)/2;
	}
}

class GeometricSequence implements Runnable {
	private int ratio;
	private int initial;
	private int count;
	public GeometricSequence(int ratio, int initial, int count) {
		this.ratio = ratio;
		this.initial = initial;
		this.count = count;
	}
	@Override
	public void run() {
		int sequence;
		for(int i=0; i<count; i++) {
			sequence = (int) (initial*Math.pow(ratio, i));
			System.out.println(sequence);
		}
	}
}

class GeometricSequenceArray implements Callable<List<Integer>> {
	private int ratio;
	private int initial;
	private int count;
	public GeometricSequenceArray(int ratio, int initial, int count) {
		this.ratio = ratio;
		this.initial = initial;
		this.count = count;
	}
	@Override
	public List<Integer> call() {
		List<Integer> lst = new ArrayList<Integer>();
		int sequence;
		// 등비수열을 생성하고, 리스트에 담아서 반환
		for(int i=0; i<count; i++) {
			sequence = (int) (initial*Math.pow(ratio, i));
			lst.add(sequence);
		}
		return lst;
	}
}
