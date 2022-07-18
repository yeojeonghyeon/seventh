package com.scci.generic4;

import java.util.ArrayList;
import java.util.List;

public interface Pair<K, V> {
	// public abstract
	public abstract K getKey();
	public abstract V getValue();
}

class OrderedPair<K, V> implements Pair<K, V>{
	// 인스턴스 변수
	K key;
	V value;
	public OrderedPair(K key, V value) {
		this.key = key;
		this.value = value;
	}
	
	@Override
	public K getKey() {
		return key;
	}
	@Override
	public V getValue() {
		return value;
	}
}

class NotOrderedPair<K, V extends Box> implements Pair<K, V>{
	K key;
	V value;
	public NotOrderedPair(K key, V value) {
		this.key = key;
		this.value = value;
	}
	@Override
	public K getKey() {
		// TODO Auto-generated method stub
		return key;
	}

	@Override
	public V getValue() {
		// TODO Auto-generated method stub
		return value;
	}
	
}

class Box{
	Object item;
	public Box(Object item) {
		this.item = item;
	}
	Object getItem(){
		return item;
	}
}
class GBox<E>{
	E item;
	public GBox(E item) {
		this.item = item;
	}
	E getItem() {
		return item;
	}
}

class PairDemo{
	public static void main(String[] args) {
		// Pair interface 변수 선언
		// key "key", Box 객체 레퍼런스
		
		// key "key", GBox type parameter : String
		// Pair K : String, V : GBox<String>
		Pair<String, Box> sb1 = new OrderedPair<String, Box>("key1", new Box("item1"));
		Pair<String, Box> sb2 = new OrderedPair<String, Box>("key2", new Box("item2"));
		Pair<String, GBox<String>> p2 = new OrderedPair<String, GBox<String>>("key", new GBox<String>("item"));
		
		// List<> list = new ArrayList<>();
		List<Pair<String, Box>> list = new ArrayList<Pair<String, Box>>();
		list.add(sb1);
		list.add(sb2);
		
		List<Pair<String, GBox<String>>> list1 = new ArrayList<>();
		list1.add(p2);
		
		System.out.println(PairDemo.<String, Box>compare(sb1, sb2));
		
		NotOrderedPair
	}
	
	public static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2){
		return	p1.getKey().equals(p2.getKey()) && p1.getValue().equals(p2.getValue());
	}
}