package com.scci.beans;

import java.util.List;
import java.util.Map;

public class Books {
	private List<String> myList;
	private Map<String, String> myMap;

	public Map<String, String> getMyMap() {
		return myMap;
	}
	public void setMyMap(Map<String, String> myMap) {
		this.myMap = myMap;
	}
	public List<String> getMyList() {
		return myList;
	}
	public void setMyList(List<String> myList) {
		this.myList = myList;
	}
	public Books() {}
}
