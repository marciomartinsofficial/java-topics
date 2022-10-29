package com.gmail.amarciosm.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamPractice {

	public static void main(String args[]) {
		List<Integer> integerList = Arrays.asList(1,3,3,4,6,7,8,9,11,14);
		
		integerList.stream().forEach(i -> System.out.println(i));
		
		Stream<Integer> map = integerList.stream()
				.skip(2)
				.limit(5)
				.filter(i -> i % 2 == 0)
				.map(i -> i * 3);
		
		System.out.println(map.collect(Collectors.toList()));
		
		Long numInteger = integerList.stream().count();
		
		System.out.println(numInteger);
		
		Optional<Integer> minInteger = integerList.stream().min(Comparator.naturalOrder());
		
		System.out.println(minInteger);
		
		List<Integer> newListIntegers = integerList.stream().collect(Collectors.toList());
		
		System.out.println(newListIntegers);
		
		Map<Boolean, List<Integer>> isEven = integerList.stream().collect(Collectors.groupingBy(i -> i % 2 == 0));
		
		System.out.println(isEven);
		
		String descriptiom = integerList.stream().map(i -> String.valueOf(i)).collect(Collectors.joining(";"));
		
		System.out.println(descriptiom);
	}
	
}
