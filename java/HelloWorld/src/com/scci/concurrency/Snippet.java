package com.scci.concurrency;

import java.util.Arrays;
import java.util.List;

public class Snippet {
	static class Dummy{
		int ordinal = 0 ;
		void setOrdinal(int p) {
			this.ordinal = p;
		}
		public String toString() {
			return ordinal+"";
		}
	}
	public static void main(String[] args) {
		List<Dummy> list = Arrays.asList(new Dummy(), new Dummy());
		Dummy dummy = new Dummy();
		list.forEach(s -> {
			s.setOrdinal(dummy.ordinal++);
		});
		
		list.forEach(System.out::println);
	}
}

