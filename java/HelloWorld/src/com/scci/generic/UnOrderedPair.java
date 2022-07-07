package com.scci.generic;


class UnOrderedDemo {
	public static void main(String[] args) {
		Pair<String, Integer> p;
		UnOrderedPair<String, Parent> up = new UnOrderedPair<>("k178", new Parent("parent"));
		UnOrderedPair<String, Child> uc = new UnOrderedPair<>("k179", new Child("child", "sc city"));
		UnOrderedPair<String, Parent> upp = new UnOrderedPair<>("k180", new Child("ccild", "ys city"));
		
		UnOrderedPair<?, ?> uAll = up;
		uAll = uc;
		uAll = upp;
		Object key = uAll.getKey();
		Parent v = uAll.getValue();
		
		String s = up.getKey();
		Parent pp = up.getValue();
		
		uc.getKey();
		uc.getValue();
	}
}

// type parameter V는 Parent의 하위 타입만 type argument(concrete type) 올 수 있다
// V extends Parent : bounded type parameter
public class UnOrderedPair<K, V extends Parent> implements Pair<K, V> {
	K key;
	V value;
	@Override
	public K getKey() {
		return key;
	}

	@Override
	public V getValue() {
		return value;
	}
	
	public UnOrderedPair(K key, V value) {
		this.key = key;
		this.value = value;
	}
}

class Parent {
	String name;
	public Parent(String name) {
		this.name = name;
	}
}
class Child extends Parent {
	String address;
	public Child(String name, String address) {
		super(name);
		this.address = address;
	}
}
