package com.scci.exception;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileNotFoundDemo {
	public static void main(String[] args) {
		try {
			FileNotFoundDemo.readFile("c:/development/source/java/test.txt");
		}catch(IOException e) { // 1, 발생한 예외타입과 비교
			System.out.println(e.getMessage());
		}catch(NullPointerException e) { // 2, IOException 하위 타입이 아니라면, NullPointerException 타입인지 비교
			System.out.println(e.getMessage());
		}finally { // 3. 예외와 상관없이 처리
			System.out.println("finally statement");
		}
	}
	// try catch 예외처리를 할 수도 있고, throws 예외 회피 할 수 있다.
	// 자신을 호출한 함수에게 예외처리를 이양한다
	public static void readFile(String path) throws IOException, NullPointerException{
		File file = new File(path); // NullPointerException, unchcked(runtime exception) 예외처리를 해도 되고, 안해도 되고
		FileReader fr = new FileReader(file); // FileNotFoundException , checked(compile time exception) 예외처리를 해줘야 함
		char[] buffer = new char[4096];
		int bufLen = fr.read(buffer);// IOException, checked(compile time exception) 예외처리를 해줘야 함
		for(int i=0; i<bufLen; i++) {
			System.out.print(buffer[i]);
		}
	}
}
