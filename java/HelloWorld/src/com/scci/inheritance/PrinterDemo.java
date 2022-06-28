package com.scci.inheritance;

import java.util.ArrayList;

public class PrinterDemo {
	public static void main(String[] args) {
		ArrayList<Printer> list = new ArrayList<Printer>();
		list.add(new InkjetPrinter("ink450j", "samsung", "123456-789", 200, false, true));
		list.add(new LaserPrinter("laserjet407i", "lg", "7997-123689", 450, false, "BigSize"));
		
		for(Printer p : list) {
			String contents = p.getInfo();
			p.print(contents);
		}
	}
}
