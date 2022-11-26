package com.gmail.amarciosm.java8;

import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;

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
		
		
		if(integerOptional.isPresent()) {
			System.out.println(integerOptional.get());
		}
		
		integerOptional.ifPresent(i -> System.out.println(i));
		
		integerOptional.orElse(2);
		
		integerOptional.orElseGet(() -> 1+1+1);
		
		try {
			integerOptional.orElseThrow(() -> new Exception("Oh no!"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		OptionalInt i = OptionalInt.of(0);
		OptionalDouble d = OptionalDouble.empty();
		OptionalLong l = OptionalLong.of(0L);
	}
	
}
