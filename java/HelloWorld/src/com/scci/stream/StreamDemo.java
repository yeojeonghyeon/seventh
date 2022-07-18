package com.scci.stream;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamDemo {
	public static void main(String[] args) {
		String[][] namesArray = new String[][]{
	        {"kim", "taeng"}, {"mad", "play"},
	        {"kim", "mad"}, {"taeng", "play"}
	    };
	    
	    Set<String> namesWithFlatMap = Arrays.stream(namesArray)
	    		.flatMap(innerArray -> Arrays.stream(innerArray))
	    		.filter(name -> name.length()>3)
	    		.collect(Collectors.toSet());
	    
	    HashSet<String> hs = Arrays.stream(namesArray).map(inner -> Arrays.stream(inner)
	    		.filter(name -> name.length()>3)
	    		.collect(Collectors.toSet()))
	    .collect(HashSet::new, Set::addAll, Set::addAll);
	}
}
