package com.scci.generic2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDemo {
	public static void main(String[] args) {
		Stream<Fruit> fruits2 = Stream.of(new Fruit("1", "banana"), new Fruit("2", "apple"),
		        new Fruit("3", "mango"), new Fruit("4", "kiwi"),
		        new Fruit("5", "peach"), new Fruit("6", "cherry"),
		        new Fruit("7", "lemon"));
		Stream<Fruit> fruits3 = Stream.of(new Fruit("1", "banana"), new Fruit("2", "apple"),
		        new Fruit("3", "mango"), new Fruit("4", "kiwi"),
		        new Fruit("5", "peach"), new Fruit("6", "cherry"),
		        new Fruit("7", "lemon"));
		Map<String, String> map = fruits2.collect(Collectors.toMap(Fruit::getId, Fruit::getName));
		
		fruits3.filter((fruit)->fruit.getId()=="3").forEach(fruit->System.out.println(fruit.getName()));;
	}
}

class StreamDemo2 {
	public static void main(String[] args) {
		Stream<String> stream = Stream.of("a", "b", "c");
		Stream<String> stream1 = Arrays.stream(new String[] {"a", "b"});
		stream.sorted();
		
		IntStream intStream = IntStream.range(0, 100);
		intStream.forEach(System.out::println);
		
		List<? extends Fruit> f = null;
		List<? extends Apple> la = null;
		List<Fruit> lf = null;
		f = lf;
		f = la;
		method(f);
	}
	public static void method(List<? extends Fruit> f) {
		
	}
}

class Fruit {
    public String id;
    public String name;
    Fruit(String id, String name) {
        this.id = id;
        this.name = name;
    }
    Fruit(String name) {
        this.name = name;
    }
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
}
class Apple extends Fruit {
	Apple(String name) {
		super(name);
	}
}
