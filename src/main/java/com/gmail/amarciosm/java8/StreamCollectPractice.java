package com.gmail.amarciosm.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
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
		
		Double average = integerList.stream()
				.collect(Collectors.averagingInt(n -> n.intValue()));
		System.out.println(average);
		
		Long sum = integerList.stream()
				.collect(Collectors.summingLong(n -> n.intValue()));
		System.out.println(sum);
		
		IntSummaryStatistics statistics = integerList.stream()
				.collect(Collectors.summarizingInt(n -> n.intValue()));
		System.out.println(statistics);
		System.out.println(statistics.getCount());
		System.out.println(statistics.getMax());
		
		Long count = integerList.stream()
				.collect(Collectors.counting());
		System.out.println(count);
		
		Optional<Integer> max = integerList.stream()
				.collect(Collectors.maxBy(Comparator.naturalOrder()));
		System.out.println(max);
		
		Map<Integer, List<Integer>> group = integerList.stream()
				.collect(Collectors.groupingBy((n) -> n % 2));
		System.out.println(group);
		
		Map<Boolean, List<Integer>> partition = integerList.stream()
				.collect(Collectors.partitioningBy(n -> n % 2 == 0));
		System.out.println(partition);
		
		Map<Integer, Integer> map = integerList.stream()
				.collect(Collectors.toMap(n -> n, n -> n * 2));
		System.out.println(map);
	}
	
}
