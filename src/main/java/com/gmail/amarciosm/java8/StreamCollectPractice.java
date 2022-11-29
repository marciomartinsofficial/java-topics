package com.gmail.amarciosm.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class StreamCollectPractice {

	public static void main(String[] args) {
		List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6);
		System.out.println(integerList);
		
		List<Integer> list = integerList.stream()
				.collect(Collectors.toList());
		System.out.println(list);
		
		Set<Integer> set = integerList.stream()
				.collect(Collectors.toSet());
		System.out.println(set);
		
		TreeSet<Integer> treeSet = integerList.stream()
				.collect(Collectors.toCollection(() -> new TreeSet<>())); // any collect
		System.out.println(treeSet);
		
		String joing = integerList.stream()
				.map(n -> n.toString())
				.collect(Collectors.joining());
		System.out.println(joing);
		
		String joingHyphen = integerList.stream()
				.map(n -> n.toString())
				.collect(Collectors.joining(" - "));
		System.out.println(joingHyphen);		
	}
	
}
