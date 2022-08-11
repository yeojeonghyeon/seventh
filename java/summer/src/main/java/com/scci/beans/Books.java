package com.scci.beans;

import java.util.List;
import java.util.Map;

public class Books {
	private List<String> myList;
	private Map<String, String> map;
	public Map<String, String> getMap() {
		return map;
	}
	public void setMap(Map<String, String> map) {
		this.map = map;
	}
	public List<String> getMyList() {
		return myList;
	}
	public void setMyList(List<String> myList) {
		this.myList = myList;
	}
	public Books() {}
}
