package com.scci.generic;

public interface P<T> {
	T get();
}

class C<T> implements P<Dummy>{
	T item;
	@Override
	public Dummy get() {
		return new Dummy();
	}
	public C(T item) {
		this.item = item;
	}
}

class PDemo {
	public static void main(String[] args) {
		P<Dummy> pi = new C<String>("abc");
		pi = new C<GenericPack<Dummy>>(new GenericPack<Dummy>(new Dummy()));
	}
}