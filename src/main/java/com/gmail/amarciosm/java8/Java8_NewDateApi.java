package com.gmail.amarciosm.java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class Java8_NewDateApi {

	public static void main(String[] args) {
		LocalDate localDate = LocalDate.of(2022, 12, 20);
		System.out.println(localDate);
		
		localDate = LocalDate.of(2000, Month.DECEMBER, 30);
		System.out.println(localDate);
		
		localDate = LocalDate.now();
		System.out.println(localDate);
		
		LocalTime localTime = LocalTime.now();
		System.out.println(localTime);
		
		localTime = LocalTime.of(13, 20);
		System.out.println(localTime);
		
		localTime = LocalTime.of(13, 20, 4);
		System.out.println(localTime);
		
		localTime = LocalTime.of(13, 20, 5, 20);
		System.out.println(localTime);
		
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println(localDateTime);
		
		localDateTime = LocalDateTime.of(localDate, localTime);
		System.out.println(localDateTime);
		
		localDateTime = LocalDateTime.of(2020, Month.JULY, 17, 7, 55, 22, 145281456);
		System.out.println(localDateTime);
	}
	
}
