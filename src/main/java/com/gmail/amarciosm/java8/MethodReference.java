package com.gmail.amarciosm.java8;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MethodReference {

	public static void main(String[] args) {
		
		List<Integer> integerList = Arrays.asList(1, 2, 3);
		
		integerList.stream()
				.map(MethodReference::plusOne)
				.forEach(System.out::println);
		
		integerList.stream()
				.map(BigDecimal::new)
				.forEach(System.out::println);
		
		BigDecimal bigDecimal = new BigDecimal(2);
		integerList.stream()
				.map(BigDecimal::new)
				.map(bigDecimal::multiply)
				.forEach(System.out::println);
	}
	
	public static Integer plusOne(Integer i) {
		return i+1;
	}
 	
}
