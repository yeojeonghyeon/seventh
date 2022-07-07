package com.scci.generic2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

class MovableDemo {
	public static void main(String[] args) {
		Movable<Integer> m;
		Vehicle<Integer, ICEngine> v = new Vehicle<Integer, ICEngine>(new ICEngine(), "1234");
		m = v;
		
		m.move(1);
		
		Collection<Vehicle<Integer, ICEngine>> c;
		List<Vehicle<Integer, ICEngine>> l = null;
		ArrayList<Vehicle<Integer, ICEngine>> al = null;
		c = l;
		c = al;
		l = al;
	}
}

public interface Movable<T> {
	boolean move(T energy);
}
interface Engine{
	boolean start(String key);
}
class ICEngine implements Engine  {
	@Override
	public boolean start(String key) {
		System.out.println("ICEngine started");
		return true;
	}
}
class Vehicle<T, S extends Engine> implements Movable<T> {
	S engine;
	String key;
	@Override
	public boolean move(T energy) {
		System.out.println("Vehicle moved");
		return true;
	}
	public Vehicle(S engine, String key) {
		this.engine = engine;
		this.key = key;
	};
	
	public boolean startEngine() {
		if ( engine != null ) {
			return engine.start(key);
		}else {
			return false;
		}
	}
}