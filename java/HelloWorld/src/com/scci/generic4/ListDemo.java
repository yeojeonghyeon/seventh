package com.scci.generic4;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
	public static void main(String[] args) {
		// ArrayList 객체를 생성해서, type parameter 자리에는 String을 전달
		// "java", "javascript", "generic", "type parameter", "type argument"
		// ArrayList 객체에 추가 시켜라
		
		// advanced for( : ), 이용해서 ArrayList 객체에 들어 있는 요소를 콘솔에 출력
		List<String> list = new ArrayList<String>();
		list.add("java");
		list.add("javascript");
		list.add("generic");
		list.add("type parameter");
		list.add("type argument");
		
		for(String ele : list) {
			System.out.println(ele);
		}
	}
}
