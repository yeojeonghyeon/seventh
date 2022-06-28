package com.scci.inheritance;

import java.util.ArrayList;

public class PrinterDemo {
	public static void main(String[] args) {
		ArrayList<Printer> list = new ArrayList<Printer>();
		list.add(new InkjetPrinter("ink450j", "samsung", "123456-789", 200, false, true));
		list.add(new LaserPrinter("laserjet407i", "lg", "7997-123689", 450, false, true));
		
		// ArrayList에 들어 있는 객체의 타입은 Printer의 하위 타입들
		// 상위 클래스 타입의 변수에 하위 클래스 객체의 레퍼런스를 담을 수 있다.
		for(Printer p : list) {
			String contents = p.getInfo();
			p.print(contents);
		}
	}
}
