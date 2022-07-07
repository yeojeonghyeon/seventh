package com.scci.generic;

public class UnOrderedPair<K, V extends Number> implements Pair<K, V> {
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
