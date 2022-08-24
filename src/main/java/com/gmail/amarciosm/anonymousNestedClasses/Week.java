package com.gmail.amarciosm.anonymousNestedClasses;

import java.util.Iterator;

/**
 * Example static nested class
 */
public class Week {

	private Integer year;
	private Integer weeknr;
	
	
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	public Integer getWeeknr() {
		return weeknr;
	}
	public void setWeeknr(Integer weeknr) {
		this.weeknr = weeknr;
	}
	
	public WeekIterator getIterator() {
		return new WeekIterator(year, weeknr);
	}
	
	public static class WeekIterator implements Iterator {
		public WeekIterator(Integer year, Integer weeknr) {
			
		}

		public boolean hasNext() {
			// TODO Auto-generated method stub
			return false;
		}

		public Object next() {
			// TODO Auto-generated method stub
			return null;
		}
	}
	
}
