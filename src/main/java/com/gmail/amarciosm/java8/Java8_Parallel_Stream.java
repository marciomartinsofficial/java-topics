package com.gmail.amarciosm.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Java8_Parallel_Stream {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		
		list.parallelStream().forEach(System.out::println);
		
		System.out.println();
		
		list.stream().parallel().forEach(System.out::println);
		
		System.out.println();
		
		list.parallelStream().forEachOrdered(System.out::println);
		
		System.out.println();
		
		list.parallelStream()
				.findAny()
				.ifPresent(System.out::println);
		
		System.out.println();
		
		list.stream()
				.findAny()
				.ifPresent(System.out::println);
		
		System.out.println();
		
		list.parallelStream()
				.skip(1)
				.limit(2)
				.forEachOrdered(System.out::println);
		
		System.out.println();
		
		list.parallelStream()
				.unordered() // ignore order
				.skip(1)
				.limit(2)
				.forEachOrdered(System.out::println);

		System.out.println();
		
		Map<Integer, Boolean> map = list.parallelStream()
				.collect(Collectors.toMap(n -> n, n -> n % 2 == 0)); // many maps and ordered
		System.out.println(map);
		
		System.out.println();
		
		map = list.parallelStream()
				.collect(Collectors.toConcurrentMap(n -> n, n -> n % 2 == 0)); // only one map and unordered
		System.out.println(map);
		
		System.out.println();
		
		Map<Boolean, List<Integer>> group = list.parallelStream()
				.collect(Collectors.groupingBy(n -> n % 2 == 0)); // many maps and ordered
		System.out.println(group);
		
		System.out.println();
		
		group = list.parallelStream()
				.collect(Collectors.groupingByConcurrent(n -> n % 2 == 0)); // only one map and unordered
		System.out.println(group);
	}
	
}
