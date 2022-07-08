package com.scci.generic3;

class SuppliableDemo {
	public static void main(String[] args) {
		OrderedPair<String, Fruit> op = new OrderedPair<String, Fruit>("k110", new Fruit("summer", "water mellon"));
		Pair<String, Fruit> pa = op;
		Suppliable<Fruit> su = op;
		
		OrderedPair<String, Apple> oa = new OrderedPair<String, Apple>("k110", new Apple("Apple", "fall"));
		OrderedPair<Integer, Apple> oia = new OrderedPair<Integer, Apple>(1111, new Apple("Apple", "fall"));
		OrderedPair<Double, Apple> oda = new OrderedPair<Double, Apple>(111.1, new Apple("Apple", "fall"));
		SuppliableDemo.zoo(oia);
		SuppliableDemo.zoo(oda);
	}
	
	public static void foo(OrderedPair<?, ?> op) {
		
	}
	// upper bounded wildcards
	// OrderedPair<K, V>
	// Number의 하위 타입 가능, Fruit의 하위 타입 가능
	public static void zoo(OrderedPair<? extends Number, ? extends Fruit> op) {
		
	}
}

// K, V type parameter 선언
// Pair 인터페이스로 변수를 선언, 함수의 파라미터 선언, 리턴값으로 선언할 경우
// type parameter에 type argument를 전달, type argument는 concrete class type로 선언
// concrete type ( class, interface )
public interface Pair<K, V> {
	// 추상 함수
	// public abstract 생략된 형태
	// 인터페이스를 구현하거나, 추상함수가 있는 클래스(추상 클래스)를 상속하는 클래스에서 overriding 해야 함
	// 추상 클래스 : 추상 함수가 클래스 내부에 하나라도 존재하면 추상 클래스, 객체를 생성 불가
	K getKey();
	V getVal();
	
	void setKey(K key);
	void setVal(V val);
}

interface Suppliable<T> {
	T get();
}
// V extends Fruit, type parameter V 자리에는 Fruit의 하위 타입만 type argument로 올 수 있다
class OrderedPair<K, V extends Fruit> implements Pair<K, V>, Suppliable<V> {
	K key;
	V val;
	public OrderedPair(K key, V val) {
		this.key = key;
		this.val = val;
	}
	@Override
	public V get() {
		return val;
	}
	@Override
	public K getKey() {
		return key;
	}
	@Override
	public V getVal() {
		return val;
	}
	@Override
	public void setKey(K key) {
		this.key = key;
	}
	@Override
	public void setVal(V val) {
		this.val = val;
	}
}

class Fruit {
	String season;
	String name;
	public Fruit(String season, String name) {
		this.season = season;
		this.name = name;
	}
	public String getInfo() {
		return season + " " + name;
	}
}
class Apple extends Fruit {
	public Apple(String season, String name) {
		super(season, name);
	}
	public String getInfo() {
		return "Apple's getInfo : " + season + " " + name;
	}
}
