package com.scci.generic;

public interface Pair<K, V> {
	public abstract K getKey();
	public abstract V getValue();
}

class OrderedPair<K, V> implements Pair<K, V>{
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
	public OrderedPair(K key, V value) {
		this.key = key;
		this.value = value;
	}
}

class PairDemo {
	public static void main(String[] args) {
		OrderedPair<String, Integer> pc = new OrderedPair<String, Integer>("k16", 123);
		Pair<String, Integer> pi = pc; // covariant, 상위 타입 변수에 사위 타입을 할당 할 수 있는 것
		
//		OrderedPair<String, Dummy> pd = pc; // 불가
//		pi = pd; // 불가능
		
		OrderedPair<String, GenericPack<Dummy>> pg = 
				new OrderedPair<String, GenericPack<Dummy>>("k17", new GenericPack<Dummy>(new Dummy()));
	}
}