package com.scci.generic;

import java.util.ArrayList;
import java.util.List;

import com.scci.inheritance2.Animal;

public class Zoo<T extends Animal> {
	List<T> lst;
	public Zoo(List<T> lst) {
		this.lst = lst;
	}
	public List<T> getLst(){
		return lst;
	}
}

