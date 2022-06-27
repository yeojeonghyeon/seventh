package com.scci.exception;

public class RuntimeDemo {
	// java final, 변수는 재할당 불가, 함수는 오버라이딩 불가
	public final int BUFFER_SIZE = 1024;
	int[] buffer = new int[BUFFER_SIZE];
	
	public RuntimeDemo(int initialValue) {
		for(int i=0; i<buffer.length; i++) {
			buffer[i] = initialValue+i;
		}
	}
	public int getValueByIndex(int index) {
		if ( index < 0 || index >= BUFFER_SIZE ) return -1;
		return buffer[index]; // index는 배열의 크기보다 작거나, -1보다 커야 함. 
	}
	
	public static void main(String[] args) {
		RuntimeDemo demo = new RuntimeDemo(55);
		System.out.println(demo.getValueByIndex(0));
		System.out.println(demo.getValueByIndex(1));
		System.out.println(demo.getValueByIndex(3));
		System.out.println(demo.getValueByIndex(1023));
		System.out.println(demo.getValueByIndex(1024)); // index를 벗어남.
	}
}
