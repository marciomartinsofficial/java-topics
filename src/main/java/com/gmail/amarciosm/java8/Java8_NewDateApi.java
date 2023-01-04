package com.gmail.amarciosm.java8;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;
import java.time.temporal.UnsupportedTemporalTypeException;

public class Java8_NewDateApi {

	public static void main(String[] args) {
		partOne();
		partTwo();
		partThree();
	}
	
	private static void partThree() {
		Duration duration = Duration.ofDays(1);
		System.out.println(duration);
		
		duration = Duration.ofMinutes(50);
		System.out.println(duration);
		System.out.println(duration.plusDays(1));
		
		LocalTime localTime = LocalTime.of(1, 30);
		LocalTime localTimeNow = LocalTime.now();
		duration = Duration.between(localTime, localTimeNow);
		System.out.println(duration);
		
		try {
			LocalDate birthday = LocalDate.of(1987, 3, 24);
			LocalDate today = LocalDate.now();
			duration = Duration.between(birthday, today);
			System.out.println(duration);
		} catch (UnsupportedTemporalTypeException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	
	private static void partTwo() {
		Period period = Period.of(2, 3, 1);
		System.out.println(period);
		
		LocalDate localDate1 = LocalDate.of(2022, Month.JANUARY, 1);
		LocalDate localDate2 = localDate1.plusMonths(2);
		period = Period.between(localDate1, localDate2);
		System.out.println(period);
		
		period = localDate1.until(localDate2);
		System.out.println(period);
		
		LocalDate birthday = LocalDate.of(1987, 3, 24);
		LocalDate today = LocalDate.now();
		period = Period.between(birthday, today);
		System.out.println(period);
	}

	private static void partOne() {
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
