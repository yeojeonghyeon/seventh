package com.scci.generic;

import java.util.ArrayList;
import java.util.List;

import com.scci.inheritance.Printer;

// 집에서 예습 복습 많이 많이 합시다!!
public class FirstGeneric {
	public static void main(String[] args) {
		Box<String> strBox = new Box<String>("String Box");
		Box<Printer> printerBox = new Box<Printer>(new Printer("ink5500", "samsung", "1234578", 250, false));
		
		String s = strBox.getItem();
		Printer p = printerBox.getItem();
	}
}

class Box<T> {
	private T item;
	public Box(T item) {
		this.item = item;
	}
	public T getItem() {
		return item;
	}
}
