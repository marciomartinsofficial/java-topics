package com.gmail.amarciosm.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Java8_Stream_Collections {

	public static void main(String[] args) {
		List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5);
		
		integerList.forEach(i -> System.out.println(i));
		System.out.println();
		
		// Arrys.asList produces a list from which it is impossible to remove elements.
		integerList = new ArrayList<Integer>(integerList);
		integerList.removeIf(i -> i % 2 == 0);
		integerList.forEach(i -> System.out.println(i));
		System.out.println();
		
		integerList.replaceAll(i -> i * 2);
		integerList.forEach(i -> System.out.println(i));
		System.out.println();
		
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "Jesus");
		map.put(2, "Christ");
		map.put(3, "is");
		map.put(4, "the");
		map.put(5, "Lord");
		
		map.forEach((k, v) -> System.out.println(k + " " + v));
		System.out.println();
		
		map.compute(1, (k, v) -> "_" + v);
		map.forEach((k, v) -> System.out.println(k + " " + v));
		System.out.println();
		
		map.compute(6, (k, v) -> "_" + v);
		map.forEach((k, v) -> System.out.println(k + " " + v));
		System.out.println();
		
		map.merge(2, "!", (v, z) -> v + z);
		map.forEach((k, v) -> System.out.println(k + " " + v));
		System.out.println();
		
		map.merge(7, "!", (v, z) -> v + z);
		map.forEach((k, v) -> System.out.println(k + " " + v));
		System.out.println();
		
		map.replaceAll((k, v) -> v + "!");
		map.forEach((k, v) -> System.out.println(k + " " + v));
		System.out.println();
	}
	
}
