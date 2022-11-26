package com.gmail.amarciosm.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReducePractice {

	public static void main(String[] args) {
		
		List<Integer> integerList = Arrays.asList(1, 2, 5, 6, 9);
		
		// The operation need to be associative
		Optional<Integer> resultOptional = integerList.stream().reduce((x, y) -> x + y);
		resultOptional.ifPresent(n -> System.out.println(n));
		
		// 1 * x = x | 0 + z = z | "" + "String" = "String"
		Integer result = integerList.stream().reduce(1 , (x, y) -> x * y);
		System.out.println(result);
		
		result = integerList.stream().reduce(Integer.MAX_VALUE , (x, y) -> Math.min(x, y));
		System.out.println(result);
		
		String concat = integerList.stream()
				.reduce("", // identity
						(n1, n2) -> n1.toString().concat(n2.toString()), // acumulation
						(s1, s2) -> s1 + s2); // combination (only parallel programming)
		System.out.println(concat);
	}
	
}
