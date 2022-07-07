package com.scci.generic;

import java.util.ArrayList;
import java.util.List;

public class Pack {
	private Object item; // Object 하위 타입은 전부 할당, covariant(공변성)
	public Pack(Object item) {
		this.item = item;
	}
	public Object getItem() {
		return item;
	}
}

class GenericPack<T> {
	private T item;
	public GenericPack(T item) {
		this.item = item;
	}
	public T getItem() {
		return item;
	}
}

class Dummy{}
class Foo{}
class Bar{}

class PackDemo {
	public static void main(String[] args) {
		// type argument, 
		List<Pack> lst = new ArrayList<Pack>();
		lst.add(new Pack("1234"));
		// new Integer(123), boxing
		lst.add(new Pack(123));
		lst.add(new Pack(new Dummy()));
		
		for(Pack p : lst) {
			Object o = p.getItem();
			if ( o instanceof String ) {
				String s = (String)o;
			}else if( o instanceof Integer ) {
				Integer i = (Integer)o;
			}else if ( o instanceof Dummy ) {
				Dummy d = (Dummy)o;
			}
		}
		
		List<GenericPack<Dummy>> gePackList = new ArrayList<GenericPack<Dummy>>();
		gePackList.add(new GenericPack<Dummy>(new Dummy()));
		
		List<GenericPack<Bar>> gePackBarList = new ArrayList<GenericPack<Bar>>();
		gePackBarList.add(new GenericPack<Bar>(new Bar()));
	}
}
