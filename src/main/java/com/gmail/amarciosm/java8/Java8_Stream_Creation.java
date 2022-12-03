package com.gmail.amarciosm.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.regex.Pattern;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Java8_Stream_Creation {

	public static void main(String[] args) {
		
		// collections
		List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5);
		integerList.stream().forEach(System.out::println);
		
		System.out.println();
		
		// Arrays
		Integer[] integerArray = new Integer[] {1, 2, 3, 4, 5};
		Arrays.stream(integerArray).forEach(System.out::println);
		
		System.out.println();
		
		// Stream.of
		Stream<String> stream = Stream.of("Hello", "my", "friend");
		stream.forEach(System.out::println);
		
		System.out.println();
		
		// Stream.iterate
		Stream.iterate(2, n -> n * 3).limit(5).forEach(System.out::println);
		
		System.out.println();
		
		// Stream.interate
		IntStream.range(10,15).forEach(System.out::println);
		
		System.out.println();
		
		// Random
		new Random().ints().limit(10).forEach(System.out::println);
		
		System.out.println();
		
		// Pattern
		String string = "Jesus Christ is the Lord";
		Pattern pattern = Pattern.compile(" ");
		pattern.splitAsStream(string).forEach(System.out::println);
	}
	
}
