package com.gmail.amarciosm.java8;

import java.util.Optional;

public class OptionalPractice {

	public static void main(String[] args) {
		
		// get a Optional full
		Integer integer = 1;
		Optional<Integer> integerOptional = Optional.of(integer);
		System.out.println(integerOptional);
		
		// get a Optional empty
		integerOptional = Optional.empty();
		System.out.println(integerOptional);
		
		// get a Optional full or empty
		integerOptional = Optional.ofNullable(null);
		System.out.println(integerOptional);
		integerOptional = Optional.ofNullable(integer);
		System.out.println(integerOptional);
	}
	
}
